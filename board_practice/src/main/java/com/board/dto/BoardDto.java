package com.board.dto;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import com.board.entity.Board;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class BoardDto {
	
	private Long boardId;
	private String boardTitle;
	private String boardContent;
	@CreationTimestamp
	private LocalDateTime createdTime;
	
	private Long categoryId;
	
	public static BoardDto toDto(Board entity) {
		BoardDto boardDto = BoardDto.builder()
										.boardId(entity.getBoardId())
										.boardTitle(entity.getBoardTitle())
										.boardContent(entity.getBoardContent())
										.createdTime(entity.getCreatedTime())
										.categoryId(entity.getBoardCategory().getCategoryId())
										.build();
		return boardDto;
		
	}
}
