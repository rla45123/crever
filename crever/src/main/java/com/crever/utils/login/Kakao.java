package com.crever.utils.login;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;



/**
 * @author :김남준
 * @date :2017. 6. 3.
 */
/*
 * 
 * 네이티브 앱 키32cc90a5f60373c0bcc2f490daf82aaf
 * REST 
 * API 키
 * JavaScript 키b40c7dfe38a896ca82875b89f6659aee
 * Admin 키e0537a67ca9df2e8ef3c6cf481303587
 * */
public class Kakao 
{
	//API KEY
	private static final String api_key = "4b848f489e865048fed61d3d0d0c449a";
	
	//Redirect URL 
	private static final String redirect_url ="http://192.168.0.38:8090/kakaologin";
	
	//host_key
	private static final String host_key ="https://kauth.kakao.com";

	//code key
	private static final String code_key ="/oauth/authorize?";
	
	//AccessToken key
	private static final String acesstoken_key="/oauth/token?grant_type=authorization_code";
	
	//id key
	private static final String id_key="https://kapi.kakao.com/v1/user/access_token_info";
	
	//Profile key
	private static final String profile_key="https://kapi.kakao.com/v1/api/talk/profile?access_token=";
	
	//CODE
	public static String requestCode() throws Exception
	{
		String getcode = host_key+code_key+"client_id="+api_key+"&redirect_uri="+redirect_url+"&response_type=code";
		return getcode;
	}
	
	//Accesstoken_key
	public static Map<String, String> requesttoken(String code) throws Exception{
		
		String request_token =host_key+acesstoken_key+"&client_id="+api_key+"&redirect_uri="+redirect_url+"&code="+code;	
		Map<String,String> parsingmapdata=jsonparsing(requestpost(request_token,null,"POST"));
		/*
		 responseresult : {
			 "access_token":"NGAeHLLfvA_YJ_PMb4iyaN-i1beELyMkH9Krngo8BVUAAAFcbWfp1g",
			 "token_type":"bearer",
			 "refresh_token":"AgkzAx3VSnIgvpXP1kvMySfH0tWrJj-HGlnjrwo8BVUAAAFcbWfp0Q",
			 "expires_in":21599,
			 "scope":"account_email profile"
		 }
		 */
		return parsingmapdata;
	}
	
	//아이디 받기
	public static String requestid(String token) throws Exception{
		String request_id= id_key;
		Map<String,String> mapid=jsonparsing(requestpost(request_id,token,"GET"));
		
		return (String)mapid.get("id");
	}
	
	//프로필받기
	public static Map<String,String> requestprofile(String accesstoken) throws Exception{
		String request_profile = profile_key+accesstoken;
		Map<String,String> parsingprofile=jsonparsing(requestpost(request_profile,null,"POST"));
		
		return parsingprofile;
	}
	
	

	//TODO : POST Request
	public static String requestpost(String getAccesstokenurl,String token,String method){
		URL url = null;
		HttpURLConnection httpurlconn = null;
		BufferedReader br = null;
		StringBuffer sb = null;
		String requestvalue = null;
		String responseresult = null;
			
		try{
			url = new URL(getAccesstokenurl);
			httpurlconn = (HttpURLConnection)url.openConnection();
				
			if(token!=null){
				httpurlconn.setRequestProperty("Content-Type","application/x-www-form-urlencoded;charset=utf-8");
				httpurlconn.setRequestProperty("Authorization","Bearer "+token);
			}else{
				httpurlconn.setRequestProperty("Content-Type","application/json;charset=UTF-8");
			}
				
			httpurlconn.setRequestMethod(method);
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
	
	//TODO : JSON Data Parsing
	public static Map<String,String> jsonparsing(String parsingdata){
		Map<String,String> map = new HashMap<String, String>();
		ObjectMapper omp = new ObjectMapper();
		try{
			map = omp.readValue(parsingdata,new TypeReference<HashMap<String,String>>(){
		});
		}catch(JsonParseException e){
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
			
		return map;
	}
}
