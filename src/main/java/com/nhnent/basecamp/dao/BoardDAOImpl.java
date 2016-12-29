package com.nhnent.basecamp.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.nhnent.basecamp.mapper.BoardMapper;
import com.nhnent.basecamp.model.Board;

@Repository
public class BoardDAOImpl implements BoardDAO{
	
	static final Logger logger = LoggerFactory.getLogger(BoardDAOImpl.class);
	
	@Autowired
	private BoardMapper boardMapper;
	
	@Override
	public List<Board> getBoardList() {
		return boardMapper.selectBoardList();
	}

	@Override
	@Transactional
	public int writeBoard(Board board) {
		return boardMapper.insertBoard(board);
	}

	@Override
	public int deleteBoard(Board board) {
		return boardMapper.deleteBoard(board);
	}

}
