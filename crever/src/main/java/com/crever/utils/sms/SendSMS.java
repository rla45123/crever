package com.crever.utils.sms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.BasicAuthCache;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.client.AuthCache;
import org.apache.http.HttpHost;
import org.apache.http.client.protocol.HttpClientContext;

public final class SendSMS {
	
	public void Senduser(String phonenumber,String recivename) {
		System.out.println("phonenumber :"+phonenumber);
		System.out.println("recivename :"+recivename);
		
		String hostname = "api.bluehouselab.com";
	    String url = "https://"+hostname+"/smscenter/v1.0/sendsms";

	    CredentialsProvider credsProvider = new BasicCredentialsProvider();
	    //CredentialsProvider : 공용인터페이스이며, 사용자의 자격증명 모음을 유지관리하는 작격증명 공급자
	    //BasicCredentialsProvider() : CredentialsProvider 를 구현하는 클래스 입니다.
	    
	    credsProvider.setCredentials(
	    	//setCredentials : 지정된 인증 스코프를 설정하여, 지정된 범위에 대한 이전 자격 증명을 덮어쓴다.
	    	new AuthScope(hostname, 443, AuthScope.ANY_REALM),
	    	//AuthScope : 호스트이름,포트번호,영역이름 및 인증체계 이름으로 구성된 인증 범위를 설정한다.
	    	new UsernamePasswordCredentials(Config.appid, Config.apikey)
	    	//UsernamePasswordCredentials : 사용자의 이름/암호 의 자격 증명을 위한 구현.
	    );

	    // Create AuthCache instance
	    AuthCache authCache = new BasicAuthCache();
	    //AuthCache : 캐시의 초기화된 객체를 사용하여 알려진 호스트에 대해 사전에 인증할수있다.
	    //BasicAuthCache : 기본 구현 AuthCache. 이 구현 은 캐시가 가능하다.
	    
	    authCache.put(new HttpHost(hostname, 443, "https"), new BasicScheme());
	    //HttpHost : 호스트에 대한 HTTP 연결을 설명하는 데 필요한 모든 변수를 보유합니다. 
	    //			  여기에는 원격 호스트 이름, 포트 및 구성표가 포함됩니다.
	    //BasicScheme : 공용 클래스 BasicScheme 은 RFC2617Scheme을 확장 합니다. RFC 2617에 정의 된 기본 인증 체계.

	    // Add AuthCache to the execution context
	    HttpClientContext context = HttpClientContext.create();
	    //HttpContextHTTP : 요청 실행 과정에서 사용되는 공통 속성에 대해 편리한 형식의 안전한 setter 및 getter를 제공하는 어댑터 클래스입니다 .
	    context.setCredentialsProvider(credsProvider);
	    context.setAuthCache(authCache);

	    DefaultHttpClient client = new DefaultHttpClient();
	    //DefaultHttpClient : HttpClient가장 일반적인 사용 시나리오를 위해 미리 구성된 기본 구현입니다 .

	    try {
	       HttpPost httpPost = new HttpPost(url);
	       //POST 메소드는 원 서버가 요청에 포함 된 엔티티를 Request-URI의 Request-URI에 의해 식별 된 자원의 새로운 하위 노드로 수락하도록 요청하는 데 사용됩니다. 
	       httpPost.setHeader("Content-type", "application/json; charset=utf-8");
	       String json = "{\"sender\":\""+Config.sender+"\",\"receivers\":[\""+phonenumber+"\"],\"content\":\""+recivename+Config.content+"\"}";
	       System.out.println("json :"+json);
	       StringEntity se = new StringEntity(json.toString(), "UTF-8");
	       //StringEntity: 콘텐츠를 가져 오는 자기 포함되고 반복 가능한 개체 String.
	       
	       httpPost.setEntity(se);

	       HttpResponse httpResponse = client.execute(httpPost, context);
	       //HttpResponse : 요청 메시지를 수신하고 해석 한 후 서버는 HTTP 응답 메시지로 응답합니다.
	       System.out.println(httpResponse.getStatusLine().getStatusCode());

	       InputStream inputStream = httpResponse.getEntity().getContent();
	       if(inputStream != null) {
	    	   BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(inputStream));
	           String line = "";
	           while((line = bufferedReader.readLine()) != null)
	                System.out.println(line);
	                inputStream.close();
	           }
	     }catch(Exception e) {
	    	 System.err.println("Error: "+e.getLocalizedMessage());
	     } finally {
	         client.getConnectionManager().shutdown();
	         //이 클라이언트가 사용하는 연결 관리자를 가져와 종료합니다.
	     }

	}
}
