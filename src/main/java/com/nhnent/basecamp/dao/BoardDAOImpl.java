package com.nhnent.basecamp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nhnent.basecamp.mapper.BoardMapper;
import com.nhnent.basecamp.model.Board;

@Repository
public class BoardDAOImpl implements BoardDAO{
	
	@Autowired
	private BoardMapper boardMapper;
	
	@Override
	public List<Board> getBoardList() {
		return boardMapper.selectBoardList();
	}

}
