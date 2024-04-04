package com.board.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import com.board.BoardPracticeApplicationTests;
import com.board.entity.BoardCategory;

import jakarta.transaction.Transactional;

public class BoardServiceImplTest extends BoardPracticeApplicationTests{
	@Autowired
	BoardService boardService;
	
	@Test
	@Transactional
	//@Disabled
	@Rollback(false)
	void findAll() {
		List<BoardCategory> categories = boardService.findCategoriesAll();
		System.out.println("카테고리 리스트 : " + categories);
	}
}
