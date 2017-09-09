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