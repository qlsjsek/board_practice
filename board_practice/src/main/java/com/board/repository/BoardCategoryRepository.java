package com.board.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.board.entity.BoardCategory;

public interface BoardCategoryRepository extends JpaRepository<BoardCategory, Long>{
}
