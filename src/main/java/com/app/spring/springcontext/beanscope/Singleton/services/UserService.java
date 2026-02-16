package com.app.spring.springcontext.beanscope.Singleton.services;

import com.app.spring.springcontext.beanscope.Singleton.entity.Comment;
import com.app.spring.springcontext.beanscope.Singleton.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    private final CommentRepository commentRepository;

    @Autowired
    public UserService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public void getComments() {
        for(Comment comment : commentRepository.getComments()) {
            System.out.println(comment.getComment());
        }
        System.out.println("Repository ID: " +commentRepository.hashCode());
    }
}
