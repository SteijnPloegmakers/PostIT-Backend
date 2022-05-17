package com.sem4.PostIT.Service;

import com.sem4.PostIT.Model.Comment;
import com.sem4.PostIT.Repo.CommentRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CommentService {

    @Autowired
    private CommentRepo commentRepo;

    public List<Comment> getAllComments(){
        return commentRepo.findAll();
    }
}
