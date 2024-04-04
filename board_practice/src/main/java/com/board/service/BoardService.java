package com.board.service;

import java.util.List;

import com.board.entity.BoardCategory;

public interface BoardService {
	List<BoardCategory> findCategoriesAll();
}
