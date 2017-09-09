<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/plain; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<p>청기와랩 SMS TEST INSERT FORM</p>
	
	<br/>
	
	<form action="/send" method="POST" class="form">
		받는폰번호:<input type="text" name="phonenumber" id="phonenumber"/><br/>
		받는사람 이름:<input type="text" name="recivename" id="recivename"/>
		<input type="submit" name="sendsms"/>
		<input type="reset"/>
	</form>

<script>
</script>
</body>
</html>