package com.nhnent.basecamp.service;

import java.util.List;

import com.nhnent.basecamp.model.Board;

public interface BoardService {
	public Board getBoardOne(int boardId);
	public List<Board> getBoardList();
	public int writeBoard(Board board);
	public int deleteBoard(Board board);
	public Board editBoard(Board board);
}
