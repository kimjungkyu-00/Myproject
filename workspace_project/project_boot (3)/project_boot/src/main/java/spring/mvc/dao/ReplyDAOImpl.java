package spring.mvc.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.mvc.dto.BoardVO;
import spring.mvc.dto.ReplyVO;

@Repository
public class ReplyDAOImpl implements ReplyDAO {

	@Autowired
    private SqlSession sqlSession;
	
	private static String namespace = "reply";
	
	@Override
	public void insertReply(ReplyVO replyVO) {
		sqlSession.insert(namespace + ".insertReply", replyVO);
		
	}

	@Override
	public List<BoardVO> getReplyView() {
		
		return sqlSession.selectList(namespace + ".listReply");
	}

}
