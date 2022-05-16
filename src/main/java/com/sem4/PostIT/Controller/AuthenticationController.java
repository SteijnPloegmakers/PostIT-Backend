package com.sem4.PostIT.Controller;

import com.sem4.PostIT.Model.User;
import com.sem4.PostIT.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class AuthenticationController {

    @GetMapping(value = "/api")
    public String getPage() {return "Welcome on PostIT!";}

    @Autowired
    private UserRepo userrepo;

    @PostMapping(value = "api/login/oauth2/google")
    public String saveGoogleAccount(User googleAccount){

        userrepo.save(googleAccount);

        return "Saved GoogleAccount";
    }
}
