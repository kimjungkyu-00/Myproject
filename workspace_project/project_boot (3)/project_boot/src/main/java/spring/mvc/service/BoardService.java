package spring.mvc.service;

import java.util.List;


import spring.mvc.dto.BoardVO;
import spring.mvc.dto.Criteria;
import spring.mvc.dto.ReplyVO;

public interface BoardService {
	
	public void insertBoard(BoardVO boardVO);
	public List<BoardVO> getFindListBoard();
	public BoardVO getFindView(BoardVO boardVO);
	public void findUpdateForm(BoardVO boardVO);
	public void findDeleteForm(BoardVO boardVO);
	public List<BoardVO> getList(Criteria cri);
	public List<BoardVO> listAll(String searchOption, String keyword);
	public int countSearch(String searchOption, String keyword);
	public List<ReplyVO> getCommentListByReplyBoardNo(int board_no);
}
