package spring.mvc.service;

import java.util.List;

import spring.mvc.dto.BoardVO;
import spring.mvc.dto.ReplyVO;

public interface ReplyService {
	public void insert(ReplyVO replyVO);

	public List<BoardVO> getReplyBoard();
	
}
