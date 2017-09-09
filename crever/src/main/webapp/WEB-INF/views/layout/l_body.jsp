<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../common/header.jsp"%>

  <section class="section">
	<div class="container">
		<div class="row padding-line">
			<div class="main-intro">
			  <div>
				<img src="img/shader.png" alt="" title="" class="img-rounded" />
				
			  </div>
			  
			</div>
		</div>
		<div class="row padding-line">
		<div class="text-wrap">
			<h1 class="text-center" style="font-size:30px;">
				새로운 개념의 은퇴자 재능전수
				CREVER 를 소개합니다.
			</h1>
			<p class="text-center" style="font-size:15px;">
				크레버는 은퇴세대와 현세대를 이어주기 위한 새로운 재능기부 플랫폼입니다.
			</p>
		</div>
		</div>
		<div class="row section-img">
			<img src="img/section.png" />
		</div>
		<div class="row section-img text-center padding-line">
			
				<img id="google" src="img/google-img.png" />
			
		</div>
	</div>
  </section>

<%@include file="../common/footer.jsp"%>

  <script>
  	$("#google").click(function(){
  		self.location = "https://play.google.com/store/apps?utm_source=apac_med&utm_medium=hasem&utm_content=Feb2317&utm_campaign=Evergreen&pcampaignid=MKT-DR-apac-kr-1000277-med-hasem-ap-Evergreen-Feb2317-Text_Search_BKWS-BKWS%7cONSEM_kwid_43700009359644046_creativeid_96242361065_device_c&gclid=Cj0KCQjwktHLBRDsARIsAFBSb6wL_jAJSQ32YI_ewd2FlcdA24SxTs08Rfj-1xETbjA53vqWC1xhDWQaAno9EALw_wcB&gclsrc=aw.ds&dclid=CNTr5rGqoNUCFREPKgodz58Jjw";
  	});
  </script>