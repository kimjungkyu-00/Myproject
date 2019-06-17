package spring.mvc.dao;


import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.mvc.dto.CommentVO;

@Repository
public class CommentDAOImpl implements CommentDAO{
	@Autowired
	private SqlSession sqlSession;
	private String namespace = "spring.mvc.dto.CommentVO";
	
	@Override
	public int insertComment(CommentVO cvo){
	    return sqlSession.insert( namespace+".insertComment",cvo);
	}
	
	@Override
	public List<CommentVO> getCommentList(){
		return sqlSession.selectList(namespace+".CommentList");
	}

	@Override
	public CommentVO getComment(int nidx) {
		return sqlSession.selectOne(namespace+ ".getComment",nidx);
	}

	@Override
	public int getupdateComment(CommentVO com) {
		return sqlSession.update(namespace+".UpdateComment",com);
	}

	@Override
	public int getdeleteComment(CommentVO com) {
		
		return sqlSession.update(namespace+".DeleteComment",com);
	}
	
	
}