package com.app.spring.springcontext.beanscope.Prototype.services;

import com.app.spring.springcontext.beanscope.Prototype.entity.Comment;
import com.app.spring.springcontext.beanscope.Prototype.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    private final CommentRepository commentRepository;

    @Autowired
    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public void saveComment(Comment comment) {
        commentRepository.save(comment);
        System.out.println("Repository ID: " +commentRepository.hashCode());
    }
}
