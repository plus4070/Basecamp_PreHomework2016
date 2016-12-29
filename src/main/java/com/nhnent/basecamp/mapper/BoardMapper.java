package com.nhnent.basecamp.mapper;

import java.util.List;

import com.nhnent.basecamp.model.Board;

public interface BoardMapper {
	public List<Board> selectBoardList();
	public int insertBoard(Board board);
	public int deleteBoard(Board board);
}
