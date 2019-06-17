package mvc.kim.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mvc.kim.user.vo.UserAccountVO;

import mvc.kim.user.dao.UserAccountDAO;

import mvc.kim.user.service.UserAccountService;

@Service
public class UserAccountServiceImpl  implements UserAccountService {
	
	
	@Autowired
	private UserAccountDAO accountDao;
	@Override
	public void UserTitle(UserAccountVO accountVo) {
		accountDao.UserTitle(accountVo);
	}
}
