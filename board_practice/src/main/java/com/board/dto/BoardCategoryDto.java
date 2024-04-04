package com.board.dto;

import com.board.entity.BoardCategory;

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

public class BoardCategoryDto {
	private Long categoryId;
	private String categoryName;
	
	public static BoardCategoryDto toDto(BoardCategory entity) {
		BoardCategoryDto boardCategoryDto = BoardCategoryDto.builder()
																.categoryId(entity.getCategoryId())
																.categoryName(entity.getCategoryName())
																.build();
		return boardCategoryDto;
	}
}
