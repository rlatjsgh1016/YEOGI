window.addEventListener("load", function(){
	
	var totalSpotButton = document.getElementById("btn-total-spot");
	var totalExpenseButton = document.getElementById("btn-total-expense");
	var totalSpotBox = document.getElementById("total-spot-box");
	var totalExpenseBox = document.getElementById("total-expense-box");
	var close = document.getElementsByClassName("close");
	var unlock = document.querySelector("#un-lock .unlock");
	var lock = document.querySelector("#un-lock .lock");
	var a = document.querySelector(".comment-write-box a")
	
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