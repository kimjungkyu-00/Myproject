package com.han.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.han.user.dao.UserAccountDAO;
import com.han.user.vo.UserAccountVO;

@Service
public class UserAccountServiceImpl implements UserAccountService {

	
	@Autowired
	private UserAccountDAO accountDao;
	
	@Override
	public void UserSignUp(UserAccountVO accountVo) {
		// TODO Auto-generated method stub
		accountDao.UserSignUp(accountVo);
	}

}
