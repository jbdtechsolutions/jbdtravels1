var app=angular.module('myApp',[]);
	app.controller('NewTripJSController', function($scope, $http){
			console.log("Inside Controller Call..");
			//$scope.trip = {};
			$scope.addTrip = function(){
			console.log("Inside addTrip..");
			$scope.newTrip = [];
			$scope.newTrip = $scope.trip;
			console.log("trip : ", JSON.stringify($scope.newTrip));
			$http({
            url : '/jt/addtrip',
            method : "POST",
            data : $scope.newTrip
            
        }).then(function(response) {
			console.log("response... :",JSON.stringify(response));
			if(status=200){
				console.log("Trip added");
			}
		})}
		
		});