package com.nhnent.basecamp.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nhnent.basecamp.model.Board;
import com.nhnent.basecamp.service.BoardService;

@Controller
public class BoardController {
	static final int RESPONSE_FAIL = -1;
	static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping(value = "/board", method = RequestMethod.GET)
	public String getBoardList(Model model) {
		List<Board> boardList = boardService.getBoardList();
		model.addAttribute("boardList", boardList);
		return "boardList";
	}
	
	@RequestMapping(value="/board/writeForm", method = RequestMethod.GET)
	public String getWriteForm(Model model) {
		return "writeForm";
	}
	
	@ResponseBody
	@RequestMapping(value="/board/write", method = RequestMethod.PUT)
	public List<Board> writeBoard(@RequestBody Board board, Model model) {
		if(boardService.writeBoard(board) == RESPONSE_FAIL) {
			return null;
		} else {
			List<Board> boardList = boardService.getBoardList();
			return boardList;
		}
	}
	
	@RequestMapping(value="/board/editForm", method = RequestMethod.GET)
	public String getEditForm() {
		return "editForm";
	}
	
	@RequestMapping(value="/board/edit", method = RequestMethod.PUT)
	public String editBoard(@RequestBody Board board) {
		
		return "";
	}
	
	@ResponseBody
	@RequestMapping(value="/board/delete", method = RequestMethod.DELETE)
	public int deleteBoard(@RequestBody Board  board) {
		if(boardService.deleteBoard(board) == RESPONSE_FAIL) {
			return RESPONSE_FAIL;
		} else {
			return board.getBoardId();
		}
	}
	
}
