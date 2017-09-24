function Hello($scope, $http) {
	$http.get('http://localhost:8080/jt/test/helloworld1/KTP001').success(
			function(data) {
				$scope.greeting = data;
			});
}