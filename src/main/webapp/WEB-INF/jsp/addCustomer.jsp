<html>
<head>
<title>New Customer Entry - Index</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.3/angular.min.js">
	
</script>
</head>
<body ng-app="newCustomer">
	<div ng-controller="NewCustomerJSController">

		<form ng-submit="addCustomer()">
			<input type="text" name="CustomerId" ng-model="Customer.custId"> 
			<input type="text" name="CustomerName" ng-model="Customer.custName"> 
			<button type="submit">Submit Me!</button>
			<!-- <input type="submit"> -->
		</form>
	</div>

	<script type="text/javascript">
		var app = angular.module('newCustomer', []);
		app.controller('NewCustomerJSController', function($scope, $http) {
			console.log("Inside Controller Call..");
			//$scope.Customer = {};
			$scope.addCustomer = function() {
				console.log("Inside addCustomer..");
				$scope.newCustomer = [];
				$scope.newCustomer = $scope.Customer;
				console.log("Customer : ", JSON.stringify($scope.newCustomer));
				$http({
					url : '/jt/addCustomer',
					method : "POST",
					data : $scope.newCustomer

				}).then(function(response) {
					console.log("response... :", JSON.stringify(response));
					if (status = 200) {
						console.log("Customer added");
					}
				})
			}

		});
	</script>
</body>
</html>