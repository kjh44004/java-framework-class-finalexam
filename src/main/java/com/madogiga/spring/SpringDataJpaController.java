package com.madogiga.spring;

import com.madogiga.model.Comment;
import com.madogiga.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by MIYEON on 2016-06-17.
 */

@Controller
@EnableAutoConfiguration
@RequestMapping("/data")
public class SpringDataJpaController {

    @Autowired
    CommentRepository commentRepository;

    @RequestMapping("/list")
    public List<Comment> list() {
        return (List<Comment>) commentRepository.findAll();
    }
}