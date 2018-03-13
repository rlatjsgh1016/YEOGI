

window.addEventListener("load", function(){
	
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
	var inputLocName = document.querySelector("input[name='loc-name']");
	var selectVehicle = document.querySelector("select[name='vehicle']");
	var selectSpdType = document.querySelector("select[name='spd-type']");
	var inputSpdContent = document.querySelector("input[name='spd-content']");
	var selectSpdUnit = document.querySelector("select[name='spd-unit']");
	var inputSpdAmount = document.querySelector("input[name='spd-amount']");
	var inputTag = document.querySelector("input[name='tag']");
	
	var postSubmitButton = document.querySelector("input[name='btn-post']");
	
	//배경화면 로딩
	var coverImgInput = document.querySelector("input[name='cover-img']");
	if(coverImgInput.value != null && coverImgInput.value !="")
		visual.style.background = "#1C1C1C url(../coverImg/"+coverImgInput.value+") no-repeat center";
	else
		visual.style.background = "#1C1C1C";
	
	//포스트 저장버튼
	postSubmitButton.onclick = function(){
		inputPostMemo.value = nicEditors.findEditor('post-memo').getContent();

		var formData = new FormData(formElement);
		var request = new XMLHttpRequest();

		request.onload = function(){
			var result = JSON.parse(request1.responseText);
			
		}
		request.open("POST","postSave",fasle);
		request.send(formData)
	}


	//포스트 추가버튼
	postAdd();
	function postAdd(){

		var btnPlaceAdd = document.querySelectorAll(".btn-place-add");
		var detailPostMadal = document.querySelector("#detail-post-modal");

		for(var i=0; i<btnPlaceAdd.length; i++){
			btnPlaceAdd[i].addEventListener("click",function(i){
				detailPostMadal.style.display = "block";
	
				inputLocId.value = "";
				inputLocName.value = "";
				inputPostMemo.value = nicEditors.findEditor('post-memo').setContent("");
				var vehicleOpts = selectVehicle.options;
				for(var i=0; i<vehicleOpts.length; i++){
					vehicleOpts[i].selected = false;
				}
				vehicleOpts[0].selected = true;
	
				inputSpdContent.value ="";
				inputSpdAmount.value = "";
	
				var spdTypeOpts = selectSpdType.options;
				for(var i=0; i<spdTypeOpts.length; i++){
					spdTypeOpts[i].selected = false;
				}
				spdTypeOpts[0].selected = true;
	
				var spdUnitOpts = selectSpdUnit.options;
				for(var i=0; i<spdUnitOpts.length; i++){
					spdUnitOpts[i].selected = false;
				}
				spdUnitOpts[0].selected = true;
	
				inputTag.value = "";
	
			}.bind(this,i));
		}
	}
	
	//포스트 편집버튼
	postEdit();
	function postEdit(){

		var btnPlaceEdit = document.querySelectorAll(".btn-place-edit");
		var detailPostMadal = document.querySelector("#detail-post-modal");

		for(var i=0; i<btnPlaceEdit.length; i++){
			btnPlaceEdit[i].addEventListener("click",function(i){
				detailPostMadal.style.display = "block";
				var postIdInput = btnPlaceEdit[i].previousElementSibling;
				
				var postId = new FormData();
				postId.append("post-id", postIdInput.value);
				var spdId = new FormData();
				spdId.append("spd-id", postIdInput.value);
				var tagId = new FormData();
				tagId.append("tag-id", postIdInput.value);
	
				var request1 = new XMLHttpRequest();
				var request2 = new XMLHttpRequest();
				var request3 = new XMLHttpRequest();
	
				request1.onload = function(){
					var result = JSON.parse(request1.responseText);
						
					inputLocId.value = result.locId;
					inputLocName.value = result.name;
					//inputPostMemo.value = result.content;
					nicEditors.findEditor('post-memo').setContent(result.content);
	
					var vehicleOpts = selectVehicle.options;
					for(var i=0; i<vehicleOpts.length; i++){
						vehicleOpts[i].selected = false;
						if(vehicleOpts[i].value == result.trans){
							vehicleOpts[i].selected = true;
						}
					}
				}
			
				request2.onload = function(){
					var result = JSON.parse(request2.responseText);
					if(result != null && result != ""){
						inputSpdContent.value = result[0].spdContent;
						inputSpdAmount.value = parseInt(result[0].amount);
	
						var spdTypeOpts = selectSpdType.options;
						for(var i=0; i<spdTypeOpts.length; i++){
							spdTypeOpts[i].selected = false;
							if(spdTypeOpts[i].value == result[0].type){
								spdTypeOpts[i].selected = true;
							}
						}
						var spdUnitOpts = selectSpdUnit.options;
						for(var i=0; i<spdUnitOpts.length; i++){
							spdUnitOpts[i].selected = false;
							if(spdUnitOpts[i].value == result[0].unit){
								spdUnitOpts[i].selected = true;
							}
						}
					}
					else{
						inputSpdContent.value = null;
						inputSpdAmount.value = null;
						
						var spdTypeOpts = selectSpdType.options;
						for(var i=0; i<spdTypeOpts.length; i++){
							spdTypeOpts[i].selected = false;
						}
						spdTypeOpts[0].selected = true;
	
						var spdUnitOpts = selectSpdUnit.options;
						for(var i=0; i<spdUnitOpts.length; i++){
							spdUnitOpts[i].selected = false;
						}
						spdUnitOpts[0].selected = true;
					}
				}
	
				request3.onload = function(){
					var result = JSON.parse(request3.responseText);
	
					if(result != null && result != ""){
						var arr = [];
						for(var i in result)
							arr.push(result[i].tagContent);
						inputTag.value = arr.join(",");
					}
					
				}
	
				request1.open("POST","editPost",false);
				request1.send(postId);
				request2.open("POST","editPost",false);
				request2.send(spdId);
				request3.open("POST","editPost",false);
				request3.send(tagId);
	
			}.bind(this,i));
		}
	}
	
	//포스트 삭제 버튼
	postDelete();
	function postDelete(){
		
		var btnPlaceDelete = document.querySelectorAll(".btn-place-delete");

		for(var i=0; i<btnPlaceDelete.length; i++){
			btnPlaceDelete[i].addEventListener("click",function(i){
				var postIdInput = btnPlaceDelete[i].nextElementSibling;
				var rootNode = postIdInput.parentElement.parentElement;
				var isDelete = confirm("선택한 게시물을 삭제하시겠습니까?");
				if(!isDelete){
					return;
				}
				else{
					var postId = new FormData();
					postId.append("post-id", postIdInput.value);
					var request = new XMLHttpRequest();
	
					request.onload = function(){
						var result = JSON.parse(request.responseText);
						var intResult = parseInt(result);
						if(intResult == 1){
							rootNode.outerHTML = "";
							alert("게시물을 삭제하였습니다.");
						}
						else
							alert("삭제에 실패하였습니다.");
						}
					request.open("POST","deletePost",false);
					request.send(postId);
				}
	
			}.bind(this,i));
		}
	}
	
	//포스트 닫기 버튼
	postClose();
	function postClose(){

		var btnDetailPostBoxClose = document.querySelectorAll(".btn-detail-post-box-close");
		var detailPostMadal = document.querySelector("#detail-post-modal");

		for(var i=0; i<btnDetailPostBoxClose.length; i++){
			btnDetailPostBoxClose[i].addEventListener("click",function(i){
				detailPostMadal.style.display = "none";
	
				inputLocId.value = "";
				inputLocName.value = "";
				inputPostMemo.value = nicEditors.findEditor('post-memo').setContent("");
				var vehicleOpts = selectVehicle.options;
				for(var i=0; i<vehicleOpts.length; i++){
					vehicleOpts[i].selected = false;
				}
				vehicleOpts[0].selected = true;
	
				inputSpdContent.value ="";
				inputSpdAmount.value = "";
	
				var spdTypeOpts = selectSpdType.options;
				for(var i=0; i<spdTypeOpts.length; i++){
					spdTypeOpts[i].selected = false;
				}
				spdTypeOpts[0].selected = true;
	
				var spdUnitOpts = selectSpdUnit.options;
				for(var i=0; i<spdUnitOpts.length; i++){
					spdUnitOpts[i].selected = false;
				}
				spdUnitOpts[0].selected = true;
	
				inputTag.value = "";
	
			}.bind(this,i));
		}
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
			var formData = new FormData(formElement);
			var request = new XMLHttpRequest();
			
			request.onreadystatechange = function(){

				if(request.readyState != 4)	//	4번상태: 페이지 로딩이 완료 되지 않으면 리턴
					return;
				var returnString = request.responseText;
				var result = JSON.parse(returnString);
				var currDayInput = document.querySelector("#curr-day");
				var postRootDiv = document.querySelector("#post-root");
				currDayInput.value = btnValue;
				postRootDiv.innerHTML = "";
				for(var i=0; i<result.length; i++){
					if(result[i].day == btnValue){
						var temp = document.querySelector("#template");
						var placeImg = temp.querySelector(".image-frame>img");
						var placeName = temp.querySelector(".place-frame>p");
						var placeId = temp.querySelector("input[name='post-id']");
						placeImg.src = result[i].img;
						placeName.textContent = result[i].name;
						placeId.value = result[i].id;
						var clone = document.importNode(temp, true);
						clone.classList.remove("hidden");
						clone.id = "";
						postRootDiv.appendChild(clone);
					}
				}
				postAdd();
				postEdit();
				postDelete();
			};

			request.open("POST", "selectDay", false);
			request.send(formData);
		}.bind(this,i));
	}
	
	//왼쪽 화살표 버튼
	var leftButton = document.querySelector(".left-arrow");
	var rightButton = document.querySelector(".right-arrow");

	leftButton.onclick = function(){
		var firstDay = parseInt(dayButtons[0].value);
		if(firstDay == 1)
			alert("이전 날짜가 없습니다.");
		else{
			
			var formData = new FormData(formElement);
			var request = new XMLHttpRequest();
			
			request.onreadystatechange = function(){

				if(request.readyState != 4)	//	4번상태: 페이지 로딩이 완료 되지 않으면 리턴
					return;
				var returnString = request.responseText;
				var result = JSON.parse(returnString);
				var currDayInput = document.querySelector("#curr-day");
				var postRootDiv = document.querySelector("#post-root");
				currDayInput.value = firstDay-1;
				postRootDiv.innerHTML = "";
				for(var j=0; j<dayButtons.length; j++){
					dayButtons[j].style.color = "#D8D8D8";
					dayButtons[j].value = firstDay+j-1;
					dayButtons[j].textContent = "DAY"+(firstDay+j-1);
				}
				dayButtons[0].style.color = "#E64C3C";

				for(var i=0; i<result.length; i++){
					if(parseInt(result[i].day) == firstDay-1){
						var temp = document.querySelector("#template");
						var placeImg = temp.querySelector(".image-frame>img");
						var placeName = temp.querySelector(".place-frame>p");
						var placeId = temp.querySelector("input[name='post-id']");
						placeImg.src = result[i].img;
						placeName.textContent = result[i].name;
						placeId.value = result[i].id;
						var clone = document.importNode(temp, true);
						clone.classList.remove("hidden");
						clone.id = "";
						postRootDiv.appendChild(clone);
					}
				}
				postAdd();
				postEdit();
				postDelete();
			};

			request.open("POST", "selectDay", false);
			request.send(formData);
		}
	}

	//오른쪽 화살표 버튼
	rightButton.onclick = function(){
		var lastDay = parseInt(dayButtons[2].value);
		var period = parseInt(document.querySelector("#period").value);
		if(period < 4 || lastDay == period)
			alert("다음 날짜가 없습니다.");
		else{

			var formData = new FormData(formElement);
			var request = new XMLHttpRequest();
			
			request.onreadystatechange = function(){

				if(request.readyState != 4)	//	4번상태: 페이지 로딩이 완료 되지 않으면 리턴
					return;
				var returnString = request.responseText;
				var result = JSON.parse(returnString);
				var currDayInput = document.querySelector("#curr-day");
				var postRootDiv = document.querySelector("#post-root");
				currDayInput.value = lastDay+1;
				postRootDiv.innerHTML = "";
				for(var j=0; j<dayButtons.length; j++){
					dayButtons[j].style.color = "#D8D8D8";
					dayButtons[j].value = lastDay+j-1;
					dayButtons[j].textContent = "DAY"+(lastDay+j-1);
				}
				dayButtons[2].style.color = "#E64C3C";

				for(var i=0; i<result.length; i++){
					if(parseInt(result[i].day) == lastDay+1){
						var temp = document.querySelector("#template");
						var placeImg = temp.querySelector(".image-frame>img");
						var placeName = temp.querySelector(".place-frame>p");
						var placeId = temp.querySelector("input[name='post-id']");
						placeImg.src = result[i].img;
						placeName.textContent = result[i].name;
						placeId.value = result[i].id;
						var clone = document.importNode(temp, true);
						clone.classList.remove("hidden");
						clone.id = "";
						postRootDiv.appendChild(clone);
					}
				}
				postAdd();
				postEdit();
				postDelete();

			};

			request.open("POST", "selectDay", false);
			request.send(formData);
		}
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