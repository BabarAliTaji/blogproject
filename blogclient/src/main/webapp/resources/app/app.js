require({

	baseUrl : "../resources/resources/app"

}, [ "component/tooltip" ], function(Tooltip) {

	console.log("application started...");
	var tootip = new Tooltip();

});