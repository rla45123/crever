package com.crever.listener;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.crever.utils.DynamicValueObject;
import com.crever.utils.StringUtil;

public class Interceptor extends HandlerInterceptorAdapter{
	/**
	 * @version : java1.8 
	 * @author : ohs
	 * @date : 2017. 7. 25.
	 * @class :
	 * @message :
	 * @constructors :
	 * @method :
	*/
	private static final Logger logger = LoggerFactory.getLogger(Interceptor.class);
	//컨트롤러 호출전
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		
		//요청 url, request에 담겨온 파라미터 리스트 콘솔출력
		logger.info("######################################################################");
		logger.info(request.getRequestURI());
		Enumeration params = request.getParameterNames();
		while (params.hasMoreElements()){
			String name = (String)params.nextElement();
			logger.info(name + " : " +request.getParameter(name));
		}
		logger.info("######################################################################");
		
		//로그인 체크
		HttpSession session = request.getSession();
		String user_id = (String) session.getAttribute("user_id");
		
		//세션에 데이터가 존재하지 않는다면 로그인을 안함 유저라는뜻
		if(StringUtil.StringNullCheck(user_id)) {
			request.setAttribute("url", "/intro");
			request.setAttribute("message", "로그인 해야합니다.");
			request.getRequestDispatcher("/WEB-INF/views/result/state.jsp").forward(request, response); ;
		}	
		
		//user_id 파라미터가 넘어올경우 유저 정보를 셀렉트해오기
		if(StringUtil.StringNullCheck(request.getParameter("user_id"))) {

			DynamicValueObject dy = new DynamicValueObject();
			request.setAttribute("INTuser", dy);
		}
		
		return super.preHandle(request, response, handler);
	}
	//컨트롤러에서 view 가기전
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		super.postHandle(request, response, handler, modelAndView);
	}
	
	//view끝나고나서
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
		// TODO Auto-generated method stub
		super.afterCompletion(request, response, handler, ex);
	}
}
