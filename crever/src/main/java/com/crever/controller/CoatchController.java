package com.crever.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/coatch/*")
public class CoatchController {
	
	/**
	 * @param
	 * 필수값 : user_id
	 * @return 메인페이지에서 공지사항 재능코치 등록방법 선택시 페이지이동
	 */
	@RequestMapping(value = "/add", method=RequestMethod.GET)
	public String add(HttpServletRequest request) {
		return null;
	}
	
	/**
	 * @param
	 * @return 메인페이지에서 공지사항 재능코치 등록방법 선택시 데이터 인서트
	 */
	@RequestMapping(value = "/add", method=RequestMethod.POST)
	public String add_form(HttpServletRequest request) {
		return null;
	}
	
	/**
	 * @param
	 * 필수 값: user_id(유저시퀀스), rc(코치,러너분류)
	 * @message 유저가 코치인지 러너인지 확인 후 강의예약하는 페이지로 이동
	 * @return 강의 예약하기
	 */
	@RequestMapping(value = "/subject", method=RequestMethod.GET)
	public String subject(HttpServletRequest request) {
		return null;
	}
	
	/**
	 * @param
	 * 필수 값: user_id(유저시퀀스), rc(코치,러너분류)
	 * @message 유저가 코치인지 러너인지 확인 후 강의예약 인서트
	 * @return 강의 예약하기 인서트
	 */
	@RequestMapping(value = "/subject/add", method=RequestMethod.POST)
	public String subject_add(HttpServletRequest request) {
		return null;
	}
	/**
	 * @param
	 * 필수 값 : user_id
	 * @return 헤더부분에서 나의 강의가능 버튼 누를시
	 */
	@RequestMapping(value = "/mylist")
	public String mycoatch(HttpServletRequest request) {
		return null;
	}
	
	/**
	 * @param :
	 * user_id, detail_subject_code
	 * @return : 헤더부분에서 러너검색시
	 */
	@RequestMapping( value = "/searchlist" )
	public String search_coatch(){
		return "";
	}
}
