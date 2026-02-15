package com.app.spring.abstraction.repositories;

import com.app.spring.abstraction.entity.Comment;

public interface CommentRepository {
    void saveComment(Comment comment);
}
