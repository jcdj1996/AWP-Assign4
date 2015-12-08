var app = angular.module('survey-site', []);

app.controller('MainCtrl', [
'$scope',
function($scope){
  $scope.posts = [
  'post 1',
  'post 2',
  'post 3',
  'post 4',
  'post 5'
];
}]);

//I think this should be changed to show survey options. 
//I have a couple of pictures that could go along with different types of 
//surveys.  Example: planning a get together (dates), controversial..etc...
