package spring.mvc.service;

import java.util.List;

import spring.mvc.dto.CommentVO;


public interface CommentService {
	
	public int WriteComment(CommentVO cvo);

	public List<CommentVO> getCommentList();

	public CommentVO getComment(int nidx);

	public int UpdateComment(CommentVO com);

	public int DeleteComment(CommentVO com);

	
}
