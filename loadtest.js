import http from "k6/http";
import {sleep, check} from "k6";


//Load Test
export let options ={
    insecureSkipTLSVerify : true,
    noConnectionReuse : false,
    stages:[
        {duration : '30s', target : 150},
        {duration : '1m', target : 150},
        {duration: '30s', target: 0}
    ],
    tresholds:{
        http_req_duration:['p(99)<200'],
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

//Spike Test

//Stress Test