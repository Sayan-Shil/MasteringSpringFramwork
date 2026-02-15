package com.app.spring.abstraction;

import com.app.spring.abstraction.config.ProjectConfig;
import com.app.spring.abstraction.entity.Comment;
import com.app.spring.abstraction.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        CommentService service = context.getBean(CommentService.class);
        // Automatically service object has been created with repo and proxy beans
        Comment Comment  = new Comment();
        Comment.setComment("This is a comment");

        service.addComment(Comment);
    }
}
