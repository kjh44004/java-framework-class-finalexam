package com.madogiga.repository;

import com.madogiga.model.Comment;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by MIYEON on 2016-06-16.
 */
public interface CommentRepository extends PagingAndSortingRepository<Comment, Integer> {
}