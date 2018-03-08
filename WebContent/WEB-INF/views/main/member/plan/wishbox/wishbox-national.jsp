<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<link href = "../../../../CSS/wishbox-national.css"  type="text/css" rel="stylesheet"/>
</head>
<body>
	<header id="header">
		<div class="root-container">
			<h1 id="logo">
				<a href="../../../main.html"><img src="../../../../images/logo.png" height="65px" alt="����" /></a>
			</h1>
			<nav class ="hor-menu main-menu first-pad-none">
				<ul>
					<li><a href="">��ȹ�ϱ�</a></li>
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

	<div id="body">

			<div id="sub-main">
				<div id="tab">
					<section>
					<ul>
						<li id="search-btn"><a href="../searchplan/search-plan.html">Search</a></li>
						<li id="wishbox-btn"><a href="">Wishbox</a></li>
						<li id="cost-btn"><a href="../cost/cost.html">Cost</a></li>
						<li id="review-btn"><a href="../schedule/schedule.html">Plan</a></li>
					</ul>
					
					<ul id="save">
						<li><a href="">Save</a></li>
					</ul>
					</section>
					
				</div>
				
				<div id="search">
					<div id="travel-dayname">
						<p id="travelName">�����̸�</p>
						<p id="travelDay">����Ⱓ</p>
					</div>
					<div id="search-box">
								
						<div id = "button-box">
							<p class="btn"><a href="">�ֽż�</a></p>
							<p class="btn"><a href="">������</a></p>
						</div>
						
						<div id="searched-content">
							<div>������</div>
							<div class="searched-result">
							 	
							 	<div class="searched-pic">
							 	 	
							 	</div>
							 	
							 	<div class="searched-info">
							 	 	
							 	 	<div class="searched-name">
							 	 		����ž
							 	 	</div>
							 	 	
							 	 	<div class="wishput-btn">
								 	 	<div class="searched-wish">
								 	 		��ٱ���(111)
								 	 	</div>
								 	 	<div class="searched-put">
								 	 		�������
								 	 	</div>
							 	 	</div>
							 	</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			
			<div id="main">
			<!-- ���� -->
				  <div id="map">
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
				 	<div id="map-right">				 	
					 	<p id="map-friendadd">
					 	</p>
					 	
					 	<div id="check-map">
							<div class="up">
								<a href="" class="btn"></a>
							</div>
							<div class="center">
								<b>day 1</b>
							</div>
							<div class="down"></div>
						</div>
					</div>
				 </div>
				 
				 <div id="table">
				 	<div id="table-control">
				 	 	
				 	 	<div id="button">
					 	 	<p id="control-leftbtn">
					 	 		<a href=""></a>
					 	 	</p>
					 	 	
					 	 	<p id="control-day">
				 	 			Day1
				 	 		</p>
					 	 	<p id="control-rightbtn">
					 	 		<a href=""></a>
					 	 	</p>
				 	 	</div>
				 	 	
				 	 	<p id="control-date">
				 	 		2018�� 1�� 5��
				 	 	</p>
				 	 	
				 	 	
				 	 	
				 	 	<p id="control-dayadd">
				 	 		<a href="">Day�߰�</a>
				 	 	</p>
				 	 	
				 	 	<p id="control-daydelete">
				 	 		<a href="">�ش����� �����ϱ�</a>
				 	 	</p>
				 	 	
				 	 	<p id="control-alldelete">
				 	 		<a href="">��ü���� �����ϱ�</a>
				 	 	</p>
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
								</tbody>
							</table>
						</div>
				 	
				 	<div id="table-info">
				 		<p id="info-weather">
				 			<a href="">����</a>
				 		</p>
				 		
				 		<p id="info-emergency">
				 			�溸
				 		</p>
				 	</div>
				 	
				 	
				 </div> 
			</div>
	</div>
</body>
</html>