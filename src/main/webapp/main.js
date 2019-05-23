function addAccount() {
	let data =   {
        'firstName':  `${ $('#fname').val()}`,
        'lastName':  `${  $('#lname').val()}`
    };
	$.ajax({
		type: "POST",
		url: "http://localhost:8080/AccountApplication-0.0.1-SNAPSHOT/rest/account/addAccount",
		
		data:  JSON.stringify(data),
		contentType: "application/json; charset=utf-8",
		dataType: "json",
		success: function(msg) { 
			alert('account has been sucessfully added');
		}
	
	});
}

function searchAccount(){
	$.ajax({
		type: "GET",
		url: "http://localhost:8080/AccountApplication-0.0.1-SNAPSHOT/rest/account/" +
				"getAccount/"+`${ $('#idd').val()}`,
		
		success: function(msg) { 
			alert('account has been sucessfully added');
		}
	
	});
	
	
}