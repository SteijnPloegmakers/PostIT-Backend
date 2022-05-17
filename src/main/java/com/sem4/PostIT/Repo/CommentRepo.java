package com.sem4.PostIT.Repo;

import com.sem4.PostIT.Model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CommentRepo extends JpaRepository<Comment, UUID> {
}
