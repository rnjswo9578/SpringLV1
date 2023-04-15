package com.springlv1.blog.post.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IsSuccessDto {
    private boolean success;

    public IsSuccessDto(boolean success) {
        this.success = success;
    }
}
