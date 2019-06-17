package spring.mvc.service;

import java.util.List;

import spring.mvc.dto.QuestionboardVO;

public interface QuestionboardService {
	public void InsertWriter(QuestionboardVO questionboardVO);
	
	public List<QuestionboardVO> QuestionboardList();

	public QuestionboardVO questionboardView(QuestionboardVO questionboardVO);
	
	

}
