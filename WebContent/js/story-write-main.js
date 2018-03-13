

window.addEventListener("load", function(){
	
	var btnPlaceAdd = document.querySelectorAll(".btn-place-add");
	var btnPlaceEdit = document.querySelectorAll(".btn-place-edit");
	var btnPlaceDelete = document.querySelectorAll(".btn-place-delete");
	var btnDetailPostBoxClose = document.querySelectorAll(".btn-detail-post-box-close");
	var detailPostBox = document.querySelectorAll(".detail-post-box");
	var detailPostMadal = document.querySelector("#detail-post-modal");
	var themesButtons = document.querySelectorAll("#themes>button");
	var themesInput = document.querySelector("input[name='themes']");
	var fileInput = document.querySelector("#attached-file");
	var formElement = document.querySelector("#form-main");
	var visual = document.querySelector("#visual");
	
	//메인버튼 6개 정의
	var mainButtons = document.querySelectorAll("input[name='btn-main']");
	
	//포스트 테이블 데이터 정의
	var inputTourLogId = document.querySelector("input[name='tour-log-id']");
	var inputPostMemo = document.querySelector("textarea[name='post-memo']");
	var inputLocId = document.querySelector("input[name='loc-id']");
	var selectVehicle = document.querySelector("select[name='vehicle']");
	var selectSpdType = document.querySelectorAll("select[name='spd-type']");
	var inputSpdContent = document.querySelectorAll("input[name='spd-content']");
	var selectSpdUnit = document.querySelectorAll("select[name='spd-unit']");
	var inputSpdAmount = document.querySelectorAll("input[name='spd-amount']");
	var inputTag = document.querySelector("input[name='tag']");
	
	var postSubmitButton = document.querySelector("input[name='btn-post']");
	
	//배경화면 로딩
	var coverImgInput = document.querySelector("input[name='cover-img']");
	if(coverImgInput.value != null && coverImgInput.value !="")
		visual.style.background = "#1C1C1C url(../coverImg/"+coverImgInput.value+") no-repeat center";
	else
		visual.style.background = "#1C1C1C";
	
	//포스트 추가버튼
	for(var i=0; i<btnPlaceAdd.length; i++){
		btnPlaceAdd[i].addEventListener("click",function(i){
			detailPostMadal.style.display = "block";
		}.bind(this.i));
	}
	
	//포스트 수정버튼
	for(var i=0; i<btnPlaceEdit.length; i++){
		btnPlaceEdit[i].addEventListener("click",function(i){
			detailPostMadal.style.display = "block";
		}.bind(this.i));
	}
	
	//포스트 닫기 버튼
	for(var i=0; i<btnDetailPostBoxClose.length; i++){
		btnDetailPostBoxClose[i].addEventListener("click",function(i){
			detailPostMadal.style.display = "none";
		}.bind(this.i));
	}

	//여행테마 선택 버튼
	for(var i=0; i<themesButtons.length; i++){
		themesButtons[i].addEventListener("click",function(i){
			for(var j=0; j<themesButtons.length; j++){
				themesButtons[j].classList.remove("selected");
			};
			themesButtons[i].classList.add("selected");
			themesInput.value = themesButtons[i].textContent;
		}.bind(this,i));
	}

	//날짜 버튼
	var dayButtons = document.querySelectorAll("button[name='btn-day']");
	for(var i=0; i<dayButtons.length; i++){
		dayButtons[i].addEventListener("click",function(i){

			for(var j=0; j<dayButtons.length; j++){
				dayButtons[j].style.color = "#D8D8D8";
			}

			var btnValue = dayButtons[i].value;
			dayButtons[i].style.color = "#E64C3C";
			var placeDiv = document.querySelector(".place-container");
			var formData = new FormData(formElement);
			var request = new XMLHttpRequest();
			
			request.onreadystatechange = function(){

				if(request.readyState != 4)	//	4번상태: 페이지 로딩이 완료 되지 않으면 리턴
					return;
				var returnString = request.responseText;
				var result = JSON.parse(returnString);

				placeDiv.innerHTML = "";
				for(var i=0; i<result.length; i++){
					if(result[i].day == btnValue){
						placeDiv.insertAdjacentHTML("beforeend","<div class='card-frame'><div class='image-frame'><img alt='장소이미지' src='"+result[i].img+"'>"+"</div>"+
													"<div class='place-frame'><p>"+result[i].name+"</p></div><div class='place-btn-container'>"+
													"<button class='btn-place-delet' type='button' ><img alt='삭제' src='/images/delete.png'></button>"+
													"<button class='btn-place-edit' type='button' ><img alt='편집' src='/images/write.png'></button>"+
													"<input type='hidden' name='post-id' value='"+result[i].id+"'></div></div>");
					}
				}
				placeDiv.insertAdjacentHTML("beforeend","<div class='place-add'><div class='large-loca'></div><button class='btn btn-focus btn-place-add' type='button'>장소추가</button></div>");

				//포스트 버튼 정의
				var btnPlaceAdd = document.querySelectorAll(".btn-place-add");
				var btnPlaceEdit = document.querySelectorAll(".btn-place-edit");
				var btnPlaceDelete = document.querySelectorAll(".btn-place-delete");
				var btnDetailPostBoxClose = document.querySelectorAll(".btn-detail-post-box-close");
				var detailPostBox = document.querySelectorAll(".detail-post-box");
				var detailPostMadal = document.querySelector("#detail-post-modal");

				//포스트 추가버튼
				for(var i=0; i<btnPlaceAdd.length; i++){
					btnPlaceAdd[i].addEventListener("click",function(i){
						detailPostMadal.style.display = "block";
					}.bind(this.i));
				}
				
				//포스트 수정버튼
				for(var i=0; i<btnPlaceEdit.length; i++){
					btnPlaceEdit[i].addEventListener("click",function(i){
						detailPostMadal.style.display = "block";
					}.bind(this.i));
				}
				
				//포스트 닫기 버튼
				for(var i=0; i<btnDetailPostBoxClose.length; i++){
					btnDetailPostBoxClose[i].addEventListener("click",function(i){
						detailPostMadal.style.display = "none";
					}.bind(this.i));
				}
			};

			request.open("POST", "selectDay", false);
			request.send(formData);
		}.bind(this,i));
	}
	
<<<<<<< HEAD
	btnCover.onclick = function(e) {
		e.preventDefault();
		for(var i=0; i<modal.length; i++){
			modal[i].style.display = "block";
=======
	//왼쪽 화살표 버튼
	var leftButton = document.querySelector(".left-arrow");
	var rightButton = document.querySelector(".right-arrow");

	leftButton.onclick = function(){
		var firstDay = parseInt(dayButtons[0].value);
		if(firstDay == 1)
			alert("이전 날짜가 없습니다.");
		else{
			var placeDiv = document.querySelector(".place-container");
			var formData = new FormData(formElement);
			var request = new XMLHttpRequest();
			
			request.onreadystatechange = function(){

				if(request.readyState != 4)	//	4번상태: 페이지 로딩이 완료 되지 않으면 리턴
					return;
				var returnString = request.responseText;
				var result = JSON.parse(returnString);

				for(var j=0; j<dayButtons.length; j++){
					dayButtons[j].style.color = "#D8D8D8";
					dayButtons[j].value = firstDay+j-1;
					dayButtons[j].textContent = "DAY"+(firstDay+j-1);
				}
				dayButtons[0].style.color = "#E64C3C";
				
				placeDiv.innerHTML = "";
				for(var i=0; i<result.length; i++){
					if(parseInt(result[i].day) == firstDay-1){
						placeDiv.insertAdjacentHTML("beforeend","<div class='card-frame'><div class='image-frame'><img alt='장소이미지' src='"+result[i].img+"'>"+"</div>"+
													"<div class='place-frame'><p>"+result[i].name+"</p></div><div class='place-btn-container'>"+
													"<button class='btn-place-delet' type='button' ><img alt='삭제' src='/images/delete.png'></button>"+
													"<button class='btn-place-edit' type='button' ><img alt='편집' src='/images/write.png'></button>"+
													"<input type='hidden' name='post-id' value='"+result[i].id+"'></div></div>");
					}
				}
				placeDiv.insertAdjacentHTML("beforeend","<div class='place-add'><div class='large-loca'></div><button class='btn btn-focus btn-place-add' type='button'>장소추가</button></div>");

				//포스트 버튼 정의
				var btnPlaceAdd = document.querySelectorAll(".btn-place-add");
				var btnPlaceEdit = document.querySelectorAll(".btn-place-edit");
				var btnPlaceDelete = document.querySelectorAll(".btn-place-delete");
				var btnDetailPostBoxClose = document.querySelectorAll(".btn-detail-post-box-close");
				var detailPostBox = document.querySelectorAll(".detail-post-box");
				var detailPostMadal = document.querySelector("#detail-post-modal");

				//포스트 추가버튼
				for(var i=0; i<btnPlaceAdd.length; i++){
					btnPlaceAdd[i].addEventListener("click",function(i){
						detailPostMadal.style.display = "block";
					}.bind(this.i));
				}
				
				//포스트 수정버튼
				for(var i=0; i<btnPlaceEdit.length; i++){
					btnPlaceEdit[i].addEventListener("click",function(i){
						detailPostMadal.style.display = "block";
					}.bind(this.i));
				}
				
				//포스트 닫기 버튼
				for(var i=0; i<btnDetailPostBoxClose.length; i++){
					btnDetailPostBoxClose[i].addEventListener("click",function(i){
						detailPostMadal.style.display = "none";
					}.bind(this.i));
				}
			};

			request.open("POST", "selectDay", false);
			request.send(formData);
>>>>>>> refs/remotes/origin/master
		}
	}
<<<<<<< HEAD
	
<<<<<<< HEAD
	btnLock.onclick = function() {
		formMain.submit();
	}
	
	btnUnlock.onclick = function(){
		formMain.submit();
	}
	
=======
>>>>>>> refs/remotes/origin/master
	btnCompanion.onclick = function(){
		formMain.submit();
=======

	//오른쪽 화살표 버튼
	rightButton.onclick = function(){
		var lastDay = parseInt(dayButtons[2].value);
		var period = parseInt(document.querySelector("#period").value);
		if(period < 4 || lastDay == period)
			alert("다음 날짜가 없습니다.");
		else{
			var placeDiv = document.querySelector(".place-container");
			var formData = new FormData(formElement);
			var request = new XMLHttpRequest();
			
			request.onreadystatechange = function(){

				if(request.readyState != 4)	//	4번상태: 페이지 로딩이 완료 되지 않으면 리턴
					return;
				var returnString = request.responseText;
				var result = JSON.parse(returnString);

				for(var j=0; j<dayButtons.length; j++){
					dayButtons[j].style.color = "#D8D8D8";
					dayButtons[j].value = lastDay+j-1;
					dayButtons[j].textContent = "DAY"+(lastDay+j-1);
				}
				dayButtons[2].style.color = "#E64C3C";
				
				placeDiv.innerHTML = "";
				for(var i=0; i<result.length; i++){
					if(parseInt(result[i].day) == lastDay+1){
						placeDiv.insertAdjacentHTML("beforeend","<div class='card-frame'><div class='image-frame'><img alt='장소이미지' src='"+result[i].img+"'>"+"</div>"+
													"<div class='place-frame'><p>"+result[i].name+"</p></div><div class='place-btn-container'>"+
													"<button class='btn-place-delet' type='button' ><img alt='삭제' src='/images/delete.png'></button>"+
													"<button class='btn-place-edit' type='button' ><img alt='편집' src='/images/write.png'></button>"+
													"<input type='hidden' name='post-id' value='"+result[i].id+"'></div></div>");
					}
				}
				placeDiv.insertAdjacentHTML("beforeend","<div class='place-add'><div class='large-loca'></div><button class='btn btn-focus btn-place-add' type='button'>장소추가</button></div>");

				//포스트 버튼 정의
				var btnPlaceAdd = document.querySelectorAll(".btn-place-add");
				var btnPlaceEdit = document.querySelectorAll(".btn-place-edit");
				var btnPlaceDelete = document.querySelectorAll(".btn-place-delete");
				var btnDetailPostBoxClose = document.querySelectorAll(".btn-detail-post-box-close");
				var detailPostBox = document.querySelectorAll(".detail-post-box");
				var detailPostMadal = document.querySelector("#detail-post-modal");

				//포스트 추가버튼
				for(var i=0; i<btnPlaceAdd.length; i++){
					btnPlaceAdd[i].addEventListener("click",function(i){
						detailPostMadal.style.display = "block";
					}.bind(this.i));
				}
				
				//포스트 수정버튼
				for(var i=0; i<btnPlaceEdit.length; i++){
					btnPlaceEdit[i].addEventListener("click",function(i){
						detailPostMadal.style.display = "block";
					}.bind(this.i));
				}
				
				//포스트 닫기 버튼
				for(var i=0; i<btnDetailPostBoxClose.length; i++){
					btnDetailPostBoxClose[i].addEventListener("click",function(i){
						detailPostMadal.style.display = "none";
					}.bind(this.i));
				}
			};

			request.open("POST", "selectDay", false);
			request.send(formData);
		}
>>>>>>> refs/remotes/origin/master
	}

	//메인 버튼
	for(var i=0; i<mainButtons.length; i++){
		mainButtons[i].addEventListener("click",function(i){
			var btnValue = mainButtons[i].value;
			switch(btnValue){
				case "커버교체":{
					var event = new MouseEvent("click", {
						view:window,
						bubbles:true,
						cancelable:true
					});
					fileInput.dispatchEvent(event);
					fileInput.onchange = function(){
						
						var files = fileInput.files;
						var fileType = files[0].type.split("/");
						if(fileType[0] != "image"){
							alert("image 파일형식이 아닙니다.");
							files[0] = null;
						}
						else{
							var formData = new FormData(formElement);
							var request = new XMLHttpRequest();

							request.onreadystatechange = function(){

								if(request.readyState != 4)	//	4번상태: 페이지 로딩이 완료 되지 않으면 리턴
									return;
								
								var tourLog = JSON.parse(request.responseText);
								visual.style.background = "#1C1C1C url(../coverImg/"+tourLog.coverImg+") no-repeat center";
							};

							request.open("POST", "changeCover", true);
							request.send(formData);
						}
						
					}
				}break;
				case "공개 전환":{
					var formData = new FormData(formElement);
					var request = new XMLHttpRequest();

					request.onreadystatechange = function(){

						if(request.readyState != 4)	//	4번상태: 페이지 로딩이 완료 되지 않으면 리턴
							return;
						var returnString = request.responseText;
						if(returnString == "Update failed")
							alert(returnString);
						else{
							var result = JSON.parse(returnString);
							mainButtons[1].value = "비공개 전환";
							var lockYnInput = document.querySelector("#lock-yn");
							lockYnInput.value = result.lockYN;
							var lockP = document.querySelector(".first-line-btn p:first-child");
							lockP.id = "unlock";
							lockP.textContent = "";
							var text1 = document.createTextNode("공개여부");
							var text2 = document.createTextNode("공개");
							var brTag = document.createElement("br");
							lockP.appendChild(text1);
							lockP.appendChild(brTag);
							lockP.appendChild(text2);
							alert("게시물 공개여부를 <공개>로 전환했습니다");
						}
						
					};

					request.open("POST", "lock", false);
					request.send(formData);
				}break;
				case "비공개 전환":{
					var formData = new FormData(formElement);
					var request = new XMLHttpRequest();

					request.onreadystatechange = function(){

						if(request.readyState != 4)	//	4번상태: 페이지 로딩이 완료 되지 않으면 리턴
							return;
						var returnString = request.responseText;
						if(returnString == "Update failed")
							alert(returnString);
						else{
							var result = JSON.parse(returnString);
							mainButtons[1].value = "공개 전환";
							var lockYnInput = document.querySelector("#lock-yn");
							lockYnInput.value = result.lockYN;
							var lockP = document.querySelector(".first-line-btn p:first-child");
							lockP.id = "lock";
							lockP.textContent = "";
							var text1 = document.createTextNode("공개여부");
							var text2 = document.createTextNode("비공개");
							var brTag = document.createElement("br");
							lockP.appendChild(text1);
							lockP.appendChild(brTag);
							lockP.appendChild(text2);
							alert("게시물 공개여부를 <비공개>로 전환했습니다");
						}
						
					};

					request.open("POST", "lock", false);
					request.send(formData);
				}break;
				case "동행자 추가":{

				}break;
				case "저장":{

				}break;
				case "취소":{

				}break;
			}
		}.bind(this,i));
	};
	
	
});