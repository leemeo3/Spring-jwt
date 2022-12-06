package com.sparta.board.dto;


import com.sparta.board.entity.Board;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter

public class BoardResponseDto extends StatusResponseDto {
    private Long id;
    private String title;
    private String name;
    private String contents;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

    public BoardResponseDto(Board board) {
        super(true, 200, "게시글 등록 성공");
        this.id = board.getId();
        this.title = board.getTitle();
        this.name = board.getName();
        this.contents = board.getContents();
        this.createdAt  = board.getCreatedAt();
        this.modifiedAt = board.getModifiedAt();
    }
}