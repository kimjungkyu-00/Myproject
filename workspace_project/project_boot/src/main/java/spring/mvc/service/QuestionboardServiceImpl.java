package spring.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.mvc.dao.QuestionboardDAO;
import spring.mvc.dto.QuestionboardVO;

@Service
public class QuestionboardServiceImpl implements QuestionboardService{
	
	
	@Autowired
	private QuestionboardDAO questionboardDAO;
	
	
	@Override
	public void InsertWriter(QuestionboardVO questionboardVO) {
		questionboardDAO.InsertWriter(questionboardVO);
	}
	
	
	@Override
	public List<QuestionboardVO> QuestionboardList() {

		return questionboardDAO.QuestionboardList();
	}


	@Override
	public QuestionboardVO questionboardView(QuestionboardVO questionboardVO) {
		return questionboardDAO.QuestionboardView(questionboardVO);
	}
	
}
