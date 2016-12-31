package com.nhnent.basecamp.service;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nhnent.basecamp.dao.BoardDAO;
import com.nhnent.basecamp.model.Board;

@Service
public class BoardServiceImpl implements BoardService{
	static final int RESPONSE_FAIL = -1;
	
	@Autowired
	private BoardDAO boardDAO;
	
	@Override
	public Board getBoardOne(int boardId) {
		if(boardId < 0) {
			return null;
		} else {
			return boardDAO.getBoardOne(boardId);
		}
	}
	
	@Override
	public List<Board> getBoardList() {
		return boardDAO.getBoardList();
	}

	@Override
	@Transactional
	public int writeBoard(Board board) {
		if(StringUtils.isEmpty(board.getBoardEmail()) == true) {
			return RESPONSE_FAIL;
		} else {
			return boardDAO.writeBoard(board);
		}
	}

	@Override
	@Transactional
	public int deleteBoard(Board board) {
		if(board.getBoardId() < 0) {
			return RESPONSE_FAIL;
		} else {
			return boardDAO.deleteBoard(board);
		}
	}

	@Override
	@Transactional
	public Board editBoard(Board board) {
		Board oldBoard = boardDAO.getBoardOne(board.getBoardId());
		
		if(StringUtils.equals(oldBoard.getBoardPassword(), board.getBoardPassword())) {
			boardDAO.editBoard(board);
			return board;
		} else {
			return null;
		}
	}
}
