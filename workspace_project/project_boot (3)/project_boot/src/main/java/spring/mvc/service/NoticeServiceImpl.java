package spring.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.mvc.dao.NoticeDAO;
import spring.mvc.dto.CommentVO;
import spring.mvc.dto.NoticeVO;

@Service
public class NoticeServiceImpl implements NoticeService{
	
	
	@Autowired
	private NoticeDAO noticeDAO;
	
	@Override
	public void InsertWriter(NoticeVO noticeVO) {

		noticeDAO.InsertWriter(noticeVO);
	
	}
	@Override
	public List<NoticeVO> NoticeList() {

		return noticeDAO.NoticeList();
	}
	
	
	
	@Override
	public NoticeVO NoticeView(NoticeVO noticeVO) {
		return noticeDAO.NoticeView(noticeVO);
	}
	
	
	@Override
	public void noticeViewUpdate(NoticeVO noticeVO) {
		noticeDAO.noticeViewUpdate(noticeVO);
	}
	
	@Override
	public void noticeDelete(NoticeVO noticeVO) {
		noticeDAO.noticeDelete(noticeVO);
	}
	
	@Override
	public List<CommentVO> getCommentListByNoticeNidx(int nidx) {
		return noticeDAO.getCommentListByNoticeNidx(nidx);
	}
	
	
}
