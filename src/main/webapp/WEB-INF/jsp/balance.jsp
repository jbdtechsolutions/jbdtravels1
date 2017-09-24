<!doctype html>
<%@ page contentType="text/html; charset=UTF-8"%>
<html>

<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.3/angular.min.js"></script>
</head>

<body>

	<h1>Hello AJS! #3</h1>

	<div ng-app="tripBalance" ng-controller="BalanceJSController">
		<table>
			<tr ng-repeat="balance in balances ">
				<td>Trip ID :: <span>{{balance.tripId}}</td>
				<td>Balance :: <span>{{balance.balanceAmount}}</td>
			</tr>
		</table>
		<p>
			Trip ID :: <span>{{balance.tripId}}</span>!
		</p>

		<p>
			balanceAmount :: <span>{{balance.balanceAmount}}</span>!
		</p>
	</div>


	<script type="text/javascript">
		var app = angular.module('tripBalance', []);
		app.controller('BalanceJSController', function($scope, $http) {
			console.log("after Balance Controller call..");
			$http.get('/jt/balance').success(function(response) {
				console.log("Inside Success Get call..");
				console.log(JSON.stringify(response));
				$scope.balances = response.data;
				JSON.stringify(response);
			}).error(function(response) {
				console.log("Inside Error Get call..");
				console.log(JSON.stringify(response));
				$scope.balances = response.data;
				JSON.stringify(response);
			});
		});
	</script>
</body>
</html>