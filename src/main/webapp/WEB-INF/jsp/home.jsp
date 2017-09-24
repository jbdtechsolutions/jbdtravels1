<!DOCTYPE html>
<html>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular-route.js"></script>

<body ng-app="jtApp">

	<a href="newTrip">Trip</a>
	<a href="getAllBalance">Balance</a>
	<a href="getAllCustomers">Get Customer</a>
	<a href="addNewCustomer">Add Customer</a>

	<div ng-view></div>

	<script>
		var app = angular.module("jtApp", [ "ngRoute" ]);
		app.config(function($routeProvider) {
			$routeProvider.when("/newTrip", {
				templateUrl : "newTrip.jsp"
			}).when("/getAllBalance", {
				templateUrl : "getBalance.jsp"
			}).when("/getAllCustomers", {
				templateUrl : "getCustomer.jsp"
			}).when("/addNewCustomer", {
				templateUrl : "addCustomer.jsp"
			});
		});
	</script>

</body>
</html>