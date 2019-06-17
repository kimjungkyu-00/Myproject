package proto.board.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import proto.board.domain.BoardContentVO;

@Repository
public class BoardContentViewDAOImpl implements BoardContentViewDAO {

    private SqlSession sqlSession;
    private BoardContentVO boardContentVO = new BoardContentVO();

    public void setSqlSession(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }



    public BoardContentVO getBoardContentVO() {
        //boardContentVO.setContent("CONTENT");


        return (BoardContentVO) sqlSession.selectOne("proto.board.mapper.getBoardContentView");
    }
}
