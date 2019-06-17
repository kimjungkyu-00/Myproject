package spring.mvc.dao;


import java.util.List;

import spring.mvc.dto.CommentVO;
import spring.mvc.dto.MemberVO;
import spring.mvc.dto.NoticeVO;

public interface CommentDAO {
	
	public int insertComment(CommentVO cvo);
	public List<CommentVO> getCommentList();
	public CommentVO getComment(int nidx);
	public int getupdateComment(CommentVO com);
	public int getdeleteComment(CommentVO com);	

}
