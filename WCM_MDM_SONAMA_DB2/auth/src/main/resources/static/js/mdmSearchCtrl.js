app.controller('mdmSearchCtrl', ['$scope', '$rootScope','$uibModal', '$http',  '$location',function($scope, $rootScope,$uibModal, $http,$location) {
	$rootScope.showNavbar = true;
	//$scope.master = [];
	$scope.sucessMsg="";
	$scope.errorMsg="";
	$rootScope.matchScore = "";
	$scope.personData = [];
	 //$scope.mdmDetail = [];
	//$scope.showPhoneNo = "";
	//$scope.existHomePhoneNo = "";
	//$scope.existMobilePhoneNo = "";
	$scope.searchMDM = function(firstName,middleName,lastName,gender,ssn,address,city,state,zipCode,dateofBirth,phone){
		var data = {
			    "firstName": firstName,
			    "middleName": middleName,
			    "lastName": lastName,
			    "ssn": ssn,
			    "address": address,
			    "city": city,
			    "state": state,
			    "zipCode": zipCode,
			    "dateofBirth": dateofBirth,
			    "phone": phone,
			    "gender": gender
			};

    	data=JSON.stringify(data);

        var config = {
            headers : {
                'Content-Type': 'application/json'
            }
        }

    	console.log("search data is json object ---- "+data);
    	
    	$http.post("/PersonSearch/searchForIdList", data, config)
		   .then(
		       function(response){
		    	   if(response.data.message){
		    		   $scope.errorMsg = response.data.message;
		    		   $scope.sucessMsg="";
		    		   $scope.personData = [];
			         }else{
			        	 $scope.sucessMsg="";
			        	 $scope.errorMsg="";
			        	 $scope.personData = response.data;
			        	 /* for(var i = 0; i< $rootScope.personData.length; i++ ){
			        		 if ($rootScope.personData[i].idEntity.client.homePhoneList != null && $rootScope.personData[i].idEntity.client.homePhoneList != undefined){
			        			 $scope.existHomePhoneNo = $rootScope.personData[i].idEntity.client.homePhoneList.homePhone[0].phNumber;
			        			 console.log("homephone"+$scope.existHomePhoneNo);
			        		 }
			        		 if ($rootScope.personData[i].idEntity.client.mobilePhoneList != null && $rootScope.personData[i].idEntity.client.mobilePhoneList != undefined){
			        			 $scope.existmobilePhoneNo = $rootScope.personData[i].idEntity.client.mobilePhoneList.mobilePhone[0].phNumber;
			        			 console.log("mobilephone"+$scope.existmobilePhoneNo);
			        		 }
			        	 }
				        	 if($scope.existmobilePhoneNo != null && $scope.existHomePhoneNo === null){
				        		 $scope.showPhoneNo = $scope.existmobilePhoneNo;
				        		 console.log("showmobile "+ $scope.showPhoneNo);
				        	 }else if($scope.existHomePhoneNo != null && $scope.existmobilePhoneNo === null){
				        		 $scope.showPhoneNo = $scope.existHomePhoneNo;
				        		 console.log("showhome "+ $scope.showPhoneNo);
				        	 }else if($scope.existHomePhoneNo === null && $scope.existmobilePhoneNo === null){
				        		 $scope.showPhoneNo = $scope.existmobilePhoneNo;
				        		 console.log("showboth "+ $scope.showPhoneNo);
				        	 }*/
			        	 //$location.path('/entityResults');
			        	 }
			        
		       }, 
		       function(response){
		    	   $scope.errorMsg="Unable to search with given inputs :: Error";
		         
		       }
		    );
	 
	} //end of search
	
	$scope.searchByClient = function(clientId,srcCode){
		var data = {
			    "memIdnum": clientId,
			    "srcCode": srcCode
			};

    	data=JSON.stringify(data);

        var config = {
            headers : {
                'Content-Type': 'application/json'
            }
        }

    	console.log("search data is json object ---- "+data);
    	
    	$http.post("/PersonSearch/getIdEntityList", data, config)
		   .then(
		       function(response){
		    	   if(response.data.message){
		    		   $scope.errorMsg = response.data.message;
		    		   $scope.sucessMsg="";
		    		   $scope.personData = [];
			         }else{
			        	 $scope.sucessMsg="";
			        	 $scope.errorMsg="";
			        	 $scope.personData = response.data;
			        	 //console.log($scope.personData.score);
			        	 }
			        
		       }, 
		       function(response){
		    	   $scope.errorMsg="Unable to search with given inputs :: Error";
		         
		       }
		    );
	 
	} //end of search by Client
	$scope.reset = function() {
		$scope.sucessMsg="";
		$scope.errorMsg="";
		$scope.personData = [];
        $scope.mdmDetail = angular.copy($scope.master);
    };

  
    $scope.selectPersonCard = function(enterpriseId,score){
    	$rootScope.matchScore = score;
    	console.log($rootScope.matchScore)
		var data = {
			    "enterpriseId": enterpriseId
			};

    	data=JSON.stringify(data);

        var config = {
            headers : {
                'Content-Type': 'application/json'
            }
        }

    	console.log("search data is json object ---- "+data);
    	
    	$http.post("/PersonSearch/getIdEntityListByIdEntityIds", data, config)
		   .then(
		       function(response){
		    	   if(response.data.message){
			        	 if(response.data.message=='NO_RECORDS_FOUND'){
			        		 	$scope.sucessMsg="No entity record found for the given enterpriseId.";										          		
			        	 }
			        	 
			         }else{
			        	 $scope.sucessMsg="";
			        	 $rootScope.personDetailsData = response.data;
			        	 //console.log("person data"+$rootScope.matchScore);
			        	 
			        	/* for(var i = 0; i< $rootScope.personDetailsData.length; i++ ){
			        		 if ($rootScope.personDetailsData[i].client.homePhoneList != null && $rootScope.personDetailsData[i].client.homePhoneList != undefined){
			        			 $scope.existHomePhoneNo = $rootScope.personDetailsData[i].client.homePhoneList.homePhone[0].phNumber;
			        			 console.log("homephone"+$scope.existHomePhoneNo);
			        		 }
			        		 if ($rootScope.personDetailsData[i].client.mobilePhoneList != null && $rootScope.personDetailsData[i].client.mobilePhoneList != undefined){
			        			 $scope.existmobilePhoneNo = $rootScope.personDetailsData[i].client.mobilePhoneList.mobilePhone[0].phNumber;
			        			 console.log("mobilephone"+$scope.existmobilePhoneNo);
			        		 }
			        	 }*/
			        	 $location.path('/entityDetails');
			         }
		         
		       }, 
		       function(response){
		    	   $scope.errorMsg="Unable to search with given group name:: Error";
		         
		       }
		    );
	 
	}

}]);