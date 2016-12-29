package com.nhnent.basecamp.service;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nhnent.basecamp.dao.BoardDAO;
import com.nhnent.basecamp.model.Board;

@Service
public class BoardServiceImpl implements BoardService{
	static final int RESPONSE_FAIL = -1;
	
	@Autowired
	private BoardDAO boardDAO;
	
	@Override
	public List<Board> getBoardList() {
		return boardDAO.getBoardList();
	}

	@Override
	public int writeBoard(Board board) {
		if(StringUtils.isEmpty(board.getBoardEmail()) == true) {
			return RESPONSE_FAIL;
		} else {
			return boardDAO.writeBoard(board);
		}
	}

}
