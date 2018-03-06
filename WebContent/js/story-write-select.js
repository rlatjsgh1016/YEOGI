window.addEventListener("load", function(){
	var writeDefault = document.getElementsByClassName("write-default");
	var writeNew = document.getElementsByClassName("write-new");
	var writePlanLoad = document.getElementsByClassName("write-plan-load");
	var btnSelectNew = document.getElementById("btn-select-new");
	var btnSelectLoad = document.getElementById("btn-select-load");
	
	var mid = document.getElementById("select-title");
	
	var selectTitle = document.getElementById("select-title");
	
	var selectNation = document.getElementById("select-nation");	//셀렉트
	
	var selectStartDate = document.getElementById("select-start-date");
	
	var selectEndDate = document.getElementById("select-end-date");
	
	var selectPeriod = document.getElementById("select-period");	//셀렉트
	
	var selectCompanion = document.getElementById("select-companion");
	
	var selectTheme = document.getElementById("select-theme");		//셀렉트


	
	
	
	selectNation.onchange = function(){
		selectNation.value = selectNation.options[selectNation.selectedIndex].text;
	};
	
	selectNation.onchange = function(){
		selectPeriod.value = selectPeriod.options[selectPeriod.selectedIndex].text;
	};
	
	selectTheme.onchange = function(){
		selectTheme.value = selectTheme.options[selectTheme.selectedIndex].text;
	};
	
	btnSelectNew.onclick = function(){
		for(var i=0; i<writeDefault.length; i++){
			writeDefault[i].style.visibility = "hidden";
		}
		for(var i=0; i<writeNew.length; i++){
			writeNew[i].style.visibility = "visible";
		}
	};
	
	btnSelectLoad.onclick = function(){
		for(var i=0; i<writeDefault.length; i++){
			writeDefault[i].style.visibility = "hidden";
		}
		for(var i=0; i<writePlanLoad.length; i++){
			writePlanLoad[i].style.visibility = "visible";
		}
	};
	
});