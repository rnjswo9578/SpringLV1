package com.springlv1.blog.post.service;


import com.springlv1.blog.post.dto.IsSuccessDto;
import com.springlv1.blog.post.dto.PostRequestDto;
import com.springlv1.blog.post.dto.PostResponseDto;

import java.util.List;

public interface PostService {
    PostResponseDto createPost(PostRequestDto postRequestDto);

    PostResponseDto getPost(Long id);

    List<PostResponseDto> getPostList();

    PostResponseDto updatePost(PostRequestDto postRequestDto, Long id);
    IsSuccessDto deletePost(Long id, PostRequestDto postRequestDto);
}
