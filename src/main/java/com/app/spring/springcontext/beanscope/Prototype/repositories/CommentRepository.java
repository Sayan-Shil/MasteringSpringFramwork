package com.app.spring.springcontext.beanscope.Prototype.repositories;

import com.app.spring.springcontext.beanscope.Prototype.entity.Comment;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
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
