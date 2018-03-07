window.addEventListener("load", function () {

    var plus = document.querySelector("#add-day .plus");
    var now = document.querySelector("#add-day .now span");
    var left = document.querySelector("#add-day .left-direct");
    var right = document.querySelector("#add-day .right-direct");
    var allminus = document.querySelector("#add-day .all-minus");
    
    var count = parseInt(now.textContent);
    
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

