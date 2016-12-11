if (window.console) {
  console.log("Welcome to your Play application's JavaScript!");
}



 var on = 0;

function toggle(divId) {
    if (on == 0) {
        document.getElementById(divId).style.display = 'block';
        on = 1;
    } else if (on == 1) {
        document.getElementById(divId).style.display = 'none';
        on = 0;
    }

}


function lmsController($scope, $http) {

  $scope.get_users = function() {
  		$http.get("/getAllUsers").success(function(response) {
  			$scope.dbUsers = response;
  			console.log($scope.dbUsers);

  		});
  	}

  	 $scope.get_posts = function() {
      		$http.get("/getAllPosts").success(function(response) {
      			$scope.dbPosts = response;
      			console.log($scope.dbPosts);

      		});
      	}

  $scope.delete_users = function(x) {
            		console.log(x.id);

            		$http({
            			method: "POST",
            			url: "/deleteUser",
            			headers: {
            				'Content-Type': 'application/x-www-form-urlencoded'
            			},
            			transformRequest: function(obj) {
            				var str = [];
            				for (var p in obj)
            				str.push(encodeURIComponent(p) + "=" + encodeURIComponent(obj[p]));
            				return str.join("&");
            			},
            			data: {
            				userId: x.id
            			}
            		}).success(function(response,data) {
            			console.log(response,data);
            			$("#userTable tr").remove();

            		});

            	}
/*
   $scope.edit_users = function(x) {
               		console.log(x.id);

               		$http({
               			method: "POST",
               			url: "/editUser",
               			headers: {
               				'Content-Type': 'application/x-www-form-urlencoded'
               			},
               			transformRequest: function(obj) {
               				var str = [];
               				for (var p in obj)
               				str.push(encodeURIComponent(p) + "=" + encodeURIComponent(obj[p]));
               				return str.join("&");
               			},
               			data: {
               			    firstName: x.firstName,
               			    lastName: x.lastName,
               			    email: x.email,
               			    username: x.username,
               				userId: x.id
               			}
               		}).success(function(response,data) {
               			console.log(response,data);
               			$("#userTable tr").remove();

               		});

               	}

*/
 $scope.delete_posts = function(x) {
            		console.log(x.id);

            		$http({
            			method: "POST",
            			url: "/deletePost",
            			headers: {
            				'Content-Type': 'application/x-www-form-urlencoded'
            			},
            			transformRequest: function(obj) {
            				var str = [];
            				for (var p in obj)
            				str.push(encodeURIComponent(p) + "=" + encodeURIComponent(obj[p]));
            				return str.join("&");
            			},
            			data: {
            				postId: x.id
            			}
            		}).success(function(response,data) {
            			console.log(response,data);
            			$("#postTable tr").remove();

            		});

            	}


}