package com.board.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import com.board.dto.BoardDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Board {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long boardId;
	private String boardTitle;
	@Column(columnDefinition = "CLOB")
	private String boardContent;
	@CreationTimestamp
	private LocalDateTime createdTime;
	
	public static Board toEntity (BoardDto dto) {
		Board board = Board.builder()
								.boardId(dto.getBoardId())
								.boardTitle(dto.getBoardTitle())
								.boardContent(dto.getBoardContent())
								.createdTime(dto.getCreatedTime())
								.boardCategory(BoardCategory.builder().categoryId(dto.getCategoryId()).build())
								.build();
		return board;
	}
	
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category_id")
	@ToString.Exclude
	private BoardCategory boardCategory;
}
