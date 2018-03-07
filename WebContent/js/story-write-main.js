

window.addEventListener("load", function(){
	var btnPlaceAdd = document.getElementsByClassName("btn-place-add");
	var btnPlaceEdit = document.getElementsByClassName("btn-place-edit");
	var btnPlaceDelete = document.getElementsByClassName("btn-place-delete");
	var btnDetailPostBoxClose = document.getElementsByClassName("btn-detail-post-box-close");
	var detailPostBox = document.getElementsByClassName("detail-post-box");
	var formMain = document.getElementById("form-main");
	var btnCover = document.getElementById("btn-cover");
	var btnCompanion = document.getElementById("btn-companion");
	var btnSave = document.getElementById("btn-save");
	var modal = document.getElementsByClassName("modal");
	var nicEdit = document.getElementsByClassName("detail-textarea");
	
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
	
	btnCompanion.onclick = function(){
		formMain.submit();
	}
	
	btnSave.onclick = function(){
		formMain.submit();
	}
	
	
});