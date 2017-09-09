<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
	window.onload = function() {
		var filter = "win16|win32|win64|mac";
		var device = "";
		if (navigator.platform) {
			if (0 > filter.indexOf(navigator.platform.toLowerCase())) {
				device = "M";
			} else {
				device = "P";
			}
		}
		var frm = document.Form;
		frm.device.value = device;
		frm.submit();
	}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="/l_index" name="Form">
		<input type="hidden" name="device">
	</form>
</body>
</html>