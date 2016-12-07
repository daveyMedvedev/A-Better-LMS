
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/davemedvedev/Desktop/testdemo/conf/routes
// @DATE:Wed Dec 07 07:06:12 EST 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:12
  class ReversePostController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def savePost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PostController.savePost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "savePost"})
        }
      """
    )
  
    // @LINE:21
    def deletePost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PostController.deletePost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "deletePost"})
        }
      """
    )
  
    // @LINE:12
    def getAllPosts: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PostController.getAllPosts",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getAllPosts"})
        }
      """
    )
  
  }

  // @LINE:14
  class ReverseLoginController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def mainpage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.mainpage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin"})
        }
      """
    )
  
    // @LINE:14
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:18
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.login",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:26
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def getUserByUsername: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.getUserByUsername",
      """
        function(username0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getUserByUsername/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("username", encodeURIComponent(username0))})
        }
      """
    )
  
    // @LINE:22
    def deleteUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.deleteUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteUser"})
        }
      """
    )
  
    // @LINE:7
    def getAllUsers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.getAllUsers",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getAllUsers"})
        }
      """
    )
  
    // @LINE:19
    def saveUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.saveUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "saveUser"})
        }
      """
    )
  
  }


}
