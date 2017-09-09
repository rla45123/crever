<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
  <!-- 
	********* header start *********
  -->
  <header class="header">
    <div class="container header">
		<ul class="header-menu text-center row">
			<li class="header-button pull-left">
				<a href="#" class="header-button">
					<div class="line-top"></div>
					<div class="line-middle"></div>
					<div class="line-bottom"></div>
				</a>
			</li>
			<li>
				<a href="#" class="header-logo">
					<img src="img/logo.png" alt="" title=""/>
				</a>
			</li>
			<li class="pull-right">
				<a href="#" class="header-user">
					<img src="img/person.png"  alt="" title=""/>
					<p>identity</p>
				</a>
			</li>
		</ul>
	</div>
  </header>
  <!-- 
	********* header end *********
  -->

  <!-- 
	********* section start *********
  -->
  <style>
  </style>
  <section class="section">
	<div class="container">
		<div class="row padding-line">
			<div class="text-wrap">
				<h1 class="text-center" style="font-size:30px;">
					안녕하세요!
				</h1>
				<p class="text-center" style="font-size:15px;">
					크레버에 오신 것을 환영합니다.
				</p>
			</div>
		</div>
		<style>
			.login-l-div{
				position:relative;
				width:560px;
				height:560px;
				float:left;
				border-radius:12px;
				background:#57c9e8;
			}
			.login-l-img{
				position:relative;
				width:522px;
				height:470px;
				top:46px;
				left:19px;
				right:19px;
				bottom:42px;
				/* background-image:url("img/section.png");
				background-repeat:no-repeat;
				background-position:center center;
				background-size:100% 100%; */
			}
			.row {
				margin-left: 0px;
			}
			.login-r-div{
				position:relative;
				width:560px;
				height:560px;
				float:left;
				/* background:green; */
			}
			.login-r-login{
				position:relative;
				width:500px;
				height:259px;
				top:80px;
				left:60px;
				bottom:457px;
				/* background:#ff6666; */
			}
			.login-r-ul{
				display:inline-block;
			}
			.login-r-ul li{
				display:inline-block;
				color:white;
				font-weight: bold;;
				margin:5px 0;
				/* padding-left:50px; */
			}


			.login-r-ul li img{
				width:48px;
				height:48px;
			}

			form{
				padding-top:24px;
			}
			form input{
				width:487px;
				height:40px;
			}

			label{
				font-size:12px;
				color:#939598;
			}

			h1{
				padding-top:21px;
				font-size:15px;
				text-align:center;
				color:#939598;
			}
			p{
				font-size:15px;
				text-align:center;
				color:black;
			}
			p a{
				font-weight:bold;
				color:black;
				text-decoration: underline
			}
			p a:hover{
				font-weight:bold;
				color:black;
				text-decoration: underline
			}
			p a:active{
				font-weight:bold;
				color:black;
				text-decoration: underline
			}
			.k {width:499px;height:48px;background:#fae100;}
			.f {width:499px;height:48px;background:#4267b2;}
			.n {width:499px;height:48px;background:#1EC800; }
			.login-txt{
				width: 403px;
			    text-align: center;
			    display: inline-block;
			}
				    
		</style>
		<div class="row padding-line">
			<div class="login-l-div">
				<div class="login-l-img" style="background-image:url('img/section.png');background-repeat:no-repeat;
				background-position:center center;background-size:100% 100%;">
				
				</div>
			</div>
			<div class="login-r-div">
				<div class="login-r-login">
					<ul class="login-r-ul">
						<li class="k"><img src="img/login/btn_kakao.png"/><div class="login-txt">카카오톡으로 시작하기</div></li>
						<li class="f"><img src="img/login/btn_facebook.png"/><div class="login-txt">페이스북으로 시작하기</div></li>
						<li class="n"><img src="img/login/btn_naver.png"/><div class="login-txt">네이버로 시작하기</div></li>
					</ul>
					<form>
						<div class="form-group">
							<label for="id">이메일로 시작하기</label>
							<input type="email" class="form-control" id="id">
						  </div>
					</form>
					


					<h1>아직 회원이 아니신가요?</h1>
					<p><a href="#">회원가입하기</a></p>
				</div>
				
			</div>
		</div>

	 </div>
   </section>
   <!-- 
	********* section end *********
    -->

	

	

  
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