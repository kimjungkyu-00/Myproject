package spring.mvc.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import spring.mvc.common.Constant;
import spring.mvc.common.Util;

@Controller
public class RescueController {
	
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

}
