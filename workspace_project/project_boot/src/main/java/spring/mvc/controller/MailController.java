package spring.mvc.controller;

import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import spring.mvc.dto.MailDTO;

@Controller
public class MailController {
 
  @Autowired
  private JavaMailSender mailSender;
 
 
  // mailForm
  @RequestMapping(value = "/mail")
  public String mailForm() {
   
    return "/notice/mailForm";
  }  
 
  // mailSending 코드
  @RequestMapping(value = "/mailSending")
  
  public @ResponseBody String mailSending(@RequestParam("mail") String mail,
		  @RequestParam("title") String title,
		  @RequestParam("content") String content,
		  HttpServletRequest request) {

   
    try {
      MimeMessage message = mailSender.createMimeMessage();
      MimeMessageHelper messageHelper 
                        = new MimeMessageHelper(message, true, "UTF-8");
 
      messageHelper.setFrom(mail);  // 보내는사람 생략하거나 하면 정상작동을 안함
      messageHelper.setTo(mail);     // 받는사람 이메일
      messageHelper.setSubject(title); // 메일제목은 생략이 가능하다
      messageHelper.setText(content);  // 메일 내용
     
      mailSender.send(message);
    } catch(Exception e){
      System.out.println(e);
    }
   
    return "success";
  }
} 
