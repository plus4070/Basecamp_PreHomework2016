package com.nhnent.basecamp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nhnent.basecamp.model.Board;
import com.nhnent.basecamp.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping(value = "/board", method = RequestMethod.GET)
	public String getBoardList(Model model) {
		List<Board> boardList = boardService.getBoardList();
		model.addAttribute("boardList", boardList);
		return "boardList";
	}
	
	@RequestMapping(value="/board/write", method = RequestMethod.PUT)
	public String writeBoard() {
		
		return "";
	}
	
	@RequestMapping(value="/board/edit", method = RequestMethod.PUT)
	public String editBoard() {
		
		return "";
	}
	
	@RequestMapping(value="/board/delete", method = RequestMethod.DELETE)
	public String deleteBoard() {
		
		return "";
	}
	
}
