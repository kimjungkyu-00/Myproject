package spring.mvc.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.mvc.dao.BoardDAO;
import spring.mvc.dto.BoardVO;
import spring.mvc.dto.Criteria;
import spring.mvc.dto.ReplyVO;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	BoardDAO b_dao;

	@Override
	public void insertBoard(BoardVO boardVO) {
		b_dao.insertBoard(boardVO);
	}

	@Override
	public List<BoardVO> getFindListBoard() {
		
		return b_dao.getFindListBoard();
	}

	@Override
	public BoardVO getFindView(BoardVO boardVO) {
		return b_dao.getFindView(boardVO);
	}

	@Override
	public void findUpdateForm(BoardVO boardVO) {
		b_dao.findUpdateForm(boardVO);
		
	}
	public void findDeleteForm(BoardVO boardVO) {
		b_dao.findDeleteForm(boardVO);
	}

	@Override
	public List<BoardVO> getList(Criteria cri) {
		System.out.println("getList with criteria : " + cri);
		return b_dao.getListWithPaging(cri);
	}

	@Override
	public List<BoardVO> listAll(String searchOption, String keyword) {
		
		return b_dao.listAll(searchOption, keyword);
	}

	@Override
	public int countSearch(String searchOption, String keyword) {
		
		return b_dao.countSearch(searchOption, keyword);
	}

	@Override
	public List<ReplyVO> getCommentListByReplyBoardNo(int board_no) {
		return b_dao.getCommentListByReplyBoardNo(board_no);
	}
	




}
