package spring.mvc.service;

import java.util.List;

import spring.mvc.dto.BoardVO;
import spring.mvc.dto.ReplyVO;

public interface ReplyService {
	public void insertReply(ReplyVO replyVO);

	public List<BoardVO> getReplyBoard();
	
	public List<ReplyVO> getCommentListByReplyBoardNo(int board_no);
	
	public int updateReply(ReplyVO replyVO)  throws Exception;
	
	public int deleteReply(int reply_no) throws Exception;

	
}
