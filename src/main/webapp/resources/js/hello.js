var App = angular.module('myapp', []);

App.controller('HelloController', ['$scope','$http', function($scope, $http){
	$scope.person = {id:null, personName:'',address:''};
	$scope.persons = [];
	$scope.getPersonList = function(){
		$http.get("/SpringvsGradle/getJsonPersonList").success(function(data){
			$scope.persons = data;
		});
	};
	
	$scope.getPersonList();
}]);
