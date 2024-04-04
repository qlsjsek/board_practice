package com.board.entity;

import java.util.ArrayList;
import java.util.List;

import com.board.dto.BoardCategoryDto;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class BoardCategory {
	@Id
	@GeneratedValue
	private Long categoryId;
	private String categoryName;
	
	public static BoardCategory toDto(BoardCategoryDto dto) {
		BoardCategory boardCategory = BoardCategory.builder()
													.categoryId(dto.getCategoryId())
													.categoryName(dto.getCategoryName())
													.build();
		return boardCategory;
	}
	
	@OneToMany(mappedBy = "boardCategory", cascade = CascadeType.PERSIST)
	@Builder.Default
	@ToString.Exclude
	private List<Board> boards = new ArrayList<>();
}
