<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html lang="ko">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    
    <title>Main</title>
    
    <link href="plugin/bootstrap_css/bootstrap.css" rel="stylesheet">
    <link href="css/header/header.css" rel="stylesheet">
    
    <!-- IE8 에서 HTML5 요소와 미디어 쿼리를 위한 HTML5 shim 와 Respond.js -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    
	<style>
	

	</style>
  </head>
  <body>
  <header class="header">
    <div class="container header">
		<ul class="header-menu text-center row">
			<li class="header-button pull-left col-md-3 col-sm-3 col-lg-3">
				<a href="#" class="header-button">
					<div class="line-top"></div>
					<div class="line-middle"></div>
					<div class="line-bottom"></div>
				</a>
			</li>
			<li class="col-md-6 col-sm-6 col-lg-6">
				<a href="#" class="header-logo">
					<img src="img/logo.png" alt="" title=""/>
				</a>
			</li>
			<li class="pull-right col-md-3 col-sm-3 col-lg-3">
				<a href="#" class="header-user">
					<img src="img/person.png"  alt="" title=""/>
					<p>
					<c:if test="${session_yn eq 'n' }">
						Login / Join
					</c:if>
					<c:if test="${session_yn eq 'y' }">
						회원아이디
					</c:if>
					</p>
				</a>
			</li>
		</ul>
	</div>
  </header>
  
  
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
			<img src="img/google-img.png" />
		</div>
	</div>
  </section>
  
  
  <footer class="footer">
	<div class="container">
		<div class="padding-line">
			<ul class="foot-menu">
				<li><a href="#" ><img src="img/foot-logo.png" class="foot-img"/></a></li>
				<li><a href="#" >기본주소 입력</a></li>
				<li><a href="#" >세부주소 입력</a></li>
				<li><a href="#" >02.222.2222</a></li>
				<li><a href="#" >info@crever.com</a></li>
				<li><a href="#" >© 2017 CREVER. All Rights Reserved.</a></li>
			</ul>
		</div>
	</div>
  </footer>
  
    <!-- jQuery (부트스트랩의 자바스크립트 플러그인을 위해 필요합니다) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <!-- 모든 컴파일된 플러그인을 포함합니다 (아래), 원하지 않는다면 필요한 각각의 파일을 포함하세요 -->
    <script src="plugin/bootstrap_js/bootstrap.js"></script>
  </body>
</html>