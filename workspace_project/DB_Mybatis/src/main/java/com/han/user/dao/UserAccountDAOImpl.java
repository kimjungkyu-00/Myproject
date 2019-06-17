package com.han.user.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.han.user.vo.UserAccountVO;

@Repository
public class UserAccountDAOImpl implements UserAccountDAO{

	@Autowired
	private SqlSession sqlSession;

	
	@Override
	public void UserSignUp(UserAccountVO accountVo) {

		sqlSession.insert("insertUserAccount", accountVo);

		System.out.println("dao insert complete");
	}

}
