<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script src="//code.jquery.com/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(
		function() {
			$url = "${url}";
			$message = "${message}";
			alert($message);
			//다음페이지로 파라미터를 가지고 가면 동적 form을 만듬
			if ("${obj}") {
				var $form = $('<form></form>');
				$form.attr('action', $url);
				$form.attr('method', 'GET');
				$form.appendTo('body');
				$str = "";
				<c:forEach var="i" items="${obj}">
				$str += ("<input type='hidden' name='${i.key}' value='${i.value}'>");
				</c:forEach>
				$form.append($str);
				$form.submit();
			} else {
				//파라미터를 가지고가지  않는다면 바로 페이지이동
				location.href = $url;
			}
	})
</script>
</head>
<body>

</body>
</html>