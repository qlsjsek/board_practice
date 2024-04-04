package com.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.board.entity.BoardCategory;
import com.board.repository.BoardCategoryRepository;
import com.board.repository.BoardRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class BoardServiceImpl implements BoardService{
	@Autowired
	BoardCategoryRepository boardCategoryRepository;
	
	@Override
	public List<BoardCategory> findCategoriesAll() {
		return boardCategoryRepository.findAll();
	}

}
