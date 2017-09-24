<!doctype html>
<%@ page contentType="text/html; charset=UTF-8"%>
<html>

<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.3/angular.min.js"></script>
</head>

<body>

<%-- 	<h2>ID : ${tripId}</h2>
	<h2>TO : ${travelTo}</h2> --%>

	<h1>Hello AJS! #3</h1>

	<div ng-app="myApp" ng-controller="TripJSController">

		<p>
			Trip ID :: <span>{{trip.tripId}}</span>!
		</p>

		<p>
			Trip To :: <span>{{trip.travelTo}}</span>!
		</p>
	</div>


	<!-- <div>
		<label>Name:</label> <input type="text" ng-model="yourName"
			placeholder="Enter a name here">
		<hr />

		<h1>Hello {{yourName}}!</h1>
	</div> -->

	<script type="text/javascript">
		var app = angular.module('myApp', []);
		app.controller('TripJSController', function($scope, $http) {
			console.log("after Controller call..");
			$http.get('jt/helloworld/KTP001').success(function(response) {
				console.log("Inside Success Get call..");
				$scope.trip = [];
				console.log(JSON.stringify(response));
				$scope.trip = response.data;
				JSON.stringify(response);
			}).error(function(response) {
				console.log("Inside Error Get call..");
				$scope.trip = [];
				console.log(JSON.stringify(response));
				$scope.trip = response.data;
				JSON.stringify(response);
			});
		});
	</script>
</body>
</html>