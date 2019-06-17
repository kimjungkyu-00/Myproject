package spring.mvc.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.mvc.dto.MemberLoginVO;
import spring.mvc.dto.MemberVO;


@Repository
public class MemberDAOImpl implements MemberDAO{

	@Autowired
    private SqlSession sqlSession;
	
	//mapper랑 경로 맞춰줌
	private static String namespace = "member";

	
	@Override
	public void memberSignUp(MemberVO memberVO) {

		sqlSession.insert(namespace + ".insertMember", memberVO);

		System.out.println("dao insert complete");
	}
	
	// 아이디 중복 체크
	public int CheckDuplication(String inputId) {
		int idCount = sqlSession.selectOne("checkDuplicationId", inputId.replace("=", ""));
		return idCount;
	}
	

	@Override
	public void logout(HttpSession session) {
		
	}

	@Override
	public MemberVO memberInfo(MemberVO memberVO) {
		
		return sqlSession.selectOne(namespace + ".memberInfo", memberVO);
	}
	
   public void memberModify(MemberVO memberVO) {
	   sqlSession.update(namespace+".update", memberVO);
	      
	   }

	@Override
	public void memberDelete(MemberVO memberVO) {
		System.out.println("daoDelete:"+memberVO);
		sqlSession.delete(namespace+ ".delete" , memberVO);
		
	}

	@Override
	public List<HashMap<String, Object>> memberList() {
		
		return sqlSession.selectList(namespace + ".memberList");
	}

	@Override
	public MemberVO getMember(MemberVO memberVO) {
		return sqlSession.selectOne(namespace + ".getMember", memberVO);
	}

}
