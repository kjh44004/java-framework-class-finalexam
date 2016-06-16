package com.madogiga.spring;

import com.madogiga.model.Comment;
import com.madogiga.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by MIYEON on 2016-06-17.
 */
@RestController
public class SpringBootController {

    @Autowired
    private CommentRepository commentRepository;

    @RequestMapping(value = "/comments", method={RequestMethod.GET})
    public ResponseEntity<?> list(@RequestParam(required = false, defaultValue = "0") Integer page, @RequestParam(required = false, defaultValue = "15") Integer size) {
        Page<Comment> comments = commentRepository.findAll(new PageRequest(page, size));
        return new ResponseEntity<>(comments, HttpStatus.OK);
    }

    @RequestMapping(value = "/comment/{id}", method = {RequestMethod.POST, RequestMethod.PUT})
    public ResponseEntity<?> save(@PathVariable("id") Integer id, @RequestBody Comment comment) {
        Comment result = commentRepository.save(comment);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @RequestMapping(value = "/comment/{id}", method = {RequestMethod.GET})
    public ResponseEntity<?> save(@PathVariable("id") Integer id) {
        Comment result = commentRepository.findOne(id);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}