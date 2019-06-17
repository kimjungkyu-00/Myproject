package spring.mvc.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.mvc.dao.BoardDAO;
import spring.mvc.dto.BoardVO;
import spring.mvc.dto.Criteria;
import spring.mvc.dto.SearchCriteria;

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
	public BoardVO getFindView(BoardVO boardVO) throws Exception {
		b_dao.get(boardVO.getBoard_no());
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
	public List<BoardVO> listAll(String searchOption,String searchOption1, String keyword) {
		
		return b_dao.listAll(searchOption, searchOption1, keyword);
	}

	@Override
	public int countSearch(String searchOption, String keyword) {
		
		return b_dao.countSearch(searchOption, keyword);
	}


	
	@Override
	public List<BoardVO> listCriteria(Criteria cri) throws Exception {
		return b_dao.listCriteria(cri);
	}

	@Override
	public int totalCount(Criteria cri) throws Exception {
		return b_dao.TotalCount(cri);
	}

	@Override
	public List<BoardVO> listSearchCriteria(SearchCriteria scri) throws Exception {
		return b_dao.listSearch(scri);
	}

	@Override
	public int listSearchCount(SearchCriteria scri) throws Exception {
		return b_dao.listSearchCount(scri);
	}








}
