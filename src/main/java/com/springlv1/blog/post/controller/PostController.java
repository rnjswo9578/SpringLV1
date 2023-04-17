package com.springlv1.blog.post.controller;

import com.springlv1.blog.post.dto.IsSuccessDto;
import com.springlv1.blog.post.dto.PostRequestDto;
import com.springlv1.blog.post.dto.PostResponseDto;
import com.springlv1.blog.post.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {
    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping
    public PostResponseDto createPost(@RequestBody PostRequestDto postRequestDto){
        return postService.createPost(postRequestDto);
    }

    @GetMapping("/{id}")
    public PostResponseDto getPost(@PathVariable Long id){
        return postService.getPost(id);
    }


    @GetMapping("/posts")
    public List<PostResponseDto> getPostList(){
        return postService.getPostList();
    }

    @PutMapping("/{id}")
    public PostResponseDto updatePost(@PathVariable Long id, @RequestBody PostRequestDto postRequestDto){
        return postService.updatePost(postRequestDto, id);
    }

    @DeleteMapping("/{id}")
    public IsSuccessDto deletePost(@PathVariable Long id, @RequestBody PostRequestDto postRequestDto){
        return postService.deletePost(id, postRequestDto);
    }

}
