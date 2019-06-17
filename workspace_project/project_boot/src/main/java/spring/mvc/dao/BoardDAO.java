package spring.mvc.dao;

import java.util.List;

import spring.mvc.dto.BoardVO;
import spring.mvc.dto.Criteria;

public interface BoardDAO {
	
	public void insertBoard(BoardVO boardVO);
	
	public List<BoardVO> getFindListBoard();
	
	public BoardVO getFindView(BoardVO boardVO);
	

	public void findUpdateForm(BoardVO boardVO);
	
	public void findDeleteForm(BoardVO boardVO);

	public List<BoardVO> listAll(String searchOption,  String searchOption1,String keyword);

	public int countSearch(String searchOption, String keyword);

	public int get(int board_no) throws Exception;

	// [ 페이징 처리를 위한 메서드 ]
	public List<BoardVO> listCriteria(Criteria cri) throws Exception;

	// 전체 게시글 수 구하기
	public int TotalCount(Criteria cri) throws Exception;
}
