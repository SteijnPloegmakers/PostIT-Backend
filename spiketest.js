import http from "k6/http";
import {sleep, check} from "k6";


//Spike Test
export let options ={
    insecureSkipTLSVerify : true,
    noConnectionReuse : false,
    stages:[
        {duration : '20s', target : 20},
        {duration : '5s', target : 250},
        {duration: '20s', target: 0}
    ],
    tresholds:{
        http_req_failed:['rate<0.01']
    }
}

const base_url = 'http://localhost:8080'
export default () => {
    const responses = http.batch([
        ['GET', `${base_url}/api/songs`]
    ])
    check(responses[0], {
        'status is 200': res => res.status === 200
    })
    sleep(1);
}