package com.sem4.PostIT.Service;

import com.sem4.PostIT.Model.Post;
import com.sem4.PostIT.Repo.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepo postRepo;

    public List<Post> getAllPosts(){
        return postRepo.findAll();
    }
}
