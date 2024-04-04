package com.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.board.dto.BoardDto;
import com.board.entity.Board;
import com.board.entity.BoardCategory;
import com.board.repository.BoardCategoryRepository;
import com.board.repository.BoardRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class BoardServiceImpl implements BoardService{
	@Autowired
	BoardCategoryRepository boardCategoryRepository;
	@Autowired
	BoardRepository boardRepository;
	
	@Override
	public List<BoardCategory> findCategoriesAll() {
		return boardCategoryRepository.findAll();
	}

	@Override
	public Board insertBoard(Board board) {
		return boardRepository.save(board);
	}

	@Override
	public void deleteBoardByBoardId(Long boardId) {
		boardRepository.deleteById(boardId);
	}

	@Override
	public Board updateBoardByBoardId(Long boardId, Board board) {
		return null;
	}

	@Override
	public List<Board> findBoardAll() {
		return null;
	}

}
