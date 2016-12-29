package com.nhnent.basecamp.dao;

import java.util.List;

import com.nhnent.basecamp.model.Board;

public interface BoardDAO {
	public List<Board> getBoardList();
	public int writeBoard(Board board);
}
