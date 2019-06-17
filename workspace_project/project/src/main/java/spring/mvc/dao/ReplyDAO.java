package spring.mvc.dao;

import java.util.List;

import spring.mvc.dto.BoardVO;
import spring.mvc.dto.ReplyVO;

public interface ReplyDAO {

	public void insertReply(ReplyVO replyVO);

	public List<BoardVO> getReplyView();
	
	public List<ReplyVO> getCommentListByReplyBoardNo(int board_no);

	public int updateReply(ReplyVO replyVO) throws Exception;

	public int deleteReply(int reply_no) throws Exception;
	
	

}
