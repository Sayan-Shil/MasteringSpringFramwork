package com.app.spring.abstraction.repositories;

import com.app.spring.abstraction.entity.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("file")
public class FileCommentRepository implements CommentRepository {
    @Override
    public void saveComment(Comment comment) {
        System.out.println("Comment Saved in File System ");
    }
}
