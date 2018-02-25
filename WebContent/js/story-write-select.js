window.addEventListener("load", function(){
	var WriteDefault = document.getElementsByClassName("write-default");
	var WriteNew = document.getElementsByClassName("write-new");
	var WritePlanLoad = document.getElementsByClassName("write-plan-load");
	var btnSelectNew = document.getElementById("btn-select-new");
	var btnSelectLoad = document.getElementById("btn-select-load");
		
	btnSelectNew.onclick = function(){
		for(var i=0; i<WriteDefault.length; i++){
			WriteDefault[i].style.visibility = "hidden";
		}
		for(var i=0; i<WriteNew.length; i++){
			WriteNew[i].style.visibility = "visible";
		}
	};
	
	btnSelectLoad.onclick = function(){
		for(var i=0; i<WriteDefault.length; i++){
			WriteDefault[i].style.visibility = "hidden";
		}
		for(var i=0; i<WritePlanLoad.length; i++){
			WritePlanLoad[i].style.visibility = "visible";
		}
	};
});