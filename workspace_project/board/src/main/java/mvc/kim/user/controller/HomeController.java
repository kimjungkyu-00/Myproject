package mvc.kim.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import mvc.kim.user.service.UserAccountService;
import mvc.kim.user.vo.UserAccountVO;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	private UserAccountService acountService;
	
	@RequestMapping(value="/")
	public String main() {
		return "board";
	}
	
	
	@RequestMapping("home.do")
	public String SubmitSignUp(@RequestParam("title") String title) {
		UserAccountVO vo = new UserAccountVO();
		vo.setTitle(title);
		acountService.UserTitle(vo); 
		return "/home";
	}
	
}
