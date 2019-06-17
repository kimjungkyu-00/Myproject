package spring.mvc.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.common.Constant;
import spring.mvc.common.Util;
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
	public String main(Model model,NoticeVO noticeVO) throws Exception {	
		String apiUrl = Constant.API_ABANDONMENT_ANIMAL_URL;
		// 실제 데이터 list형식으로 받기
		List list = Util.getArray(apiUrl);
		List newslist = naverService.getData();
		model.addAttribute("result", list);	
		List<NoticeVO> noticeList = noticeService.NoticeList();
//		model.addAttribute("list", newslist );
		model.addAttribute("noticeList",noticeList);
		
		
		return "main/main";
	}
	
	@RequestMapping(value = "/rescue3")
	public String lost3(Model model) {		
		return "rescue/rescuePet";
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
	

	
	
	//보호센터 보호중 동물
	@RequestMapping(value = "/rescue1")
	public String rescueDog(Model model) throws Exception{
		String apiUrl = Constant.API_ABANDONMENT_ANIMAL_URL;
		// 실제 데이터 list형식으로 받기
		List list = Util.getArray(apiUrl);
		model.addAttribute("result", list);
		return "rescue/rescueDog";
	}
	
	//보호센터 찾기
	@RequestMapping(value = "/rescue2")
	public String centerFind(Model model) throws Exception {
		String apiUrl = Constant.API_SIDO_URL;
		List list = Util.getArray(apiUrl);
		model.addAttribute("result", list);
		model.addAttribute("key", "sido");
		
		return "rescue/centerFind";
	}
	
	//보호센터 보호중 동물
	@RequestMapping(value = "/rescueSiGunGu")
	public String rescueSiGunGuDog(@RequestParam("uprCd") String uprCd, Model model) throws Exception{
		String apiUrl = Constant.API_SIGUNGU_URL + "&upr_cd=" + uprCd;
		List list = Util.getArray(apiUrl);
		model.addAttribute("result", list);
		model.addAttribute("key", "sigungu");
		return "rescue/centerFind";
	}
	
	@RequestMapping(value = "/rescueCenter")
	public String rescueCenterDog(@RequestParam("uprCd") String uprCd, @RequestParam("orgCd") String orgCd, Model model) throws Exception{
		String apiUrl = Constant.API_CENTER_URL + "&upr_cd=" + uprCd + "&org_cd=" + orgCd;
		List list = Util.getArray(apiUrl);
		model.addAttribute("result", list);
		model.addAttribute("key", "center");
		
		return "rescue/centerFind";
	}
	
	@RequestMapping(value = "/rescueAbandonmentAnimal")
	public String rescueAbandonmentAnimal(Model model) throws Exception{
		String apiUrl = Constant.API_ABANDONMENT_ANIMAL_URL;
		List list = Util.getArray(apiUrl);
		model.addAttribute("result", list);
		model.addAttribute("key", "abandonmentAnimal");
		
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
	   
	   
		//동물 보호법
		@RequestMapping(value = "/detail_dog/{desertionNo}")
		public String detail_dog(@PathVariable String desertionNo,Model model) {		
			
			System.out.println(desertionNo);
			System.out.println("넘어옴");
			
			
			return "1";
		}


	
		
	
}
