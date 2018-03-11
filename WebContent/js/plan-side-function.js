window.addEventListener("load", function () {

    var plus = document.querySelector("#add-day .plus");
    var now = document.querySelector("#add-day .now span");
    var left = document.querySelector("#add-day .left-direct");
    var right = document.querySelector("#add-day .right-direct");
    var allminus = document.querySelector("#add-day .all-minus");
    var count = parseInt(now.textContent);
    /*ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ*/
    var memoButton = document.getElementsByClassName("btn-memo");
    var modal = document.getElementsByClassName("modal");
    var close = document.getElementsByClassName("close");
    var save = document.querySelector(".save");
    /*ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ+ - 버튼 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ*/
    var verySad = document.querySelector(".verysad");
    var origin = verySad.querySelector(".select-place");
    
    var addedDiv = document.createElement("div");
    var addedFormDiv = document.querySelector(".addedFormDiv");
    var costPlus = document.querySelector(".modal .cost-plus");
    var costMinus = document.querySelector(".modal .cost-minus");
    
    var clone = verySad.cloneNode(true);
    var count = 0;
    /*ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ*/
    
    
    
    
    
    
    
    
    
    
     /*ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ + - 버튼 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ*/
    costPlus.onclick = function(e){
    	clone = verySad.cloneNode(true);
    	addedFormDiv.appendChild(clone);
    	count++;
    };
    
    costMinus.onclick = function(e){
    	if(count==1){
    	addedFormDiv.removeChild(clone);
    	count--;
    	}else{
    		addedFormDiv.removeChild(clone);
    		count = 1;
    	}
    		
    	
    }
    
   
    
    /*ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ*/
    
    
    /*ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 메모창  ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ*/
    
   /* memoButton.onclick = function(){
    	modal.style.display = "block";
    };*/
    
   
    for(var i=0; i<memoButton.length; i++){
    	memoButton[i].onclick = function(){
			for(var i=0; i<modal.length; i++){
				modal[i].style.display = "block";
			}
		};
	};
    
    
    for(var i=0; i<close.length; i++){
    	close[i].onclick = function(){
			for(var i=0; i<modal.length; i++)
				modal[i].style.display = "none";
			
		};
	};
    
    
    
    
    /*ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 날짜 더하기  ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ*/
    
    
    plus.onclick = function () {
    	if(count<60)
        now.textContent = ++count;
        
    };
    
    left.onclick = function () {
    	if(count >1)
    		now.textContent = --count;
    	
    };
    
    right.onclick = function () {
    		now.textContent = ++count;
    };
    
    allminus.onclick = function () {
    	count=1;
		now.textContent = count;
    };
    
    
    
    	
    
    
   
    
    
    
});

