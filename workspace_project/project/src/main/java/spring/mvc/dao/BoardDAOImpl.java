package spring.mvc.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.mvc.dto.BoardVO;
import spring.mvc.dto.Criteria;
import spring.mvc.dto.SearchCriteria;

@Repository
public class BoardDAOImpl implements BoardDAO{
	
	@Autowired
    private SqlSession sqlSession;
	
	//mapper랑 경로 맞춰줌
	private static String namespace = "board";

	@Override
	public void insertBoard(BoardVO boardVO) {
		sqlSession.insert(namespace+".insertBoard", boardVO);
		
	}

	@Override
	public List<BoardVO> getFindListBoard() {
		return sqlSession.selectList(namespace + ".listBoard");
	}


	@Override
	public BoardVO getFindView(BoardVO boardVO) {

		return sqlSession.selectOne(namespace+ ".viewFindBoard", boardVO);
	}

	@Override
	public void findUpdateForm(BoardVO boardVO) {
		sqlSession.update(namespace+".findUpdateForm",boardVO);
		
	}
	
	@Override
	public void findDeleteForm(BoardVO boardVO) {
		sqlSession.delete(namespace+".findDeleteForm",boardVO);
	}

	@Override
	public List<BoardVO> listAll(String searchOption,String searchOption1, String keyword) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("searchOption", searchOption);
		map.put("searchOption1", searchOption1);
		map.put("keyword", keyword);
		System.out.println("dao : " + searchOption + ", keyword : "+keyword);
		return sqlSession.selectList(namespace + ".searchList" , map );
	}

	@Override
	public int countSearch(String searchOption, String keyword) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("searchOption", searchOption);
		map.put("keyword", keyword);
		return sqlSession.selectOne(namespace + ".countSearch", map);
	}

	@Override
	public int get(int board_no) throws Exception {
		return sqlSession.update(namespace + ".countBoard", board_no);
	}

	@Override
	public List<BoardVO> listCriteria(Criteria cri) throws Exception {
		return sqlSession.selectList(namespace + ".listCriteria", cri);
	}

	@Override
	public int TotalCount(Criteria cri) throws Exception {
		return sqlSession.selectOne(namespace + ".getTotalCount",cri);
	}

    @Override
    public List<BoardVO> listSearch(SearchCriteria cri) throws Exception {
        return sqlSession.selectList(namespace + ".listSearch",cri);
    }
 
    @Override
    public int listSearchCount(SearchCriteria cri) throws Exception {
        return sqlSession.selectOne(namespace + ".listSearchCount",cri);
    }

}
