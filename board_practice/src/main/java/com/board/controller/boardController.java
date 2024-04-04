package com.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.board.entity.BoardCategory;
import com.board.service.BoardService;
@Controller
@RequestMapping("/")
public class boardController {
	@Autowired
	BoardService boardService;
	
	@GetMapping("/board_list")
	public String boardList(Model model) throws Exception {
		List<BoardCategory> categories = boardService.findCategoriesAll();
		model.addAttribute("categories", categories);
		String forwardPath = "board_list";
		return forwardPath;
	}
	
	@GetMapping("/board_write")
	public String boardWrite() throws Exception {
		String forwardPath = "board_write";
		return forwardPath;
	}
	
	@GetMapping("/board_detail")
	public String boardDetail() throws Exception {
		String forwardPath = "board_detail";
		return forwardPath;
	}
}
