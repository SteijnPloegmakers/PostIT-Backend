package com.sem4.PostIT.Service;

import com.sem4.PostIT.Model.User;
import com.sem4.PostIT.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


    @Autowired
    private UserRepo userRepo;

    public List<User> getAllUsers(){
        return userRepo.findAll();
    }
}
