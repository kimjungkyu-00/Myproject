package spring.mvc.service;

import java.util.List;

import spring.mvc.dto.BoardVO;
import spring.mvc.dto.Criteria;

public interface BoardService {
	
	public void insertBoard(BoardVO boardVO);
	public List<BoardVO> getFindListBoard();
	public BoardVO getFindView(BoardVO boardVO)throws Exception;
	public void findUpdateForm(BoardVO boardVO);
	public void findDeleteForm(BoardVO boardVO);
	public List<BoardVO> listAll(String searchOption, String searchOption1,String keyword);
	public int countSearch(String searchOption, String keyword);	
	// 페이징 처리 서비스 메서드
	public List<BoardVO> listCriteria(Criteria cri) throws Exception;

	// 전체 게시글 수 구하기
	public int totalCount(Criteria cri) throws Exception;
}
