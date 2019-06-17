package spring.mvc.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.mvc.dao.CommentDAO;
import spring.mvc.dto.CommentVO;

@Service
public class CommentServiceImpl implements CommentService{
	
	@Autowired
	private CommentDAO sampleDAO;
	
	@Override
	public int WriteComment(CommentVO cvo) {
		return sampleDAO.insertComment(cvo);

	}

	@Override
	public List<CommentVO> getCommentList(){
		return sampleDAO.getCommentList();
	}

	@Override
	public CommentVO getComment(int nidx) {
		return sampleDAO.getComment(nidx);
	}

	@Override
	public int UpdateComment(CommentVO com) {
		return sampleDAO.getupdateComment(com);
	}

	@Override
	public int DeleteComment(CommentVO com) {
		return sampleDAO.getdeleteComment(com);
		
	}

}
