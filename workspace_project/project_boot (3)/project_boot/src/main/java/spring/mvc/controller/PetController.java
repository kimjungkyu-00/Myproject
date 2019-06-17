package spring.mvc.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import spring.mvc.dto.MemberVO;

@Controller
public class PetController {

	@RequestMapping(value = "/")
	public String main(Model model) {		
		return "main/main";
	}
	
	
	//관련뉴스
	@RequestMapping(value = "/info")
	public String info(Model model) {		
		return "info/info";
	}
	
	//구조시 대처방법
	@RequestMapping(value = "/info2")
	public String info2(Model model) {		
		return "info/info2";
	}
	
	//입양 안내
	@RequestMapping(value = "/info3")
	public String info3(Model model) {		
		return "info/info3";
	}
	
	//실종시 대처방법
	@RequestMapping(value = "/info4")
	public String info4(Model model) {		
		return "info/info4";
	}
	
	
	
	
	//보호센터 보호중 동물
	@RequestMapping(value = "/rescue1")
	public String rescueDog(Model model) {		
		return "rescue/rescueDog";
	}
	
	//보호센터 찾기
	@RequestMapping(value = "/rescue2")
	public String centerFind(Model model) {		
		return "rescue/centerFind";
	}
	
	
	//일반 상식 
	@RequestMapping(value="/knowledge",method=RequestMethod.GET)
	public String knowledge(Model model) {		
		return "knowledge/knowledge";
	}
	
	//동물 보호법
	@RequestMapping(value = "/knowledge2")
	public String knowledge2(Model model) {		
		return "knowledge/knowledge2";
	}
	

	
	@RequestMapping(value="/write",method=RequestMethod.GET)
	public String writeForm(Model model) {		
		return "lost/findWriteForm";
	}
	
	
	@RequestMapping(value="/findWrite",method=RequestMethod.GET)
	public String findWrite(Model model) {		
		return "lost/find";
	}
	
	/*@RequestMapping(value="/error")
	public String error(Model model) {		
		return "error/error";
	}
	
	@RequestMapping(value="/error404")
	public String error404(Model model) {		
		return "error/error404";
	}
	
	@RequestMapping(value="/error500")
	public String error500(Model model) {		
		return "error/error500";
	}*/
	
	
	
	

	
	
	
//	@RequestMapping(value="/signUp.do", method = RequestMethod.POST)
//	public String paramView(MemberDto mem, BindingResult result) {
//		String nextPage = "signUp/signUpOk";
//		
//		//유효성 검사(서버에서)
//		MemberValidator validator = new MemberValidator();
//		validator.validate(mem, result);
//		
//		//error
//		if(result.hasErrors()) {
//			System.out.println("hasErrors()");
//			return "signUp/signUpForm";
//		}
//		
//		MemberDao dao = new MemberDaoImpl();
//		dao.insert(mem);
//		
//		MemberDto search = dao.get(mem.getUserid()); 
//		System.out.println("insert id : " + search.getUserid());
//		
//		List<MemberDto> list = dao.getAllList();
//		System.out.println(list);
//		
//		return nextPage;
	
		
	
}
