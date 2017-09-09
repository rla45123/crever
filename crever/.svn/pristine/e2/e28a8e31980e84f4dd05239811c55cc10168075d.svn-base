package com.crever.utils.login;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class FaceBook 
{
	//App Id 
	private static final String app_id = "373436319720815";
			
	//redirect_url
	private static final String redirect_url = "http://192.168.0.38:8090/facebooklogin";
			
	//Get Code
	private static final String get_code = "https://www.facebook.com/dialog/oauth?client_id=";
	
	//client secret
	private static final String client_secret = "fdd92fc7dc88648161f08d36e72f810c";
		
	//클라이언트 토큰 : d45b6902c204db2f32005d5a51a9886c
	//Get token
	private static final String get_token = "https://graph.facebook.com/v2.3/oauth/access_token?client_id=";
	
	//get info
	private static final String get_info = "https://graph.facebook.com/v2.7/me?fields=id%2Cname%2Cemail%2Cgender%2Cpicture&access_token=";
	
	//코드 받기
	public static String facebookcode()
	{
		return get_code+app_id+"&redirect_uri="+redirect_url+"&scope=user_about_me,email";
	}
	
	//토큰 받기
	public static String facebooktoken(String code)
	{
		return jsonparsing(requestpost(get_token+app_id+"&redirect_uri="+redirect_url+"&client_secret="+client_secret+"&code="+code,"GET",null));
		/* 
		 jsonObject:{"
		 access_token":"EAAFTo2su5W8BAEZCri77cH3vfgX0ah656VUcukQzojHDp2JWURFTQwFuywXr7LPbOfQEPotCEaHrevupypu9l20CTTiZAsBqQmy4645ilvIBCd1RdO7VFXXqkNJPjtDD7UZCoZASNAF3aew1TM32GweBay2vQD0ZD",
		 "token_type":"bearer",
		 "expires_in":5183745}
		 */
	}
	
	//프로필 받기
	public static Map<String,String> facebookinfo(String token){
		return infojsonparsing(requestpost(get_info+token,"GET",null));
	}
	
	//TODO : POST Request
	public static String requestpost(String requesturl,String method,String authorization){
		URL url = null;
		HttpURLConnection httpurlconn = null;
		BufferedReader br = null;
		StringBuffer sb = null;
		String requestvalue = null;
		String responseresult = null;
				
		try{
			url = new URL(requesturl);
			httpurlconn = (HttpURLConnection)url.openConnection();
			httpurlconn.setRequestMethod(method);
					
			if(authorization != null){
				httpurlconn.setRequestProperty("Authorization",authorization);					
			}
					
			httpurlconn.setDoOutput(true);
			httpurlconn.connect();
					
			br = new BufferedReader(new InputStreamReader(httpurlconn.getInputStream(),"UTF-8"));
			sb = new StringBuffer();
					
			while((requestvalue=br.readLine())!=null){
				sb.append(requestvalue);
				sb.append("\n");
			}
			responseresult = sb.toString();
					
		}catch(MalformedURLException e){
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
		return responseresult;
	}
	
	public static String jsonparsing(String accesstoken){
		JSONParser jsonparser = new JSONParser();
		
		try {
			JSONObject jsonObject = (JSONObject)jsonparser.parse(accesstoken);
			String parsingtoken = (String) jsonObject.get("access_token");
			return parsingtoken;
		} catch (ParseException e) {

			e.printStackTrace();
		}
	
		return null;
	}
	
	public static Map<String,String> infojsonparsing(String info) {
		JSONParser jsonparser = new JSONParser();
		
		try {
			JSONObject jsonObject = (JSONObject)jsonparser.parse(info);
			System.out.println("jsonObject :"+jsonObject);
			Map<String,String> map = new HashMap<String,String>();
			map.put("gender", (String)jsonObject.get("gender"));
			map.put("name", (String)jsonObject.get("name"));
			map.put("id", (String)jsonObject.get("id"));
			return map;
		} catch (ParseException e) {

			e.printStackTrace();
		}
	
		return null;
	}
			
}
