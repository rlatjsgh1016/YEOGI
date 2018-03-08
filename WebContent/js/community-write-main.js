window.addEventListener("load", function(){
	var writeDefault = document.getElementByClassName("write-default");
	var writeNew = document.getElementByClassName("wirte-new");
	var writeAdit = document.getElementByClassName("write-adit");
	var writeType = document.getElementByClassName("write-type");
	
	var mid = document.getElementById("select-title");
	
	var selectTitle = document.getElementById("select-title");
	
	var selectType = document.getElementById("select-writetype");	
	
	var selectStartDate = document.getElementById("select-start-date");
	
	var selectEndDate = document.getElementById("select-end-date");
	
	var selectTheme = document.getElementById("select-theme");		

	selectWrite.onchange = function(){
		selectType.value = selectType.options[selectNation.selectedIndex].text;
	};
	
	selectWrite.onchange = function(){
		selectAdit.value = selectAdit.options[selectPeriod.selectedIndex].text;
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
	
	
	
	