window.addEventListener("load", function () {
	/*ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 일정추가  ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ*/
    var plus = document.querySelector("#add-day .plus");
    var now = document.querySelector("#add-day .now span");
    var left = document.querySelector("#add-day .left-direct");
    var right = document.querySelector("#add-day .right-direct");
    var allminus = document.querySelector("#add-day .all-minus");
    var minus = document.querySelector("#add-day .minus");
    var count = parseInt(now.textContent);
    var num = 1;
    var lastday =1;
    /*ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 메모버튼 업 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ*/
    var memoButton = document.getElementsByClassName("btn-memo");
    var modal = document.getElementsByClassName("modal");
    var close = document.getElementsByClassName("close");
    var save = document.querySelector(".save");
    
    var time = document.querySelector("#memoscreen>ul>li")
    /*ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ+ - 버튼 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ*/
    var arrInput = new Array(0);
    var arrInputValue = new Array(0);
  
  
    var verySad = document.querySelector(".verysad");
    var origin = verySad.querySelector(".select-place");
    
    var addedDiv = document.createElement("div");
    var addedFormDiv = document.querySelector(".addedFormDiv");
    var costPlus = document.querySelector(".modal .cost-plus");
    var costMinus = document.querySelector(".modal .cost-minus");
    
    var clone = verySad.cloneNode(true);
    var count = 0;
    /*ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ친구 추가ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ*/
    var size = document.getElementsByName("checked-friend").length;
	var addtionFriend = document.querySelector(".addition-friend");
	
	
	var checkedFriend = document.getElementsByName("checked-friend");
	var ple = "";
	var msg = "님께 함께 계획짜기를 요청했습니다  :)\n";
	var waitBox = document.querySelector(".wait-box");
	
	var addFriendButton = document.querySelector("#add-friend");
	var modalFriend = document.querySelector(".modal-friend");
	var close1 = document.querySelector(".close1");
	/*ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ*/
	
	
	
	
	/*ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ친구 추가ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ*/
	addFriendButton.onclick = function(){
		modalFriend.style.display = "block";
	}
	
	close1.onclick = function(){
		modalFriend.style.display = "none";
	}
	
	    
	
	
	addtionFriend.onclick = function() {
		for (var i = 0; i < checkedFriend.length; i++) {
			
			if (checkedFriend[i].checked) {
				ple += checkedFriend[i].value + " ";
				
				if(waitBox.innerHTML.indexOf(checkedFriend[i].value)==-1)
				waitBox.innerHTML+=checkedFriend[i].value+"\n님<br/><br/>";
				
			}
			
		}
		alert(ple + msg);
		ple="";
	
	}
    
    
    
    
    
    
     /*ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 비용 + - 버튼 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ*/
    
    costPlus.onclick = function(e){
    	arrInput.push(arrInput.length);
    	arrInputValue.push("");
    	display();
    	/*clone = verySad.cloneNode(true);
    	addedFormDiv.appendChild(clone);
    	count++;*/
    };
    
    function display() {
    	addedFormDiv.innerHTML="";
    	  for (I=0;I<arrInput.length;I++) {
    		  clone = verySad.cloneNode(true)
    		  addedFormDiv.appendChild(clone);
    	  }
    }
    
    
    costMinus.onclick = function(e){
    	if (arrInput.length > 0) { 
    	     arrInput.pop(); 
    	     arrInputValue.pop();
    	  }
    	  display(); 
    	/*if(count==1){
    	addedFormDiv.removeChild(clone);
    	count = 1;
    	}else{
    		addedFormDiv.removeChild(clone);
    		count = 1;
    	}*/
    }
    
     
    
   
    
    /*ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ*/
    
    
    /*ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 메모창  ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ*/
    
   /* memoButton.onclick = function(){
    	modal.style.display = "block";
    };*/
    
  
    //클로저 아...
    for(var i=0;i<memoButton.length;i++){
    	(function(m) {
    		memoButton[m].onclick = function(){
    			modal[m].style.display = "block";
    		}
    	})(i);
	}; 
    
    
    for(var i=0; i<close.length; i++){
    	close[i].onclick = function(){
			for(var i=0; i<modal.length; i++){
				modal[i].style.display = "none";
			}
			
		};
	};
    
    
    
    
    /*ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 날짜 더하기  ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ*/
    
    
    plus.onclick = function () {
    	if(num<60){
    		now.textContent = ++num;
    		lastday++;
    	}
    	
        
    };
    
    left.onclick = function () {
    	if(num >1){
    		now.textContent = --num;
    	}else{
    		alert("첫 일정입니다. 즐거운 여행되세요 :)");
    	}
    	
    };
    
    right.onclick = function () {
    		if(lastday == num){
    			alert("마지막 일정입니다. 일정을 더 추가해주세요 :)");
    		}
    		if(lastday != num){
    			now.textContent = ++num;
    		}
    };
    
    minus.onclick = function(){
    	//delete num의 현재 데이터
    	//show -1 day의 데이터
    }
    
    
    allminus.onclick = function () {
    	//delete all 데이터
    	//show new 1dat 데이터 (빈칸)
    	count=1;
		now.textContent = count;
    };
    
    
    
    	

    
    
    
});

