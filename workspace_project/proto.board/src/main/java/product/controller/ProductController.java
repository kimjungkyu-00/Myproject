package product.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import product.service.ProductService;

//@Controller,@Service,@Repsotory(dao)

// 스프링(IOC) => ProductController =>ProductService => ProductDAO
// => SqlSession 

@Controller //controller bean으로 등록
@RequestMapping("/shop/product/*") // 공통된 url pattern
public class ProductController{
	@Inject //서비스 객체 주입
	ProductService productService;
	@RequestMapping("list.do") // /shop/product/list.do
	public ModelAndView list(ModelAndView mav) {
		//뷰(페이지)의 이름
		mav.setViewName("/shop/product_list");
		//뷰에 전달한 데이터 저장
		mav.addObject("list",productService.listProduct());
		
		return mav;
	}
}