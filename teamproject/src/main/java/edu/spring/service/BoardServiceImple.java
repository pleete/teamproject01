package edu.spring.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import edu.spring.domain.Board;
import edu.spring.persistence.BoardDao;

public class BoardServiceImple implements BoardService {
	private final Logger logger = LoggerFactory.getLogger(BoardServiceImple.class);
	@Autowired private BoardDao boardDao;
	@Override
	public int insertBoard(Board board) {
		logger.info("insertBoard() call");
		return boardDao.createBoard(board);
	}

	@Override
	public int deleteBoard(int bno) {
		logger.info("deleteBoard() call");
		return boardDao.deleteBoard(bno);
	}

	@Override
	public int updateBoard(Board board) {
		logger.info("updateBoard() call");
		return boardDao.updateBoard(board);
	}

	@Override
	public List<Board> selectAllBoard() {
		logger.info("selectAllBoard() call");
		return boardDao.readAllBoard();
	}

	@Override
	public List<Board> selectBoardByCategory(int category) {
		logger.info("selectBoardByCategory() call");
		return boardDao.readBoardByCategory(category);
	}

	@Override
	public Board selectOneBoard(int bno) {
		logger.info("selectOneBoard() call");
		return boardDao.readBoard(bno);
	}

}
