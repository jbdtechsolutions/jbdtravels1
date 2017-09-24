<html>
<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.3/angular.min.js"></script>
</head>

<body>

	<h1>Hello All Trip #3</h1>
	<div data-ng-app="getallTrip" data-ng-controller="AllTripJSController">
	<button name="GetAllTrips" onclick="getAll()" type="button"></button>
		<table>
			<tr data-ng-repeat="trip in alltrips ">
				<td>Trip ID :: <span>{{trip.tripId}}</span></td>
				<td>Location :: <span>{{trip.travelTo}}</span></td>
			</tr>
		</table>

	</div>

	<script type="text/javascript">
		var getallTrip = angular.module('getallTrip', []);
		getallTrip.controller('AllTripJSController', function($scope, $http) {
			console.log("Inside Controller Call..");
			//$scope.trip = {};
			$scope.getAll = function() {
				console.log("Inside getTrips..");
				$scope.alltrips = [];
				$scope.alltrips = response.trips;
				console.log("trip : ", JSON.stringify($scope.alltrips));
				$http({
					url : '/jt/helloworld2',
					method : "GET",
					data : $scope.alltrips

				}).then(function(response) {
					console.log("response... :", JSON.stringify(response));
					if (status = 200) {
						console.log("Trip Retrived");
					}
				});
			}

		});
	</script>
</body>
</html>