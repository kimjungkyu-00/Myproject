package mvc.kim.user.dao;


import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mvc.kim.user.vo.UserAccountVO;

@Repository
public class UserAccountDAOImpl implements UserAccountDAO{

	@Autowired
	private SqlSession sqlSession;

	
	@Override
	public void UserTitle(UserAccountVO accountVo) {

		sqlSession.insert("insertUserAccount", accountVo);

		System.out.println("dao insert complete");
	}

}
