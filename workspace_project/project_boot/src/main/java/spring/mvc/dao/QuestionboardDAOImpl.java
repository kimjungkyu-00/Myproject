package spring.mvc.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.mvc.dto.QuestionboardVO;

@Repository
public class QuestionboardDAOImpl implements QuestionboardDAO{
	
	@Autowired
	private SqlSession sqlSession;
	//mapper랑 경로 맞춰줌
	private String namespace = "spring.mvc.dto.QuestionboardVO";
	
	@Override
	public void InsertWriter(QuestionboardVO questionboardVO) {							
		sqlSession.insert(namespace + ".insertQuestionboard" , questionboardVO);
	}

	@Override
	public List<QuestionboardVO> QuestionboardList() {
		return sqlSession.selectList(namespace + ".QuestionboardListAll");
	}

	@Override
	public QuestionboardVO QuestionboardView(QuestionboardVO questionboardVO) {
		return sqlSession.selectOne(namespace + ".QuestionboardView" , questionboardVO);
	}
	
}
