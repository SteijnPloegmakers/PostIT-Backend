package com.sem4.PostIT.Controller;

import com.sem4.PostIT.Model.Post;
import com.sem4.PostIT.Repo.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class PostController {

    @Autowired
    private PostRepo postRepo;

    @PostMapping(value = "api/post/save")
    public String savePost(Post post){

        postRepo.save(post);

        return "Saved Post";
    }
}
