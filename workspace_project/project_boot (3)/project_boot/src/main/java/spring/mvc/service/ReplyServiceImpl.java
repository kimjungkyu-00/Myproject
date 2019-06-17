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
	public void insert(ReplyVO replyVO) {
		r_dao.insertReply(replyVO);

	}

	@Override
	public List<BoardVO> getReplyBoard() {
		
		return r_dao.getReplyView();
	}

}
