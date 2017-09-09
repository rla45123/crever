package com.crever.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/runner/*")
public class RunnerController {
	
	
	/*★★★★★★★★★★★★★★★★
	러너 프로세스 대표적인 순서
	메인페이지 > 하위분야 > 최종분야 > 코치리스트 > 코치상세보기 > 일정예약
	@param subject_code (상위분야의 과목)
	ex: 전문자격, 문화예술, 숙련기술, 생활재능
	
	@param detail_subject_code (하위분야의 과목)
	ex: 법률, 의류, 경제, 공직 등등
	*/
	
	/**
	 * @param
	 * 필수 값: subject_code(상위분야과목의 시퀀스)
	 * @return 메인페이지에서 분야 선택 후 하위분야로 이동
	 */
	@RequestMapping(value = "/subject")
	public String subject(HttpServletRequest request) {
		return null;
	}
	
	
	/**
	 * @param
	 * 필수 값: location_code(나의 관심지역 지역시퀀스)
	 * @return 하위분야과목에서 재능코치 만나기
	 */
	@RequestMapping(value = "/subject/joincoatch")
	public String subject_joincoatch(HttpServletRequest request) {
		return null;
	}
	
	/**
	 * @param
	 * 필수 값 : subject_code(상위분야과목의 시퀀스)
	 * @mesage 상위분야과목 시퀀스로 해당 과목을 교육한 수업들, 수업의 후 가져오기
	 * @return 상위분야과목에서 생생후기
	 */
	@RequestMapping(value = "/subject/review")
	public String subject_review(HttpServletRequest request) {
		return null;
	}
	
	/**
	 * @param
	 * 필수 값 : detail_subject_code
	 * @return 하위분야 리스트에서 하위분야 상세보기시   해당분야의 코치리스트 페이지로 이동
	 */
	@RequestMapping(value = "/subject/coatch")
	public String subject_coatch(HttpServletRequest request) {
		return null;
	}
	
	/**
	 * @param
	 * 필수 값 : coatch_code
	 * @return 코치리스트에서 코치 선택시 상세보기 페이지로 이동
	 */
	@RequestMapping(value = "/subject/coatch/detail")
	public String subject_coatch_detail(HttpServletRequest request) {
		return null;
	}
	
	/**
	 * @param
	 * 필수 값: coatch_code
	 * @return 코치 상세보기에서 찜하기 선택시
	 */
	@RequestMapping(value = "/subject/coatch/detail/choice")
	public String subject_coatch_detail_choice(HttpServletRequest request) {
		return null;
	}
	
	/**
	 * @param
	 * 필수 값: coatch_code(코치시퀀스), detail_subject_code(하위분야과목시퀀스)
	 * @return 코치 상세보기에서 일정 예약하기 선택시
	 */
	@RequestMapping(value = "/subject/coatch/detail/schedule")
	public String subject_coatch_detail_schedule(HttpServletRequest request) {
		return null;
	}
	
	/**
	 * @param
	 * 필수 값: detail_subject_code(하위분야과목시퀀스), class_date(강의날짜)
	 * @return 일정화면에서 강의신청 선택시 해당 강의의 시간별 예약 페이지로
	 */
	@RequestMapping(value = "/subject/coatch/detail/schedule/check")
	public String subject_detail_schedule_check(HttpServletRequest request) {
		return null;
	}
	/**
	 * @param
	 * 필수 값: coatch_code(코치시퀀스), detail_subject_code(하위분야과목시퀀스), class_date(강의날짜), class_time(강의시간), class_state(강의상태표시)
	 * 기타 등등 결제연동에 필요한 데이터들 
	 * @return 예약페이지에서 최종예약할시 결제 연동 url로 request보내기
	 */
	@RequestMapping(value = "/subject/coatch/detail/schedule/check/add")
	public String subject_detail_schedule_check_add(HttpServletRequest request) {
		return null;
	}
	
	//-----------------------------------------------------------------------
	
	/**
	 * @param
	 * @return 헤더부분에서 나의 코치리스트
	 */
	@RequestMapping(value = "/mylist")
	public String mylist(HttpServletRequest request) {
		return null;
	}
	
	/**
	 * @param :
	 * @return : 헤더부분에서 코치검색시
	 */
	@RequestMapping( value = "/searchlist" )
	public String searchlist(){
		return "";
	}
}
