var app = angular.module('myapp',['ngRoute']);

app.config(function($routeProvider){
	$routeProvider
	
	.when('/users',{
		templateUrl:'c_user/users.html'
	})

	
	.when('/login',{
		templateUrl:'c_user/login.html',
			controller:'UserController'
	})

	.when('/register',{
		templateUrl:'c_user/register.html'
	})	

})
