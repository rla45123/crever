<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<form action="/image/add" method="post" enctype="multipart/form-data">
	<input type="hidden" name="table_name" value="r_info_subject">
	<input type="hidden" name="path" value="/resources/img">
	<input type="hidden" name="index" value="1">
	대표이미지<input type="file" name=title_image_mf id="title_image_before"><br>
	서브이미지1<input type="file" name="submit_image_mf"><br>
	서브이미지2<input type="file" name="submit_image_mf"><br>
	서브이미지3<input type="file" name="submit_image_mf"><br>
	서브이미지4<input type="file" name="submit_image_mf"><br>
	서브이미지5<input type="file" name="submit_image_mf"><br>
	서브이미지6<input type="file" name="submit_image_mf"><br>
	서브이미지7<input type="file" name="submit_image_mf"><br>
	서브이미지8<input type="file" name="submit_image_mf"><br>
	<input type="submit" value="커밋">
</form>
</body>
</html>