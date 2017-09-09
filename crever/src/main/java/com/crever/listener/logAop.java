package com.crever.listener;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.crever.utils.DynamicValueObject;
import com.crever.utils.StringUtil;

@Aspect
public class logAop {

	@Value("#{props['login.check.url']}")
	private String login_check_url;
	private static final Logger logger = LoggerFactory.getLogger(logAop.class);

	@Around("(execution(* com.crever.app..*.*(..)) || execution(* com.crever.controller..*.*(..))) && !execution(* com.crever.controller..AjaxController.*(..))")
	public Object setMapParamter(ProceedingJoinPoint joinPoint) throws Throwable {

		// request, response 객체 얻어오기
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes())
				.getRequest();
		HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes())
				.getResponse();

		// 요청 url, request에 담겨온 urlm 파라미터 리스트 콘솔출력
		logger.info("######################################################################");
		logger.info("URL : " + request.getRequestURI());
		Enumeration params = request.getParameterNames();
		while (params.hasMoreElements()) {
			String name = (String) params.nextElement();
			logger.info("파라미터 : " + name + " - " + request.getParameter(name));
		}
		logger.info("######################################################################");

		// 로그인체크해야 하는 url과 아닌 url 구분후 분기처리
		// 로그인을 안해도 되는 url 리스트는 properties에 정의되어 있음
		String[] url_arr = login_check_url.split("\\|");
		boolean chk_yn = true;
		for (String chk_url : url_arr) {
			if (chk_url.equals(request.getRequestURI())) {
				chk_yn = false;
				break;
			}
		}
		if (chk_yn) {
			// 로그인 체크
			HttpSession session = request.getSession();
			String user_id = (String) session.getAttribute("user_id");

			// 세션에 데이터가 존재하지 않는다면 로그인을 안함 유저라는뜻
			if (StringUtil.StringNullCheck(user_id)) {
				request.setAttribute("url", "/intro");
				request.setAttribute("message", "로그인 해야합니다.");
				return "result/state";
			}

			// user_id 파라미터가 넘어올경우 유저 정보를 셀렉트해오기
			if (StringUtil.StringNullCheck(request.getParameter("user_id"))) {

				DynamicValueObject dy = new DynamicValueObject();

				// 유저정보
				request.setAttribute("INTuser", dy);
			}
		}
		
		return joinPoint.proceed();
	}
}
