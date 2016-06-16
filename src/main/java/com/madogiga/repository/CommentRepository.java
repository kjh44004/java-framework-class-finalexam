package com.madogiga.repository;

import com.madogiga.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by MIYEON on 2016-06-16.
 */
@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

}