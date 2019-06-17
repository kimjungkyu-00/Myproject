package spring.mvc.dao;

import java.util.List;

import spring.mvc.dto.QuestionboardVO;

public interface QuestionboardDAO {
	public void InsertWriter(QuestionboardVO questionboardVO);

	public List<QuestionboardVO> QuestionboardList();

	public QuestionboardVO QuestionboardView(QuestionboardVO questionboardVO);	
}
