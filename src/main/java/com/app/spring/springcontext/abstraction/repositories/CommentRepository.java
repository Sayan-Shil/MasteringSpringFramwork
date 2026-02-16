package com.app.spring.springcontext.abstraction.repositories;

import com.app.spring.springcontext.abstraction.entity.Comment;

public interface CommentRepository {
    void saveComment(Comment comment);
}
