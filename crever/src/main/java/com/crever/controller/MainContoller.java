package com.crever.controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.crever.service.MainService;
import com.crever.utils.DynamicValueObject;
import com.crever.utils.StringUtil;

@Controller
public class MainContoller {
@Inject MainService main_sevice;
	@RequestMapping(value = "/coach")
	public String coachList() {

		return "/layout/l_coatch_list";
	}

	// ----------------------------------------------------------------
	// 로그인 후 헤더의 설정 버튼 누를시 매핑 : 코치, 러너 같은 설정 규약을 가지고 있음
	/**
	 * @param
	 * @return 설정버튼 누를시 필수 값 :user_id
	 */
	@RequestMapping(value = "/option")
	public String option(HttpServletRequest request) {
		return "";
	}

	/**
	 * @return 나의정보 프로필보기 필수 값 :user_id
	 */
	@RequestMapping(value = "/option/user", method = RequestMethod.GET)
	public String user(HttpServletRequest request) {
		return "";
	}

	/**
	 * @return 나의정보 프로필 수정 필수 값 :user_id
	 */
	@RequestMapping(value = "/option/user", method = RequestMethod.POST)
	public String user_form(HttpServletRequest request) {
		return "";
	}

	/**
	 * @param
	 * @return 설정 최종 수정버튼 누를시 필수 값: user_id
	 */
	@RequestMapping(value = "/option/update")
	public String update(HttpServletRequest request) {
		return "";
	}

	/**
	 * @param
	 * @return 사진 인서트시 무조건 해당 메서드 탐 
	 * 필수 값: 
	 * user_id 
	 * image_type - 어떤 작업을 하면서 사진을 업로드하는지
	 * title_image_mf - 메인사진정보 담고 있는 객체
	 * submit_image_mf - 서브사진정보 담고 있는 객체
	 * request - 요청객체
	 * path 사진 업로드 경로
	 * table_name 테이블 이름
	 * index 테이블에서 작업 시퀀스
	 */
	@RequestMapping(value = "/image/add",method=RequestMethod.POST)
	public String image_add(
			HttpServletRequest request,
			MultipartFile title_image_mf,
			MultipartFile... submit_image_mf
			){
		
		HttpSession session = request.getSession();
		String path = request.getParameter("path");
		String table_name = request.getParameter("table_name");
		String index = request.getParameter("index");
		
		path = session.getServletContext().getRealPath(path);
		
		//메인사진 업로드
		inputStream(path, title_image_mf);
		List<MultipartFile> mul = new ArrayList<MultipartFile>();
		if(!title_image_mf.isEmpty()){mul.add(title_image_mf);}
		for(int i = 0 ; i < submit_image_mf.length ; i++){
			if(!submit_image_mf[i].isEmpty()){mul.add(submit_image_mf[i]);}
		}
		int len = mul.size();
		String[] before_arr = new String[len];
		String[] after_arr = new String[len];
		
		
		
		DynamicValueObject dy = new DynamicValueObject();
		dy.put("path", path.replaceAll("\\\\", "/"));
		dy.put("table_name", table_name);
		dy.put("index", index);
		
		for (int i = 0; i < mul.size() ; i++) {
			String img = inputStream(path, mul.get(i));
			before_arr[i] = img.split("\\|")[0];
			after_arr[i] = img.split("\\|")[1];
			
			dy.put("ori_image", before_arr[i]);
			dy.put("aft_image", after_arr[i]);
			dy.put("typeTS", "S");
			if(i == 0 && !title_image_mf.isEmpty()) {
				dy.put("typeTS", "T");
			}
			
			//쿼리 인서트 하기
			main_sevice.image_add(dy);
		}
		// 서브 사진들은 몇장이 나올지 모르니 컬럼하낭 |문자열 이어주는 파이프로 구분자로 줘서 데이터를 넣는다.
		String before_query = StringUtil.PipeArr(before_arr);
		String after_query = StringUtil.PipeArr(after_arr);
		return "layout/l_login";
	}

	public String inputStream(String path,MultipartFile mul){
		InputStream is;
		String img_name_before = null;
		String img_name = null;
		try {
			img_name_before = mul.getOriginalFilename();
			img_name = UUID.randomUUID() + "_" + img_name_before;
			is = mul.getInputStream();
			FileOutputStream fos = new FileOutputStream(path + "/" + img_name);
			FileCopyUtils.copy(is, fos);
			is.close();
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return img_name_before+"|"+img_name;
	}
}
