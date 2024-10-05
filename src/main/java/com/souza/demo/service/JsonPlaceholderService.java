package com.souza.demo.service;

import com.souza.demo.entity.Post;
import com.souza.demo.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JsonPlaceholderService {
    private final PostRepository postRepository;

    public JsonPlaceholderService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }
    
    public List<Post> getPosts(){
        return postRepository.findAll();
    }
}