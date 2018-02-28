window.addEventListener("load", function(){
	var btnPlaceAdd = document.getElementsByClassName("btn-place-add");
	var btnPlaceEdit = document.getElementsByClassName("btn-place-edit");
	var btnPlaceDelete = document.getElementsByClassName("btn-place-delete");
	var btnDetailPostBoxClose = document.getElementsByClassName("btn-detail-post-box-close");
	var detailPostBox = document.getElementsByClassName("detail-post-box");
	var formMain = document.getElementById("form-main");
	var btnCover = document.getElementById("btn-cover");
	var btnLock = document.getElementById("btn-lock");
	var btnCompanion = document.getElementById("btn-companion");
	var btnSave = document.getElementById("btn-save");
	
	for(var i=0; i<btnPlaceAdd.length; i++){
		btnPlaceAdd[i].onclick = function(){
			for(var i=0; i<detailPostBox.length; i++){
				detailPostBox[i].style.visibility = "visible";
			}
		};
	}
	
	for(var i=0; i<btnPlaceEdit.length; i++){
		btnPlaceEdit[i].onclick = function(){
			for(var i=0; i<detailPostBox.length; i++){
				detailPostBox[i].style.visibility = "visible";
			}
		};
	}
	
	for(var i=0; i<btnDetailPostBoxClose.length; i++){
		btnDetailPostBoxClose[i].onclick = function(){
			for(var i=0; i<detailPostBox.length; i++){
				detailPostBox[i].style.visibility = "hidden";
			}
		};
	}
	
	btnCover.onclick = function(){
		formMain.submit();
	}
	
	btnLock.onclick = function(){
		formMain.submit();
	}
	
	btnCompanion.onclick = function(){
		formMain.submit();
	}
	
	btnSave.onclick = function(){
		formMain.submit();
	}
	
	window.onclick = function(event) {
		for(var i=0; i<detailPostBox.length; i++){
			if(event.target == detailPostBox[i])
				detailPostBox[i].style.visibility = "hidden";
		}
    }
});