package com.souza.demo.repository;

import com.souza.demo.entity.Post;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Repository
public class PostRepository {
    private final RestTemplate restTemplate;


    public PostRepository(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<Post> findAll(){
        String url = "https://jsonplaceholder.typicode.com/posts";
        Post[] posts = restTemplate.getForObject(url, Post[].class);
        return List.of(posts);
    }
}
