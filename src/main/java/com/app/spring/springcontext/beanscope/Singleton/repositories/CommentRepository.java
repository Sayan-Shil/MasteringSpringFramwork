package com.app.spring.springcontext.beanscope.Singleton.repositories;

import com.app.spring.springcontext.beanscope.Singleton.entity.Comment;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CommentRepository {
    List<Comment> comments = new ArrayList<>();
    public void save(Comment comment) {
        comments.add(comment);
        System.out.println("Comment Save in Repository");
    }
    public List<Comment> getComments() {
        return comments;
    }
}
