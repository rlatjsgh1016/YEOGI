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
	}
    
    
    for(var i=0; i<close.length; i++){
    	close[i].onclick = function(){
			for(var i=0; i<modal.length; i++)
				modal[i].style.display = "none";
			
		};
	}
    
    
    
    
    /*ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 메모창  ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ*/
    
    
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

