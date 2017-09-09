<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- IE8 에서 HTML5 요소와 미디어 쿼리를 위한 HTML5 shim 와 Respond.js -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  <!-- 
	********* header end *********
  -->

  <!-- 
	********* section start *********
  -->
  
  <%@include file="../common/header.jsp"%>
  <style>
	.row {
		margin-left: 0px;
	}
	.attention-div-wrap{
		width:1120px;
		height:240px;
		margin-top:40px;
		position:relative;
		/* background:black; */
		border-radius: 20px;
		background-color: #ffffff;
		box-shadow: 0px 5px 20px 0 rgba(0, 0, 0, 0.1);
		background-image:url("img/layer-2.png");
		background-repeat:no-repeat;
		background-size:240px 240px;
	}
	.attention-l-div{
		width:300px;
		height:240px;
		float:left;
		/* background:red; */
	}
	.circle{
		width:120px;
		height:120px;
		border-radius:50%;
		position:relative;
		top:60px;
		left:180px;
		background-image:url('img/test/person.png');
		background-size:100% 100%;
		background-repeat:no-repeat;
	}
	.attention-r-div{
		width:820px;
		height:240px;
		float:left;
	}
	.attention-r-div-txt{
		width:782px;
		height:192px;
		margin-top:24px;
		margin-left:18px;
		margin-right:18px;
		margin-bottom:24px;
	}
	.attention-ptag{
		font-size:20px;
		color:#57c9e8;
		text-align:left;
	}
	.attention-ptag-sub{
		font-size:30px;
		color:black;
		text-align:left;
	}
	[class*="span"] {
		float: left;
		min-height: 1px;
		margin-left: 0px;
		margin-top:5px;
	}
	.attention-spantag-sub{
		font-size:15px;
		color:black;
		text-align:left;
	}
/*
	코치 리스트
*/
	.coach-list-wrap{
		width:1120px;
		height:240px;
		margin-top:40px;
	}
	.coach-list-ldiv{
		width:520px;
		height:240px;
		float:left;
		margin-left:20px;
		margin-right:20px;
		border-radius: 20px;
		background-color: #ffffff;
		box-shadow: 0px 5px 20px 0 rgba(0, 0, 0, 0.1);
		background-image:url("img/layer-3.png");
		background-repeat:no-repeat;
		background-size:180px 240px;
	}
	.coach-list-rdiv{
		width:520px;
		height:240px;
		float:left;
		margin-left:20px;
		margin-right:20px;
		border-radius: 20px;
		background-color: #ffffff;
		box-shadow: 0px 5px 20px 0 rgba(0, 0, 0, 0.1);
		background-image:url("img/layer-3.png");
		background-repeat:no-repeat;
		background-size:180px 240px;
	}
	.coach-circle-div-wrap{
		width:220px;
		height:240px;
		float:left;
		/* background:blue; */
	}
	.coach-txt-div-wrap{
		width:280px;
		height:240px;
		margin-left:20px;
		float:left;
	}
	.coach-list-circle{
		width:80px;
		height:80px;
		border-radius:50%;
		position:relative;
		top:20px;
		left:140px;
		background-color:#ffffff;
	}
	.coach-txt-div{
		width:249px;
		height:169px;
		margin-top:41px;
		margin-left:0px;
		margin-right:31px;
		margin-bottom:30px;
		overflow:hidden;
	}
	.coach-h1{
		text-align:left;
		font-size:20px;
		font-weight:normal;
	}
	.coach-p{
		text-align:left;
		font-size:15px;
		font-weight:normal;
	}




	/* .coach-list-txt{
		width:249px;
		height:169px;
		margin-top:41px;
		margin-left:20px;
		margin-right:31px;
		margin-bottom:30px;
		background:blue;
	} */
	
  </style>
   <section class="section">
		<div class="container">
			<div class="attention-div-wrap">
				<div class="attention-l-div">
					<div class="circle">
						
					</div>
				</div>
				<div class="attention-r-div">
					<div class="attention-r-div-txt">
						<h1 class="attention-ptag">주목할만한 강좌</h1>
						<p class="attention-ptag-sub">
							김교수 코치의 폐암 환자와 가족,
						</p>
						<p class="attention-ptag-sub">
							일반인을 위한 건강강좌
						</p>
						<span class="attention-spantag-sub">
							주목할만한 강좌 설명이 들어갈 공간입니다. 주목할만한 강좌 설명이 들어갈 공간입니다. 주목할만한 강좌 설명이 들어갈 공간입니다.
							주목할만한 강좌 설명이 들어갈 공간입니다. 주목할만한 강좌 설명이 들어갈 공간입니다. 주목할만한 강좌 설명이 들어갈 공간입니다.
							주목할만한 강좌 설명이 들어갈 공간입니다. 주목할만한 강좌 설명이 들어갈 공간입니다. 주목할만한 강좌 설명이 들어갈 공간입니다.
						</span>
					</div>
				</div>
			</div>

			<!--420 -  (20)|520|40|520|(20)  - 420-->
			<div class="coach-list-wrap">
				<div class="coach-list-wrap">
					<div class="coach-list-ldiv">
						<div class="coach-circle-div-wrap">
							<div class="coach-list-circle"></div>
						</div>
						<div class="coach-txt-div-wrap">
							<div class="coach-txt-div">
								<h1 class="coach-h1">
									김교수 코치
								</h1>
								<p class="coach-p">
									강좌 제목이 들어갈 공간입니다.
								</p>
								<p class="coach-p">
									강좌 내용이 들어갈 공간 입니다. 강좌 내용이 들어갈 공간 입니다. 강좌 내용이 들어갈 공간 입니다. 강좌 내용이 들어갈 공간 입니다. 강좌 내용이 들어갈 공간 입니다. 강좌 내용이 들어갈 공간입니다.
								</p>
							</div>
						</div>
					</div>
					<div class="coach-list-rdiv">
						<div class="coach-circle-div-wrap">
							<div class="coach-list-circle"></div>
						</div>
						<div class="coach-txt-div-wrap">
							<div class="coach-txt-div">
								<h1 class="coach-h1">
									김교수 코치
								</h1>
								<p class="coach-p">
									강좌 제목이 들어갈 공간입니다.
								</p>
								<p class="coach-p">
									강좌 내용이 들어갈 공간 입니다. 강좌 내용이 들어갈 공간 입니다. 강좌 내용이 들어갈 공간 입니다. 강좌 내용이 들어갈 공간 입니다. 강좌 내용이 들어갈 공간 입니다. 강좌 내용이 들어갈 공간입니다.
								</p>
							</div>
						</div>
					</div>
				</div>
			</div>




			<div class="coach-list-wrap">
				<div class="coach-list-wrap">
					<div class="coach-list-ldiv">
						<div class="coach-circle-div-wrap">
							<div class="coach-list-circle"></div>
						</div>
						<div class="coach-txt-div-wrap">
							<div class="coach-txt-div">
								<h1 class="coach-h1">
									김교수 코치
								</h1>
								<p class="coach-p">
									강좌 제목이 들어갈 공간입니다.
								</p>
								<p class="coach-p">
									강좌 내용이 들어갈 공간 입니다. 강좌 내용이 들어갈 공간 입니다. 강좌 내용이 들어갈 공간 입니다. 강좌 내용이 들어갈 공간 입니다. 강좌 내용이 들어갈 공간 입니다. 강좌 내용이 들어갈 공간입니다.
								</p>
							</div>
						</div>
					</div>
					<div class="coach-list-rdiv">
						<div class="coach-circle-div-wrap">
							<div class="coach-list-circle"></div>
						</div>
						<div class="coach-txt-div-wrap">
							<div class="coach-txt-div">
								<h1 class="coach-h1">
									김교수 코치
								</h1>
								<p class="coach-p">
									강좌 제목이 들어갈 공간입니다.
								</p>
								<p class="coach-p">
									강좌 내용이 들어갈 공간 입니다. 강좌 내용이 들어갈 공간 입니다. 강좌 내용이 들어갈 공간 입니다. 강좌 내용이 들어갈 공간 입니다. 강좌 내용이 들어갈 공간 입니다. 강좌 내용이 들어갈 공간입니다.
								</p>
							</div>
						</div>
					</div>
				</div>
			</div>




			<div class="coach-list-wrap">
				<div class="coach-list-wrap">
					<div class="coach-list-ldiv">
						<div class="coach-circle-div-wrap">
							<div class="coach-list-circle"></div>
						</div>
						<div class="coach-txt-div-wrap">
							<div class="coach-txt-div">
								<h1 class="coach-h1">
									김교수 코치
								</h1>
								<p class="coach-p">
									강좌 제목이 들어갈 공간입니다.
								</p>
								<p class="coach-p">
									강좌 내용이 들어갈 공간 입니다. 강좌 내용이 들어갈 공간 입니다. 강좌 내용이 들어갈 공간 입니다. 강좌 내용이 들어갈 공간 입니다. 강좌 내용이 들어갈 공간 입니다. 강좌 내용이 들어갈 공간입니다.
								</p>
							</div>
						</div>
					</div>
					<div class="coach-list-rdiv">
						<div class="coach-circle-div-wrap">
							<div class="coach-list-circle"></div>
						</div>
						<div class="coach-txt-div-wrap">
							<div class="coach-txt-div">
								<h1 class="coach-h1">
									김교수 코치
								</h1>
								<p class="coach-p">
									강좌 제목이 들어갈 공간입니다.
								</p>
								<p class="coach-p">
									강좌 내용이 들어갈 공간 입니다. 강좌 내용이 들어갈 공간 입니다. 강좌 내용이 들어갈 공간 입니다. 강좌 내용이 들어갈 공간 입니다. 강좌 내용이 들어갈 공간 입니다. 강좌 내용이 들어갈 공간입니다.
								</p>
							</div>
						</div>
					</div>
				</div>
			</div>
			


		 </div>
   </section>

   
   <!-- 
	********* section end *********
    -->

	

	
<%@include file="../common/footer.jsp"%>