package com.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/")
public class boardController {

	@GetMapping("/board_list")
	public String boardList() throws Exception {
		String forwardPath = "board_list";
		return forwardPath;
	}
}