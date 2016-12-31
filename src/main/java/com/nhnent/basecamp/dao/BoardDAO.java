package com.nhnent.basecamp.dao;

import java.util.List;

import com.nhnent.basecamp.model.Board;

public interface BoardDAO {
	public Board getBoardOne(int boardId);
	public List<Board> getBoardList();
	public int writeBoard(Board board);
	public int deleteBoard(Board board);
	public int editBoard(Board board);
}
