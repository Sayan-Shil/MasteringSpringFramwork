package com.app.spring.springcontext.beanscope.Prototype;

import com.app.spring.springcontext.beanscope.Prototype.config.ProjectConfig;
import com.app.spring.springcontext.beanscope.Prototype.entity.Comment;
import com.app.spring.springcontext.beanscope.Prototype.services.CommentService;
import com.app.spring.springcontext.beanscope.Prototype.services.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        Comment comment = new Comment("I am Sayan");
        Comment comment2 = new Comment("I love java");

        var context= new AnnotationConfigApplicationContext(ProjectConfig.class);

        UserService userService = context.getBean(UserService.class);
        CommentService  commentService = context.getBean(CommentService.class);

        commentService.saveComment(comment);
        commentService.saveComment(comment2);
        userService.getComments();
    }
}
