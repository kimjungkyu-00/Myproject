package spring.mvc.service;

import java.util.List;

import spring.mvc.dto.CommentVO;
import spring.mvc.dto.NoticeVO;

public interface NoticeService {
	public void InsertWriter(NoticeVO noticeVO);

	public List<NoticeVO> NoticeList();
	
	public NoticeVO NoticeView(NoticeVO noticeVO);
	
	public void noticeViewUpdate(NoticeVO noticeVO);
	
	public void noticeDelete(NoticeVO noticeVO);

	public List<CommentVO> getCommentListByNoticeNidx(int nidx);
	
	
}
