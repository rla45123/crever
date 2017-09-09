<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link rel="stylesheet" href="plugin/jqueryui_css/jquery-ui.css" type="text/css" />
<script src="plugin/jqueryui_js/jquery.js"></script>
<script src="plugin/jqueryui_js/jquery-ui.js"></script>
<script src="script/datePicker.js"></script>
<style type="text/css">
.ui-datepicker{width:90%;height: 500px;background-image: url("img/schdule_background.jpg");}
.ui-state-default{height: 60px; }
.ui-datepicker-header{color:white;}
.ui-datepicker-calendar th span{color:white}
</style>
<script>
	$(document).ready(function() {
		$("#dateTo").focus();
	})
	function schedule_time_list_barind(data){
		$.each(data,function(i,result){
			var getTime = result.time.replace("-","");
			var startTime = getTime.substring(0,2);
			var endTime = getTime.substring(2.4);
			var state = "";
			state = result.stateYN === ""?"강의가 존재하지 않습니다":result.stateYN === "N"?"강의신청가능":"강의신청마감";
			
			var str = "<tr><td>" + startTime + "~" + endTime + "</td><td>" + state + "</td></tr>";
			$("#schedule_time_list").append(str);
		});
	}
</script>
</head>
<body>
	<form name="Form" id="Form">
		<table>
				<tr>
					<td><input name="user_id" type="hidden" id="user_id" value="ohs"></td>
				</tr>
				<tr>
					<td><input name="detail_subject_code" type="hidden"
						id="detail_subject_code" value="3"></td>
				</tr>
				<tr>
					<td><input name="dateTo" type="text" id="dateTo"
						readonly="readonly"></td>
				</tr>
		</table><br><br><br><br><br><br><br><br><br><br><br><br><br>
		<table id="schedule_time_list">
		</table>
	</form>
</body>
</html>