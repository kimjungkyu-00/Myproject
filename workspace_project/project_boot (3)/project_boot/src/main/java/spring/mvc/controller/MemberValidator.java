package spring.mvc.controller;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import spring.mvc.dto.MemberVO;

public class MemberValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return MemberVO.class.isAssignableFrom(clazz);
		
	}

	@Override
	public void validate(Object target, Errors errors) {
		MemberVO log = (MemberVO) target;
		String id = log.getUserid();
		String pw = log.getUserpw();
		
		System.out.println("login함~수~호~출~validate~");
		if(id == null || id.trim().isEmpty() ) {
			System.out.println("id! null!");
			errors.rejectValue(id, "iderr");
		}
		
		if(pw == null || pw.trim().isEmpty()) {
			System.out.println("pw! null!");
			errors.rejectValue(pw, "pwerr");
		}
		
		
	}

}
