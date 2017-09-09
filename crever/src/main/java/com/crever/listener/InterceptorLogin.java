package com.crever.listener;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.crever.utils.StringUtil;

public class InterceptorLogin extends HandlerInterceptorAdapter{
	/**
	 * @version : java1.8 
	 * @author : ohs
	 * @date : 2017. 7. 25.
	 * @class :
	 * @message :
	 * @constructors :
	 * @method :
	*/
	private static final Logger logger = LoggerFactory.getLogger(InterceptorLogin.class);
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
		return super.preHandle(request, response, handler);
	}
}
