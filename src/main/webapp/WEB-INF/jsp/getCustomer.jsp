<!doctype html>
<%@ page contentType="text/html; charset=UTF-8"%>
<html>

<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.3/angular.min.js"></script>
</head>

<body>

	<h1>Get All Balance</h1>

	<div ng-app="customerApp" ng-controller="CustomerJSController">
		<table>
			<tr ng-repeat="customer in customers ">
				<td>Trip ID :: <span>{{customer.custId}}</td>
				<td>Balance :: <span>{{customer.custName}}</td>
			</tr>
		</table>
	</div>
	<script type="text/javascript">
		var app = angular.module('customerApp', []);
		app.controller('CustomerJSController', function($scope, $http) {
			console.log("Customer call method invoked");
			$http.get('/jt/customers').then(function(response) {
				console.log("Inside Success Get call..");
				console.log(JSON.stringify(response));
				$scope.customers = response.data;
				JSON.stringify(response);
			});
		});
	</script>
</body>
</html>