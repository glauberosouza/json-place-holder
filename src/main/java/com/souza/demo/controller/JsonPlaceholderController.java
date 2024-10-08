package com.souza.demo.controller;

import com.souza.demo.entity.Post;
import com.souza.demo.service.JsonPlaceholderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class JsonPlaceholderController {
    private final JsonPlaceholderService jsonPlaceholderService;

    public JsonPlaceholderController(JsonPlaceholderService jsonPlaceholderService) {
        this.jsonPlaceholderService = jsonPlaceholderService;
    }
    @GetMapping("/posts")
    public ResponseEntity<List<Post>> getPosts(){
        List<Post> allPosts = jsonPlaceholderService.getPosts();
        return ResponseEntity.status(HttpStatus.OK).body(allPosts);
    }
}
