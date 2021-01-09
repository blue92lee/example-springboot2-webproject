package com.example.sm.springboot.web.dto;

import com.example.sm.springboot.domain.posts.Posts;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostsListResponseDto {

    private Long id;
    private String title;
    private String author;
    private LocalDateTime modifiedDate;

    public PostsListResponseDto(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.author = entity.getAuthor();
        //TODO Posts에 modifiedDate를 만들지 않았는데 어떻게 사용함? 모르겠으니 빼고 진행.
        //this.modifiedDate = entity.getModifiedDate();
    }
}
