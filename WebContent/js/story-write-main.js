

window.addEventListener("load", function(){
	var btnPlaceAdd = document.getElementsByClassName("btn-place-add");
	var btnPlaceEdit = document.getElementsByClassName("btn-place-edit");
	var btnPlaceDelete = document.getElementsByClassName("btn-place-delete");
	var btnDetailPostBoxClose = document.getElementsByClassName("btn-detail-post-box-close");
	var detailPostBox = document.getElementsByClassName("detail-post-box");
	var btnCover = document.querySelector("#btn-cover");
	var modal = document.getElementsByClassName("modal");
	var themesButtons = document.querySelectorAll("#themes>button");
	var themesInput = document.querySelector("input[name='themes']");
	
	//포스트 테이블 데이터 정의
	var inputTourLogId = document.querySelector("input[name='tour-log-id']");
	var inputPostMemo = document.querySelector("input[name='post-memo']");
	var inputLocId = document.querySelector("input[name='loc-id']");
	var selectVehicle = document.querySelector("select[name='vehicle']");
	var selectSpdType = document.querySelector("select[name='spd-type']");
	var inputSpdContent = document.querySelector("input[name='spd-content']");
	var selectSpdUnit = document.querySelector("select[name='spd-unit']");
	var inputSpdAmount = document.querySelector("input[name='spd-amount']");
	var inputTag = document.querySelector("input[name='tag']");
	
	var postSubmitButton = this.document.querySelector("input[name='btn-post']");
	
	
	for(var i=0; i<btnPlaceAdd.length; i++){
		btnPlaceAdd[i].onclick = function(){
			for(var i=0; i<modal.length; i++){
				modal[i].style.display = "block";
			}
		};
	}
	
	for(var i=0; i<btnPlaceEdit.length; i++){
		btnPlaceEdit[i].onclick = function(){
			for(var i=0; i<modal.length; i++){
				modal[i].style.display = "block";
			}
		};
	}
	
	for(var i=0; i<btnDetailPostBoxClose.length; i++){
		btnDetailPostBoxClose[i].onclick = function(){
			for(var i=0; i<modal.length; i++){
				modal[i].style.display = "none";
			}
			for(var i=0; i<nicEdit.length; i++){
				nicEdit[i].value = "";
			}
		};
	}
	
	btnCover.onclick = function(e){
		e.preventDefault();
		for(var i=0; i<modal.length; i++){
			modal[i].style.display = "block";
		}
	}

	for(var i=0; i<themesButtons.length; i++){
		themesButtons[i].addEventListener("click",function(i){
			for(var j=0; j<themesButtons.length; j++){
				themesButtons[j].classList.remove("selected");
			};
			themesButtons[i].classList.add("selected");
			themesInput.value = themesButtons[i].textContent;
		}.bind(this,i));
	}

	inputSpdContent.oninput = function(){
		isInputSpdContent = true;
	};

	inputSpdAmount.oninput = function(){
		isInputSpdAmount = true;
	};

	postSubmitButton.onclick = function(e){
		
		var request = new XMLHttpRequest();
		var ctx = reqeust.servletContext().contextPath();
		
		request.onreadystatechange = function(){

            if(request.readyState != 4)	//	4번상태: 페이지 로딩이 완료 되지 않으면 리턴
                return;

            var posts = JSON.parse(request.responseText);
            if(member == null){
                alert("사용할 수 있는 아이디 입니다.");
                idChecked = true;
            }
            else{
                alert("이미 " + member.name + " 님이 사용중 입니다.");
                idChecked = false;
            }
        };

		request.open("POST", "/main/member/story/write/main", true );
		
		request.send(inputTourLogId.name+"="+inputTourLogId.value+"&"+inputPostMemo.name+"="+inputPostMemo.value+"&"+
		inputLocId.name+"="+inputLocId.value+"&"+selectVehicle.name+"="+selectVehicle.value+"&"+selectSpdType.name+"="+selectSpdType.value+"&"+
		inputSpdContent.name+"="+inputSpdContent.value+"&"+selectSpdUnit.name+"="+selectSpdUnit.value+"&"+inputSpdAmount.name+"="+inputSpdAmount.value+"&"+
		inputTag.name+"="+inputTag.value);
		
		/*if(selectSpdType.value == "" && inputSpdContent.value != ""){
			alert("지출유형을 선택해주세요.");
			e.preventDefault();
			return;
		}
		else if(selectSpdUnit.value == "" && inputSpdAmount != ""){
			alert("화폐단위를 선택해주세요.");
			e.preventDefault();
			return;
		}*/
	};
	
});