<!doctype html>
<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<head>
<title>Hello AngularJS</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.3/angular.min.js"></script>
</head>
<body>
	<h1>Hello AJS! #3</h1>

	<div ng-app="myApp" ng-controller="tripCtrl">

		<p>
			Trip ID :: <span>{{trip.tripId}} </span>!
		</p>

		<p>
			Trip To :: <span>{{trip.travelTo }}</span>!
		</p>
	</div>
	<script>
		var app = angular.module('myApp', []);
		app.controller('tripCtrl', [ '$scope', '$http',
				function($scope, $http) {
					console.log("after Controller call..");

					$http.get('./hw2').then(function(response) {
						console.log("Inside Get call..");
						console.log(JSON.stringify(response));
						$scope.trip = response.data.records;
						JSON.stringify(response);
					});
				} ]);
	</script>
</body>
</html>

