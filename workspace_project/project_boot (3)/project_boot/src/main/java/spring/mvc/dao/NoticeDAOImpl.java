package spring.mvc.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.mvc.dto.CommentVO;
import spring.mvc.dto.NoticeVO;

@Repository
public class NoticeDAOImpl implements NoticeDAO{
	
	@Autowired
	private SqlSession sqlSession;
	//mapper랑 경로 맞춰줌
		private String namespace = "spring.mvc.dto.NoticeVO";
		
	@Override
	public void InsertWriter(NoticeVO noticeVO) {
		sqlSession.insert(namespace + ".insertNotice" , noticeVO);	
	}

	@Override
	public List<NoticeVO> NoticeList() {
		return sqlSession.selectList(namespace + ".NoticeListAll");
	}
	
	

	@Override
	public NoticeVO NoticeView(NoticeVO noticeVO) {
		
		return sqlSession.selectOne(namespace+".NoticelList", noticeVO);
		
	}
	
	@Override
	public void noticeViewUpdate(NoticeVO noticeVO) {
		sqlSession.update(namespace+".NoticeUpdate",noticeVO);
	}
	
	@Override
	public void noticeDelete(NoticeVO noticeVO) {
		sqlSession.delete(namespace+".NoticeDelete",noticeVO);
	}
	
	@Override
	public List<CommentVO> getCommentListByNoticeNidx(int nidx) {
		return sqlSession.selectList("spring.mvc.dto.CommentVO"+ ".CommentList",nidx);
	}
	
}
