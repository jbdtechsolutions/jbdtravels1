<html>
<head>
<title>New Trip Entry - Index</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.3/angular.min.js">
	
</script>
</head>
<body ng-app="newTrip">
	<div ng-controller="NewTripJSController">

		<form ng-submit="addTrip()">
			<input type="text" name="tripId" ng-model="trip.tripId"> 
			<input type="text" name="tripId" ng-model="trip.travelTo"> 
			<button type="submit">Submit Me!</button>
			<!-- <input type="submit"> -->
		</form>
	</div>

	<script type="text/javascript">
		var app = angular.module('newTrip', []);
		app.controller('NewTripJSController', function($scope, $http) {
			console.log("Inside Controller Call..");
			//$scope.trip = {};
			$scope.addTrip = function() {
				console.log("Inside addTrip..");
				$scope.newTrip = [];
				$scope.newTrip = $scope.trip;
				console.log("trip : ", JSON.stringify($scope.newTrip));
				$http({
					url : '/jt/addtrip',
					method : "POST",
					data : $scope.newTrip

				}).then(function(response) {
					console.log("response... :", JSON.stringify(response));
					if (status = 200) {
						console.log("Trip added");
					}
				})
			}

		});
	</script>
</body>
</html>