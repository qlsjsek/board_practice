package com.board.service;

import java.util.List;

import com.board.dto.BoardDto;
import com.board.entity.Board;
import com.board.entity.BoardCategory;

public interface BoardService {
	List<BoardCategory> findCategoriesAll();
	
	Board insertBoard(Board board);
	
	void deleteBoardByBoardId(Long boardId);
	
	Board updateBoardByBoardId(Long boardId, Board board);
	
	List<Board> findBoardAll();
}
