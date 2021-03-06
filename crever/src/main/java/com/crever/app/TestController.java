package com.crever.app;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author : ohs
 * @message : 마이바티스 연동 테스트
 * @date :2017. 7. 22.
 */
@Controller
@RequestMapping("/test/*")
public class TestController {
	@Inject
	TestService service;
	
//	프로퍼티스 파일에서 crever정보 가져오기
//	@Value("#{props['mysql.user.pw']}")
//	private String str;

	@RequestMapping(value = "/select", method = RequestMethod.GET)
	public String select(Model model, HttpServletRequest request) {
		model.addAttribute("list", service.select());
		return "test/test";
	}

	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insert(Model model, HttpServletRequest  request) {
		int record = service.insert();
		if (record > 0) {

			/*
			 * 파라미터 가지고 가야할땐 hashmap에 담아서 가면됨, 페이지번호, 시퀀스 등등 
			 * HashMap<String, Object> obj = new HashMap<String, Object>(); obj.put("pageNum", "5");
			 * model.addAttribute("obj", obj);
			 */

			model.addAttribute("url", "/test/select");
			model.addAttribute("message", "작업을 성공하였습니다");
			return "result/state";
		} else {
			model.addAttribute("url", "/test/select");
			model.addAttribute("message", "작업을 실패하였습니다");
			return "result/state";
		}
	}
}
