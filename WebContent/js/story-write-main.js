

window.addEventListener("load", function(){
	
	//버튼 정의
	var mainButtons = document.querySelectorAll("input[name='btn-main']");
	var addPostButton = document.querySelector("input[name='btn-add-post']");
	var editPostButton = document.querySelector("input[name='btn-edit-post']");
	var cancelButton = this.document.querySelector("input[name='btn-cancel']");
	
	//로그 테이블 데이터 정의
	var themesButtons = document.querySelectorAll("#themes>button");
	var themesInput = document.querySelector("input[name='themes']");
	var fileInput = document.querySelector("#attached-file");
	var formElement = document.querySelector("#form-main");
	var visual = document.querySelector("#visual");
	var inputMemo = document.querySelector("textarea[name='memo']");
	var inputTitle = document.querySelector("input[name='title']");
	var inputSubTitle = document.querySelector("input[name='sub-title']");
	var inputCoverImg = document.querySelector("input[name='cover-img']");
	var inputLockYN = document.querySelector("input[name='lock-yn']");
	var selectPeriod = document.querySelector("select[name='period']");
	var inputStartDate = document.querySelector("input[name='start-date']");
	var inputCompanion = document.querySelector("input[name='companion']");
	var inputHit = document.querySelector("input[name='hit']");
	var selectNation = document.querySelector("select[name='select-nation']");

	//포스트 테이블 데이터 정의
	var inputUpdatePostId = document.querySelector("#update-post-id");
	var inputTourLogId = document.querySelector("input[name='tour-log-id']");
	var inputPostMemo = document.querySelector("#post-memo");
	var selectLocId = document.querySelector("select[name='select-loc-id']");
	var selectVehicle = document.querySelector("select[name='vehicle']");
	var selectSpdType = document.querySelector("#spd-type");
	var inputSpdContent = document.querySelector("#spd-content");
	var selectSpdUnit = document.querySelector("#spd-unit");
	var inputSpdAmount = document.querySelector("#spd-amount");
	var inputTag = document.querySelector("input[name='tag']");
	
	
	//배경화면 로딩
	var coverImgInput = document.querySelector("input[name='cover-img']");
	if(coverImgInput.value != null && coverImgInput.value !="")
		visual.style.background = "#1C1C1C url(../coverImg/"+coverImgInput.value+") no-repeat center";
	else
		visual.style.background = "#1C1C1C";
	
	//포스트 업데이트 버튼
	editPostButton.onclick = function(){
		inputPostMemo.value = nicEditors.findEditor('post-memo').getContent();

		if(selectLocId.value == null || selectLocId.value == ""){
			alert("장소명을 선택해주세요.");
			return;
		}
		if(selectSpdType.value == null || selectSpdType.value == ""
			|| inputSpdContent.value == null || inputSpdContent.value == ""
			|| selectSpdUnit.value == null || selectSpdUnit.value == ""
			|| inputSpdAmount.value == null || inputSpdAmount.value == "")
		{
			alert("지출내역을 입력해주세요.");
			return;
		}

		var request1 = new XMLHttpRequest();
		var formData1 = new FormData(formElement);

		request1.onload = function(){
			result = JSON.parse(request1.responseText);
			
			var viewPostData = result.post;
			var viewSpdData = result.spd;
			var viewTagData = result.tag;
			var viewSumData = result.sum;
			
			var viewRootDiv = document.querySelector("#view-root");
			viewRootDiv.innerHTML = "";
			var tempRoot = document.querySelector("#view-template");
			var tempLoc = document.querySelector("#view-loc-template");
			var tempSpd = document.querySelector("#view-spd-template");
			var tempTag = document.querySelector("#view-tag-template");
			
			for(var i in viewPostData){
				//루트 템플릿 복사 & id / class 삭제
				var cloneRoot = document.importNode(tempRoot, true);
				cloneRoot.classList.remove("hidden");
				cloneRoot.id = "";
				var viewRootUi = cloneRoot.querySelector("#view-ul-root");
				viewRootUi.id = "";
				//루트 템플릿 데이터 삽입
				var locationName1 = cloneRoot.querySelector("p:first-child");
				locationName1.textContent = viewPostData[i].name;
				var postContent = cloneRoot.querySelector(".view-frame>div:first-child");
				postContent.textContent = viewPostData[i].content;
				
				//장소 템플릿 복사 & id / class 삭제
				var cloneLoc = document.importNode(tempLoc, true);
				cloneLoc.classList.remove("hidden");
				cloneLoc.id = "";
				//장소 템플릿 데이터 삽입
				cloneLoc.textContent = viewPostData[i].name;
				//장소 템플릿 붙여넣기
				viewRootUi.appendChild(cloneLoc);
				
				for(var j in viewSpdData){
					if(viewSpdData[j].tLogPostId == viewPostData[i].id){
						//지출 템플릿 복사 & id / class 삭제
						var cloneSpd = document.importNode(tempSpd, true);
						cloneSpd.classList.remove("hidden");
						cloneSpd.id = "";
						//지출 템플릿 데이터 삽입
						var spans = cloneSpd.querySelectorAll("span");
						spans[0].textContent = viewSpdData[j].type;
						spans[1].textContent = viewSpdData[j].spdContent;
						spans[2].textContent = viewSpdData[j].unit;
						spans[3].textContent = viewSpdData[j].amount;
						//지출 템플릿 붙여넣기
						viewRootUi.appendChild(cloneSpd);
					}
				}
				
				for(var k in viewTagData){
					//태그 템플릿 복사 & id / class 삭제
					var cloneTag = document.importNode(tempTag, true);
					cloneTag.classList.remove("hidden");
					cloneTag.id = "";
					//태그 템플릿 데이터 삽입
					if(viewTagData[k].tLogPostId == viewPostData[i].id){
						cloneTag.textContent = "#" + viewTagData[k].tagContent;
						//태그 템플릿 데이터 삽입
						viewRootUi.appendChild(cloneTag);
					}
				}
				//루트 템플릿 붙여넣기
				viewRootDiv.appendChild(cloneRoot);
			}
			
			//장소 리스트 갱신
			var currDayInput = document.querySelector("#curr-day");
			var postRootDiv = document.querySelector("#post-root");
			postRootDiv.innerHTML = "";
			for(var i=0; i<viewPostData.length; i++){
				if(viewPostData[i].day == currDayInput.value){
					var temp = document.querySelector("#template");
					var placeImg = temp.querySelector(".image-frame>img");
					var placeName = temp.querySelector(".place-frame>p");
					var placeId = temp.querySelector("input[name='post-id']");
					placeImg.src = viewPostData[i].img;
					placeName.textContent = viewPostData[i].name;
					placeId.value = viewPostData[i].id;
					var clone = document.importNode(temp, true);
					clone.classList.remove("hidden");
					clone.id = "";
					postRootDiv.appendChild(clone);
				}
			}
			postAdd();
			postEdit();
			postDelete();
			
			//포스트창 닫기
			var detailPostMadal = document.querySelector("#detail-post-modal");
			detailPostMadal.style.display = "none";
			inputPostMemo.value = nicEditors.findEditor('post-memo').setContent("");
			var vehicleOpts = selectVehicle.options;
			for(var i=0; i<vehicleOpts.length; i++){
				vehicleOpts[i].selected = false;
			}
			vehicleOpts[0].selected = true;
			
			inputSpdContent.value ="";
			inputSpdAmount.value = "";
			
			var locOpts = selectLocId.options;
			for(var i=0; i<locOpts.length; i++){
				locOpts[i].selected = false;
			}
			locOpts[0].selected = true;
			
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
		}

		request1.open("POST","updatePost",true);
		request1.send(formData1)
	}
	
	
	//포스트 저장버튼
	addPostButton.onclick = function(){
		inputPostMemo.value = nicEditors.findEditor('post-memo').getContent();
		
		if(selectLocId.value == null || selectLocId.value == ""){
			alert("장소명을 선택해주세요.");
			return;
		}
		if(selectSpdType.value == null || selectSpdType.value == ""
			|| inputSpdContent.value == null || inputSpdContent.value == ""
			|| selectSpdUnit.value == null || selectSpdUnit.value == ""
			|| inputSpdAmount.value == null || inputSpdAmount.value == "")
		{
			alert("지출내역을 입력해주세요.");
			return;
		}

		var request1 = new XMLHttpRequest();
		var formData1 = new FormData(formElement);
		
		request1.onload = function(){
			result = JSON.parse(request1.responseText);
			
			var viewPostData = result.post;
			var viewSpdData = result.spd;
			var viewTagData = result.tag;
			var viewSumData = result.sum;
			
			var viewRootDiv = document.querySelector("#view-root");
			viewRootDiv.innerHTML = "";
			var tempRoot = document.querySelector("#view-template");
			var tempLoc = document.querySelector("#view-loc-template");
			var tempSpd = document.querySelector("#view-spd-template");
			var tempTag = document.querySelector("#view-tag-template");
			
			for(var i in viewPostData){
				//루트 템플릿 복사 & id / class 삭제
				var cloneRoot = document.importNode(tempRoot, true);
				cloneRoot.classList.remove("hidden");
				cloneRoot.id = "";
				var viewRootUi = cloneRoot.querySelector("#view-ul-root");
				viewRootUi.id = "";
				//루트 템플릿 데이터 삽입
				var locationName1 = cloneRoot.querySelector("p:first-child");
				locationName1.textContent = viewPostData[i].name;
				var postContent = cloneRoot.querySelector(".view-frame>div:first-child");
				postContent.textContent = viewPostData[i].content;
				
				//장소 템플릿 복사 & id / class 삭제
				var cloneLoc = document.importNode(tempLoc, true);
				cloneLoc.classList.remove("hidden");
				cloneLoc.id = "";
				//장소 템플릿 데이터 삽입
				cloneLoc.textContent = viewPostData[i].name;
				//장소 템플릿 붙여넣기
				viewRootUi.appendChild(cloneLoc);
				
				for(var j in viewSpdData){
					if(viewSpdData[j].tLogPostId == viewPostData[i].id){
						//지출 템플릿 복사 & id / class 삭제
						var cloneSpd = document.importNode(tempSpd, true);
						cloneSpd.classList.remove("hidden");
						cloneSpd.id = "";
						//지출 템플릿 데이터 삽입
						var spans = cloneSpd.querySelectorAll("span");
						spans[0].textContent = viewSpdData[j].type;
						spans[1].textContent = viewSpdData[j].spdContent;
						spans[2].textContent = viewSpdData[j].unit;
						spans[3].textContent = viewSpdData[j].amount;
						//지출 템플릿 붙여넣기
						viewRootUi.appendChild(cloneSpd);
					}
				}
				
				for(var k in viewTagData){
					//태그 템플릿 복사 & id / class 삭제
					var cloneTag = document.importNode(tempTag, true);
					cloneTag.classList.remove("hidden");
					cloneTag.id = "";
					//태그 템플릿 데이터 삽입
					if(viewTagData[k].tLogPostId == viewPostData[i].id){
						cloneTag.textContent = "#" + viewTagData[k].tagContent;
						//태그 템플릿 데이터 삽입
						viewRootUi.appendChild(cloneTag);
					}
				}
				//루트 템플릿 붙여넣기
				viewRootDiv.appendChild(cloneRoot);
			}
			
			//장소 리스트 갱신
			var currDayInput = document.querySelector("#curr-day");
			var postRootDiv = document.querySelector("#post-root");
			postRootDiv.innerHTML = "";
			for(var i=0; i<viewPostData.length; i++){
				if(viewPostData[i].day == currDayInput.value){
					var temp = document.querySelector("#template");
					var placeImg = temp.querySelector(".image-frame>img");
					var placeName = temp.querySelector(".place-frame>p");
					var placeId = temp.querySelector("input[name='post-id']");
					placeImg.src = viewPostData[i].img;
					placeName.textContent = viewPostData[i].name;
					placeId.value = viewPostData[i].id;
					var clone = document.importNode(temp, true);
					clone.classList.remove("hidden");
					clone.id = "";
					postRootDiv.appendChild(clone);
				}
			}
			postAdd();
			postEdit();
			postDelete();
			
			//포스트창 닫기
			var detailPostMadal = document.querySelector("#detail-post-modal");
			detailPostMadal.style.display = "none";
			inputPostMemo.value = nicEditors.findEditor('post-memo').setContent("");
			var vehicleOpts = selectVehicle.options;
			for(var i=0; i<vehicleOpts.length; i++){
				vehicleOpts[i].selected = false;
			}
			vehicleOpts[0].selected = true;
			
			inputSpdContent.value ="";
			inputSpdAmount.value = "";
			
			var locOpts = selectLocId.options;
			for(var i=0; i<locOpts.length; i++){
				locOpts[i].selected = false;
			}
			locOpts[0].selected = true;
			
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
		}

		request1.open("POST","addPost",true);
		request1.send(formData1)
	}
	

	//포스트 추가버튼
	postAdd();
	function postAdd(){

		var btnPlaceAdd = document.querySelectorAll(".btn-place-add");
		var detailPostMadal = document.querySelector("#detail-post-modal");

		for(var i=0; i<btnPlaceAdd.length; i++){
			btnPlaceAdd[i].addEventListener("click",function(i){
				detailPostMadal.style.display = "block";
				addPostButton.style.display = "block";
				editPostButton.style.display = "none";
	
				inputPostMemo.value = nicEditors.findEditor('post-memo').setContent("");
				var vehicleOpts = selectVehicle.options;
				for(var i=0; i<vehicleOpts.length; i++){
					vehicleOpts[i].selected = false;
				}
				vehicleOpts[0].selected = true;
	
				inputSpdContent.value ="";
				inputSpdAmount.value = "";
	
				var locOpts = selectLocId.options;
				for(var i=0; i<locOpts.length; i++){
					locOpts[i].selected = false;
				}
				locOpts[0].selected = true;

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
				addPostButton.style.display = "none";
				editPostButton.style.display = "block";
				var postIdInput = btnPlaceEdit[i].previousElementSibling;
				inputUpdatePostId.value = postIdInput.value;

				var postId = new FormData();
				postId.append("post-id", postIdInput.value);
	
				var request1 = new XMLHttpRequest();
	
				request1.onload = function(){
					var result = JSON.parse(request1.responseText);
					var editPostData = result.post;
					var editSpdData = result.spd;
					var editTagData = result.tag;
						
					//inputPostMemo.value = result.content;
					nicEditors.findEditor('post-memo').setContent(editPostData.content);
	
					var locOpts = selectLocId.options;
					for(var i=0; i<locOpts.length; i++){
						locOpts[i].selected = false;
						if(locOpts[i].value == editPostData.locId){
							locOpts[i].selected = true;
						}
					}

					var vehicleOpts = selectVehicle.options;
					for(var i=0; i<vehicleOpts.length; i++){
						vehicleOpts[i].selected = false;
						if(vehicleOpts[i].value == editPostData.trans){
							vehicleOpts[i].selected = true;
						}
					}

					if(editSpdData != null && editSpdData != ""){
						inputSpdContent.value = editSpdData[0].spdContent;
						inputSpdAmount.value = parseInt(editSpdData[0].amount);
	
						var spdTypeOpts = selectSpdType.options;
						for(var i=0; i<spdTypeOpts.length; i++){
							spdTypeOpts[i].selected = false;
							if(spdTypeOpts[i].value == editSpdData[0].type){
								spdTypeOpts[i].selected = true;
							}
						}
						var spdUnitOpts = selectSpdUnit.options;
						for(var i=0; i<spdUnitOpts.length; i++){
							spdUnitOpts[i].selected = false;
							if(spdUnitOpts[i].value == editSpdData[0].unit){
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

					if(editTagData != null && editTagData != ""){
						var arr = [];
						for(var i in editTagData)
							arr.push(editTagData[i].tagContent);
						inputTag.value = arr.join(",");
					}
				}
			
				request1.open("POST","editPost",false);
				request1.send(postId);
	
			}.bind(this,i));
		}
	}
	
	//포스트 삭제 버튼
	postDelete();
	function postDelete(){
		
		var btnPlaceDelete = document.querySelectorAll(".btn-place-delete");

		for(var i=0; i<btnPlaceDelete.length; i++){
			btnPlaceDelete[i].addEventListener("click",function(i){
				var isDelete = confirm("선택한 게시물을 삭제하시겠습니까?");
				if(!isDelete){
					alert("삭제를 취소하였습니다.");
				}
				else if(isDelete){
					var postId = new FormData();
					var postIdInput = btnPlaceDelete[i].nextElementSibling;
					
					postId.append("post-id", postIdInput.value);
					postId.append("tour-log-id", inputTourLogId.value);
					
					var request = new XMLHttpRequest();
					
					request.onload = function(){
						var result = JSON.parse(request.responseText);
						
						var viewPostData = result.post;
						var viewSpdData = result.spd;
						var viewTagData = result.tag;
						var viewSumData = result.sum;
						
						var viewRootDiv = document.querySelector("#view-root");
						viewRootDiv.innerHTML = "";
						var tempRoot = document.querySelector("#view-template");
						var tempLoc = document.querySelector("#view-loc-template");
						var tempSpd = document.querySelector("#view-spd-template");
						var tempTag = document.querySelector("#view-tag-template");
						
						for(var i in viewPostData){
							//루트 템플릿 복사 & id / class 삭제
							var cloneRoot = document.importNode(tempRoot, true);
							cloneRoot.classList.remove("hidden");
							cloneRoot.id = "";
							var viewRootUi = cloneRoot.querySelector("#view-ul-root");
							viewRootUi.id = "";
							//루트 템플릿 데이터 삽입
							var locationName1 = cloneRoot.querySelector("p:first-child");
							locationName1.textContent = viewPostData[i].name;
							var postContent = cloneRoot.querySelector(".view-frame>div:first-child");
							postContent.textContent = viewPostData[i].content;
							
							//장소 템플릿 복사 & id / class 삭제
							var cloneLoc = document.importNode(tempLoc, true);
							cloneLoc.classList.remove("hidden");
							cloneLoc.id = "";
							//장소 템플릿 데이터 삽입
							cloneLoc.textContent = viewPostData[i].name;
							//장소 템플릿 붙여넣기
							viewRootUi.appendChild(cloneLoc);
							
							for(var j in viewSpdData){
								if(viewSpdData[j].tLogPostId == viewPostData[i].id){
									//지출 템플릿 복사 & id / class 삭제
									var cloneSpd = document.importNode(tempSpd, true);
									cloneSpd.classList.remove("hidden");
									cloneSpd.id = "";
									//지출 템플릿 데이터 삽입
									var spans = cloneSpd.querySelectorAll("span");
									spans[0].textContent = viewSpdData[j].type;
									spans[1].textContent = viewSpdData[j].spdContent;
									spans[2].textContent = viewSpdData[j].unit;
									spans[3].textContent = viewSpdData[j].amount;
									//지출 템플릿 붙여넣기
									viewRootUi.appendChild(cloneSpd);
								}
							}
							
							for(var k in viewTagData){
								//태그 템플릿 복사 & id / class 삭제
								var cloneTag = document.importNode(tempTag, true);
								cloneTag.classList.remove("hidden");
								cloneTag.id = "";
								//태그 템플릿 데이터 삽입
								if(viewTagData[k].tLogPostId == viewPostData[i].id){
									cloneTag.textContent = "#" + viewTagData[k].tagContent;
									//태그 템플릿 데이터 삽입
									viewRootUi.appendChild(cloneTag);
								}
							}
							//루트 템플릿 붙여넣기
							viewRootDiv.appendChild(cloneRoot);
						}
						
						//장소 리스트 갱신
						var currDayInput = document.querySelector("#curr-day");
						var postRootDiv = document.querySelector("#post-root");
						postRootDiv.innerHTML = "";
						for(var i=0; i<viewPostData.length; i++){
							if(viewPostData[i].day == currDayInput.value){
								var temp = document.querySelector("#template");
								var placeImg = temp.querySelector(".image-frame>img");
								var placeName = temp.querySelector(".place-frame>p");
								var placeId = temp.querySelector("input[name='post-id']");
								placeImg.src = viewPostData[i].img;
								placeName.textContent = viewPostData[i].name;
								placeId.value = viewPostData[i].id;
								var clone = document.importNode(temp, true);
								clone.classList.remove("hidden");
								clone.id = "";
								postRootDiv.appendChild(clone);
							}
						}
						postAdd();
						postEdit();
						postDelete();
						
						alert("게시물을 삭제하였습니다.");
						
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
	
				inputPostMemo.value = nicEditors.findEditor('post-memo').setContent("");
				var vehicleOpts = selectVehicle.options;
				for(var i=0; i<vehicleOpts.length; i++){
					vehicleOpts[i].selected = false;
				}
				vehicleOpts[0].selected = true;

				var locOpts = selectLocId.options;
				for(var i=0; i<locOpts.length; i++){
					locOpts[i].selected = false;
				}
				locOpts[0].selected = true;
	
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

			request.open("POST", "selectDay", true);
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

			request.open("POST", "selectDay", true);
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

			request.open("POST", "selectDay", true);
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
					request.open("POST", "lock", true);
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
					request.open("POST", "lock", true);
					request.send(formData);
				}break;
				case "동행자 추가":{

				}break;
			}
		}.bind(this,i));
	};

	cancelButton.onclick = function(){
		location.href = "../../../main";
	}
	
	
});