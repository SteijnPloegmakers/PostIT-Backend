package com.sem4.PostIT.Controller;

import com.sem4.PostIT.Model.Channel;
import com.sem4.PostIT.Model.Post;
import com.sem4.PostIT.Repo.PostRepo;
import com.sem4.PostIT.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class PostController {

    @Autowired
    private PostRepo postRepo;

    @Autowired
    private PostService postService;

    @PostMapping(value = "api/post/save")
    public String savePost(Post post){

        postRepo.save(post);

        return "Saved Post";
    }

    @GetMapping(value = "api/posts")
    public List<Post> getChannel() {return postService.getAllPosts();}
}
