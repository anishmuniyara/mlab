var app = angular.module("app", []); 
app.controller("myCtrl", function($scope) {
   $scope.showContracts = true;
   $scope.createContract = false;
   $scope.showBid = false;
   $scope.showOfferVal = false;
   $scope.showPrefLang = false;
   $scope.showExperianceIn = false;
   $scope.showRow = false;
   
   $scope.saveContractClick = function() {
	   $scope.showContracts = true;
	   $scope.createContract = false;
	   $scope.showBid = false;
	   $scope.showOfferVal = false;
	   $scope.showPrefLang = false;
	   $scope.showExperianceIn = false;
	   $scope.showRow = true;
   }
   
   $scope.createContractClick = function() {
	   $scope.showContracts = false;
	   $scope.createContract = true;
	   $scope.showBid = false;
	   $scope.showOfferVal = false;
	   $scope.showPrefLang = false;
	   $scope.showExperianceIn = false;
   }
   $scope.bidClick = function() {
	   $scope.createContract = true;
	   $scope.showBid = true;
   }
   $scope.offerValClick = function() {
	   $scope.createContract = true;
	   $scope.showOfferVal = true;
   }
	$scope.preferedLanguageClick = function() {
		$scope.createContract = true;
		$scope.showPrefLang = true;
	}
	$scope.experianceInClick = function() {
		$scope.createContract = true;
		 $scope.showExperianceIn = true;
	}
	$scope.overtimeClick = function() {
		   
	}
	$scope.jobLevelClick = function() {
		   
	}
	$scope.transportationClick = function() {
		   
	}
	$scope.availabilityClick = function() {
		   
	}
   
});