package spring.mvc.controller;

import java.io.IOException;
import java.util.List;

import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spring.mvc.dto.NoticeVO;
import spring.mvc.service.NaverService;
import spring.mvc.service.NoticeService;

@Controller
public class PetController {
	
	@Autowired
	NaverService naverService;
	
	@Autowired
	NoticeService noticeService;

	@RequestMapping(value = "/")
	public String main(Model model, NoticeVO noticeVO) throws Exception {	
		List newslist = naverService.getData();
		model.addAttribute("list", newslist );
		List<NoticeVO> noticeList = noticeService.NoticeList();

		model.addAttribute("noticeList",noticeList);
		return "main/main";
	}

	
	//관련뉴스
	@RequestMapping(value = "/info")
	public String info(Model model) throws IOException, ParseException {
		List list = naverService.getData();
		
		model.addAttribute("list", list );
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
	
	//보호절차
	@RequestMapping(value = "/info5")
	public String info5(Model model) {		
		return "info/info5";
	}
	

	//일반 상식 
	@RequestMapping(value="/knowledge",method=RequestMethod.GET)
	public String knowledge(Model model) {		
		return "knowledge/knowledge";
	}
	
	//동물 보호법
	@RequestMapping(value = "/knowledge2")
	public String knowledge2(Model model) {		
		return "info/knowledge2";
	}
	
	//건강강식
	@RequestMapping(value = "/know2")
	public String know2(Model model) {		
		return "knowledge/know2";
	}
	
	//갤러리
	@RequestMapping(value = "/photo")
	public String photo(Model model) {		
		return "knowledge/photo";
	}
	

	
	@RequestMapping(value="/write",method=RequestMethod.GET)
	public String writeForm(Model model) {		
		return "lost/findWriteForm";
	}
	
	
	@RequestMapping(value="/findWrite",method=RequestMethod.GET)
	public String findWrite(Model model) {		
		return "lost/find";
	}
	
	@RequestMapping(value="/error")
	   public String error(Model model) {      
	      return "error/error";
	   }
	   
	   @RequestMapping(value="/error404")
	   public String error404(Model model) {      
	      return "Error/error404";
	   }
	   
	   @RequestMapping(value="/error500")
	   public String error500(Model model) {      
	      return "error/error500";
	   }
	   

	
		
	
}
