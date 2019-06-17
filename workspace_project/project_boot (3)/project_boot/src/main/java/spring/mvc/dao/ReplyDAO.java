package spring.mvc.dao;

import java.util.List;

import spring.mvc.dto.BoardVO;
import spring.mvc.dto.ReplyVO;

public interface ReplyDAO {

	void insertReply(ReplyVO replyVO);

	List<BoardVO> getReplyView();
	
	

}
