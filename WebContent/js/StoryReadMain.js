window.addEventListener("load", function(){	
	var totalSpotButton = document.getElementById("btn-total-spot");
	var totalExpenseButton = document.getElementById("btn-total-expense");
	var totalSpotBox = document.getElementById("total-spot-box");
	var totalExpenseBox = document.getElementById("total-expense-box");
	var close = document.getElementsByClassName("close");
	var unlock = document.querySelector("#un-lock .unlock");
	var lock = document.querySelector("#un-lock .lock");
	var a = document.querySelector(".comment-write-box a")
	var commentA = document.querySelector(".comment-cnt-box a");
	var stCommentWriteBox = document.querySelector(".st-comment-write-box");
	var commentBoard = document.querySelector("#comment_board");
	var commentId = document.querySelector("#comment_id");
	var commentReg = document.querySelector(".comment-reg");
	var form = document.querySelector("#comment-write-form");
	var newComment = form.querySelector(".new-comment");
	
	commentReg.onclick = function(){
		var cmtContent = newComment.value;
		//var board = commentBoard.value;
		//var cmtId = commentId.value;
		
		if(!cmtContent){
			alert("내용을 입력하세요.");
			return false;
		}
		/*else{
			var param ="commentBoard="+board+"&commentId="+cmtId+"&newComment="+cmtContent;
			var request = new XMLHttpRequest();
			request.onreadystatechange = checkFunc;
			request.open("POST", "main?id=" + tLogId, true);
			request.send(param);

		}*/
		
	};
	
	/*var request = new XMLHttpRequest();
	function checkFunc(){
        if(request.readyState == 4){
            // 결과값을 가져온다.
            var resultText = request.responseText;
            if(resultText == 1){ 
                document.location.reload(); // 상세보기 창 새로고침
            }
        }
    };*/

	commentA.onclick = function(){
		stCommentWriteBox.style.visibility = "visible";
	};
	
	totalSpotButton.onclick = function() {
		
		totalSpotBox.style.display = "block";
		
	};
	
	totalExpenseButton.onclick = function() {
		
		totalExpenseBox.style.display = "block";
		
	};
	
	for(var i=0; i<close.length; i++){
		close[i].onclick = function() {

			totalSpotBox.style.display = "none";
			totalExpenseBox.style.display = "none";	

		};
	}
	
	window.onclick = function(event) {
        if (event.target == totalSpotBox) {
        	totalSpotBox.style.display = "none";
        }
        else if (event.target == totalExpenseBox) {
        	totalExpenseBox.style.display = "none";
        }
    };
    
 

	unlock.onclick = function() {
		if (a.classList.contains("unlock")) {
			
			a.classList.remove("unlock");
			a.classList.add("lock");

		}
		else if(a.classList.contains("lock")){
			
			a.classList.remove("lock");
			a.classList.add("unlock");
		}

	};
	
	
		
});