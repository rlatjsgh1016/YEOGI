

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
	var spdTypeSelect = document.querySelector("select[name='spd-type']");
	var spdUnitSelect = document.querySelector("select[name='spd-unit']");
	var spdContentInput = document.querySelector("input[name='spd-content']");
	var spdAmountInput = document.querySelector("input[name='spd-amount']");
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

	spdContentInput.oninput = function(){
		isInputSpdContent = true;
	};

	spdAmountInput.oninput = function(){
		isInputSpdAmount = true;
	};

	postSubmitButton.onclick = function(e){
		if(spdTypeSelect.value == "" && spdContentInput.value != ""){
			alert("지출유형을 선택해주세요.");
			e.preventDefault();
			return;
		}
		else if(spdUnitSelect.value == "" && spdAmountInput != ""){
			alert("화폐단위를 선택해주세요.");
			e.preventDefault();
			return;
		}
	};
	
});