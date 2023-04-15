package com.springlv1.blog.post.service;

import com.springlv1.blog.post.dto.IsSuccessDto;
import com.springlv1.blog.post.dto.PostRequestDto;
import com.springlv1.blog.post.dto.PostResponseDto;
import com.springlv1.blog.post.entity.Post;
import com.springlv1.blog.post.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService{

    private final PostRepository postRepository;

    @Autowired
    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public PostResponseDto createPost(PostRequestDto postRequestDto) {
        Post post = new Post(postRequestDto);
        Long id = postRepository.save(post).getId();
        return new PostResponseDto(checkPost(id));
    }

    @Override
    public PostResponseDto getPost(Long id) {
        return new PostResponseDto(checkPost(id));
    }

    @Override
    public List<PostResponseDto> getPostList() {
        //findAll()은 List<Post> 형으로 반환 ->stream을 통해 매핑 -> new PostResponseDto로 리턴타입 맞추기
        return postRepository.findAll().stream().map(PostResponseDto::new).collect(Collectors.toList());
    }

    @Override
    @Transactional
    public PostResponseDto updatePost(PostRequestDto postRequestDto, Long id) {
        Post post = checkPost(id);
        if (postRequestDto.getPassword().equals(post.getPassword())) post.update(postRequestDto);
        return new PostResponseDto(post);
    }

    @Override
    public IsSuccessDto deletePost(Long id, PostRequestDto postRequestDto) {
        Post post = checkPost(id);
        if (postRequestDto.getPassword().equals(post.getPassword())) {
            postRepository.delete(post);
            return new IsSuccessDto(true);
        }
        return new IsSuccessDto(false);
    }

    private Post checkPost(Long id){
        return  postRepository.findById(id).orElseThrow(
                () -> new NullPointerException("해당 포스트가 없습니다.!!!")
        );
    }
}
