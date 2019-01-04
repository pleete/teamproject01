package edu.spring.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import edu.spring.domain.Board;
import edu.spring.service.BoardService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
	locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml",
			"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"}
)
@WebAppConfiguration
public class BoardTest {
	private static final Logger logger = LoggerFactory.getLogger(BoardTest.class);
	@Autowired
	private BoardService boardService;
	
	@Test
	public void doTest() {
		int result = insertBoard();
		logger.info("result = {}",result);
	}
	
	public int insertBoard() {
		Board board = new Board(0, "김기명", 1, "같이 하실분", "내용 무", 0, 0, null);
		
		logger.info(board.toString());
		return boardService.insertBoard(board);
		
	}
	
}
