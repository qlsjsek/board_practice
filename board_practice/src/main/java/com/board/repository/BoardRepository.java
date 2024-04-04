package com.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.board.entity.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {

}
