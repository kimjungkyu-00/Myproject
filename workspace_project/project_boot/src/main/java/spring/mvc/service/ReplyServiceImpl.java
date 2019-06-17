package spring.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.mvc.dao.ReplyDAO;
import spring.mvc.dto.BoardVO;
import spring.mvc.dto.ReplyVO;

@Service
public class ReplyServiceImpl implements ReplyService {

	@Autowired
	ReplyDAO r_dao;
	
	@Override
	public void insertReply(ReplyVO replyVO) {
		r_dao.insertReply(replyVO);

	}

	@Override
	public List<BoardVO> getReplyBoard() {
		
		return r_dao.getReplyView();
	}
	
	@Override
	public List<ReplyVO> getCommentListByReplyBoardNo(int board_no) {
		return r_dao.getCommentListByReplyBoardNo(board_no);
	}

	@Override
	public int updateReply(ReplyVO replyVO) throws Exception {
		return r_dao.updateReply(replyVO);
		
	}

	@Override
	public int deleteReply(int reply_no) throws Exception {
		// TODO Auto-generated method stub
		return r_dao.deleteReply(reply_no);
	}

}
