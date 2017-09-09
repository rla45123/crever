package com.crever.controller;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crever.service.AjaxService;
import com.crever.utils.DynamicValueObject;

@Controller
@RequestMapping(value="/ajax/*")
public class AjaxController {
	
	@Inject AjaxService ajax_service;
	/*
	 * 1.web 에서 4가지 과목을 가져오는 쿼리를 담는 공통 메서드
	 * 2.app에서 사용할수있는 4가지 쿼리를 가진 공통 메서드
	 * 
	 * */
	/**
	 * @param :
	 * 필수 값 : 
	 * dateTo 사용자가 선택한 날짜
	 * user_id 코치 아이디
	 * detail_subject_code 하위분류과목 
	 * @return :
	 */
	DynamicValueObject dy = null;
	@RequestMapping(value="/getDateTime",produces="applicatioin/json;charset=utf-8")
	public @ResponseBody String getDateTime(HttpServletRequest request) {
		dy = new DynamicValueObject(request);
		dy.addValue("date_to", request.getParameter("dateTo").replaceAll("-",""));
		
		List<DynamicValueObject> list = new ArrayList<DynamicValueObject>();
		list = ajax_service.getDateTime(dy);
		
		JSONArray arr = new JSONArray();
		for(int i = 0 ; i < list.size() ; i++) {
			JSONObject jo=new JSONObject();
			jo.put("time", list.get(i).getString("time"));
			jo.put("stateYN", list.get(i).getString("stateYN"));
			arr.put(jo);
		}
		return arr.toString();
	}
}
