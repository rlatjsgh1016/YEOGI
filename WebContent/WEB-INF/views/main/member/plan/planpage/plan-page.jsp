<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<link href = "../../../../CSS/plan-page.css"  type="text/css" rel="stylesheet"/>
</head>
<body>
	<header id="header">
		<div class="root-container">
			<h1 id="logo">
				<a href="../../../main.html"><img src="../../../../images/logo.png" height="65px" alt="����" /></a>
			</h1>
			<nav class ="hor-menu main-menu first-pad-none">
				<ul>
					<li><a href="../searchplan/search-plan.html">��ȹ�ϱ�</a></li>
					<li><a href="../../story/write/main.jsp">����ϱ�</a></li>
					<li><a href="../../../public-board/travel-log/log-main/log-main.html">�����</a></li>
					<li><a href="">Ŀ�´�Ƽ</a></li>
				</ul>
			</nav>
				
			<nav class ="hor-menu member-menu first-pad-none">
				<ul>
					<li><a href="../../../log-in.html">�α���</a></li>
					<li><a href="">ȸ������</a></li>
					<li><a href="">����������</a></li>
				</ul>
			</nav>
		</div>
	</header>
	
	<div id="visual">
			<div id="title-img">
				<img id="img" alt="img" src="../../../../images/japan2.png">
			</div>
			<div class="root-container">
				<div class="title-box">
					
					<div class="title-name"><a>title</a></div>
	
					<div class="title-info">
						<span>����</span> 
						<span>��ڸ�ĥ</span>
						<span>2018-01-05</span>
						<span>2018-01-09</span>
						<span>�ۼ��� : </span>
						<span>2018-01-15</span>
						<span>���� ������ : </span>
						<span>2018-01-25</span>
					</div>
	
					<div class="title-hit">
						<span>��ȸ��</span> <span>125</span>
						<span>��ũ��</span> <span>180</span>
						<span>���</span> <span>10</span>
					</div>
				</div>
			</div>
	</div>
	
	<div id="body">
		<div class="root-container">
		<!-- aside���ۺκ� -->
			<aside id="aside">
				<div class="user-box">
					<div class="user-imgbox">
						<img id="user-img" alt="����" src="../../../../images/dog2.png">
					</div>
					<div class="user-name">�۾���</div>
					<div class="user-collection">
						<span>��ȹ</span> <span class="post-count">(3)</span>
						<span>���</span> <span class="post-count">(5)</span>
						<span>Ŀ�´�Ƽ</span> <span class="post-count">(10)</span>
					</div>
					<div class="user-scrap">
						<img id="btn-scrap" alt="��ũ���̹���"
							src="../../../../images/scrap.png"> <span>��ũ��</span>
					</div>
				
				</div>
				
				<div class="summary-box">
					<ul>
						<li><a class="summary-btn theme-img" href="">
						<span class="summary-list">�����׸�</span> <span class="summary-info">ȥ�ڿ���</span>
						</a></li>
						
						<li><a class="summary-btn totalplace-img" href="">
						<span class="summary-list">�� �湮���</span> <span class="summary-info">20</span>
						</a></li>
						
						<li><a class="summary-btn pay-img" href="">
						<span class="summary-list">���⳻��</span> <span class="summary-info">$111111</span>
						</a></li>
					</ul>
				</div>
			</aside>
			
			<div id="main">				 				 	
				<!-- ���� -->
					<div id="map" style="height:500px">
						<script>
						      var map;
						      function initMap() {
						        map = new google.maps.Map(document.getElementById('map'), {
						          center: {lat: 37.541, lng: 126.986},
						          zoom: 8
						        });
						      }
						   </script>
						   
						   <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAfcHbvgPNc6lfCcsU7NaG1xc2qO6heLFU&callback=initMap"
		    async defer></script>
					</div>
					<div id="main-plan">
					<div class="plan-table">
						<div class="table-info">
							<p class="table-date">2018-01-05</p>
							<p class="table-day">DAY1</p>
							<div class="table-btn">
								<a class="table-leftbtn"></a>
								<a class="table-rightbtn"></a>
							</div>
							<div class="customizing">
								Ŀ���Ҹ���¡
							</div>
						</div>
						
						<div class="table-planFrame">
							<table class="table">
								<tbody>
									<tr>
										<td class="table-time">07:00</td>
										<td class="table-spot">��������</td>
										<td class="memo-pad">ì�ܶ�!</td>		
									</tr>
									<tr>
										<td class="table-time">08:00</td>
										<td class="table-spot">������</td>
										<td class="memo-pad"></td>		
									</tr>
									<tr>
										<td class="table-time">09:00</td>
										<td class="table-spot">���������Ÿ�</td>
										<td class="memo-pad"></td>		
									</tr>
									<tr>
										<td class="table-time">10:00</td>
										<td class="table-spot">�����</td>
										<td class="memo-pad"></td>		
									</tr>
									
									<tr>
										<td class="table-time">11:00</td>
										<td class="table-spot">����</td>
										<td class="memo-pad"></td>		
									</tr>
									
									<tr>
										<td class="table-time">14:00</td>
										<td class="table-spot">��</td>
										<td class="memo-pad"></td>		
									</tr>
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div> 
		</div>
			
	</div>
</body>
</html>