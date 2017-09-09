package com.crever.utils.login;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class Naver {
	//Client id
	private static final String client_id = "YbZwLwe7otmR57Nu4CfU";
	
	//Client Secret
	private static final String client_secret = "0AttaWAC0d";
	
	//redirect_uri
	private static final String redirect_uri = "http://192.168.0.38:8090/naverlogin";
	
	//naver get Code
	private static final String getcode = "https://nid.naver.com/oauth2.0/authorize?client_id="+client_id+"&response_type=code&redirect_uri="+redirect_uri+"&state=";
	
	//naver get token
	private static final String gettoken = "https://nid.naver.com/oauth2.0/token?client_id="+client_id+"&client_secret="+client_secret+"&grant_type=authorization_code";
	
	//naver get info
	private static final String getinfo = "https://apis.naver.com/nidlogin/nid/getUserProfile.xml";
	
	//자바보안
	public static String generateState() throws Exception
	{
		SecureRandom random = new SecureRandom();
		return new BigInteger(130,random).toString(32);
	}
	
	//code 요청
	public static final String navercode() throws Exception
	{
		return getcode+generateState();
	}
	
	//toke 요청
	public static Map<String,String> navertoken(String state, String code) {
		return jsonparsing(requestpost(gettoken+"&state="+state+"&code="+code,"POST",null));
		/*
		  responseresult :{
			"access_token":"AAAAOgJVWggGjIijbn5tS3b54ntr4BsZWAxsDdC7bS5O6+L1rpacUpT/OYlsq11/a6rT1lg4AUjHoxZVwTJx9Y9LyTc=",
			"refresh_token":"N72JQqOqUbeHYjFSxJOIatnYvNtxisedD1wjPipezEuyWisO2tH3Yb2NzU50uu110NMpKB4B91QbyOg7ZFqxCHHagcRDVcyGPiijT0GUyxMvYj4N88BTtGEj9ahtOB3UhnQQ",
			"token_type":"bearer",
			"expires_in":"3600"
			}
		*/
	}
	
	//프로필 요청
	public static String naverinfo(String token_type,String access_token){
		String authorization = token_type + " " + access_token;
		return requestpost(getinfo,"POST",authorization);
	}
	
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
			System.out.println("responseresult:"+responseresult);
		}catch(MalformedURLException e){
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
		return responseresult;
	}
	
	public static Map<String,String> jsonparsing(String accesstoken){
		JSONParser jsonparser = new JSONParser();
		
		try {
			JSONObject jsonObject = (JSONObject)jsonparser.parse(accesstoken);
			Map<String,String> map = new HashMap<String,String>();
			map.put("token_type",(String)jsonObject.get("token_type"));
			map.put("access_token", (String) jsonObject.get("access_token"));
			return map;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return null;
	}
	
	public static JSONObject infojsonparsing(String accesstoken){
		JSONParser jsonparser = new JSONParser();
		
		try {
			JSONObject jsonObject = (JSONObject)jsonparser.parse(accesstoken);
			return jsonObject;
		} catch (ParseException e) {
			e.printStackTrace();
		}
	
		return null;
	}
}
