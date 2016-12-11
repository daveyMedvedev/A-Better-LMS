
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/davemedvedev/Desktop/testdemo/conf/routes
// @DATE:Sat Dec 10 21:18:33 EST 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  UserController_0: controllers.UserController,
  // @LINE:12
  PostController_3: controllers.PostController,
  // @LINE:14
  LoginController_2: controllers.LoginController,
  // @LINE:26
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    UserController_0: controllers.UserController,
    // @LINE:12
    PostController_3: controllers.PostController,
    // @LINE:14
    LoginController_2: controllers.LoginController,
    // @LINE:26
    Assets_1: controllers.Assets
  ) = this(errorHandler, UserController_0, PostController_3, LoginController_2, Assets_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, UserController_0, PostController_3, LoginController_2, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getAllUsers""", """controllers.UserController.getAllUsers()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getUserByUsername/""" + "$" + """username<[^/]+>""", """controllers.UserController.getUserByUsername(username:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getAllPosts""", """controllers.PostController.getAllPosts()"""),
    ("""GET""", this.prefix, """controllers.LoginController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin""", """controllers.LoginController.mainpage()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.login()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """saveUser""", """controllers.UserController.saveUser()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deletePost""", """controllers.PostController.deletePost()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteUser""", """controllers.UserController.deleteUser()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """savePost""", """controllers.PostController.savePost()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_UserController_getAllUsers0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getAllUsers")))
  )
  private[this] lazy val controllers_UserController_getAllUsers0_invoker = createInvoker(
    UserController_0.getAllUsers(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "getAllUsers",
      Nil,
      "GET",
      """""",
      this.prefix + """getAllUsers"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_UserController_getUserByUsername1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getUserByUsername/"), DynamicPart("username", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_getUserByUsername1_invoker = createInvoker(
    UserController_0.getUserByUsername(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "getUserByUsername",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """getUserByUsername/""" + "$" + """username<[^/]+>"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_PostController_getAllPosts2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getAllPosts")))
  )
  private[this] lazy val controllers_PostController_getAllPosts2_invoker = createInvoker(
    PostController_3.getAllPosts(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PostController",
      "getAllPosts",
      Nil,
      "GET",
      """""",
      this.prefix + """getAllPosts"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_LoginController_index3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_LoginController_index3_invoker = createInvoker(
    LoginController_2.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_LoginController_mainpage4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin")))
  )
  private[this] lazy val controllers_LoginController_mainpage4_invoker = createInvoker(
    LoginController_2.mainpage(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "mainpage",
      Nil,
      "GET",
      """""",
      this.prefix + """admin"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_LoginController_login5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_login5_invoker = createInvoker(
    LoginController_2.login(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Nil,
      "POST",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_UserController_saveUser6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("saveUser")))
  )
  private[this] lazy val controllers_UserController_saveUser6_invoker = createInvoker(
    UserController_0.saveUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "saveUser",
      Nil,
      "POST",
      """""",
      this.prefix + """saveUser"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_PostController_deletePost7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deletePost")))
  )
  private[this] lazy val controllers_PostController_deletePost7_invoker = createInvoker(
    PostController_3.deletePost(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PostController",
      "deletePost",
      Nil,
      "POST",
      """""",
      this.prefix + """deletePost"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_UserController_deleteUser8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteUser")))
  )
  private[this] lazy val controllers_UserController_deleteUser8_invoker = createInvoker(
    UserController_0.deleteUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "deleteUser",
      Nil,
      "POST",
      """""",
      this.prefix + """deleteUser"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_PostController_savePost9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("savePost")))
  )
  private[this] lazy val controllers_PostController_savePost9_invoker = createInvoker(
    PostController_3.savePost(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PostController",
      "savePost",
      Nil,
      "POST",
      """""",
      this.prefix + """savePost"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_Assets_versioned10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned10_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_UserController_getAllUsers0_route(params) =>
      call { 
        controllers_UserController_getAllUsers0_invoker.call(UserController_0.getAllUsers())
      }
  
    // @LINE:8
    case controllers_UserController_getUserByUsername1_route(params) =>
      call(params.fromPath[String]("username", None)) { (username) =>
        controllers_UserController_getUserByUsername1_invoker.call(UserController_0.getUserByUsername(username))
      }
  
    // @LINE:12
    case controllers_PostController_getAllPosts2_route(params) =>
      call { 
        controllers_PostController_getAllPosts2_invoker.call(PostController_3.getAllPosts())
      }
  
    // @LINE:14
    case controllers_LoginController_index3_route(params) =>
      call { 
        controllers_LoginController_index3_invoker.call(LoginController_2.index())
      }
  
    // @LINE:15
    case controllers_LoginController_mainpage4_route(params) =>
      call { 
        controllers_LoginController_mainpage4_invoker.call(LoginController_2.mainpage())
      }
  
    // @LINE:18
    case controllers_LoginController_login5_route(params) =>
      call { 
        controllers_LoginController_login5_invoker.call(LoginController_2.login())
      }
  
    // @LINE:19
    case controllers_UserController_saveUser6_route(params) =>
      call { 
        controllers_UserController_saveUser6_invoker.call(UserController_0.saveUser())
      }
  
    // @LINE:21
    case controllers_PostController_deletePost7_route(params) =>
      call { 
        controllers_PostController_deletePost7_invoker.call(PostController_3.deletePost())
      }
  
    // @LINE:22
    case controllers_UserController_deleteUser8_route(params) =>
      call { 
        controllers_UserController_deleteUser8_invoker.call(UserController_0.deleteUser())
      }
  
    // @LINE:23
    case controllers_PostController_savePost9_route(params) =>
      call { 
        controllers_PostController_savePost9_invoker.call(PostController_3.savePost())
      }
  
    // @LINE:26
    case controllers_Assets_versioned10_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned10_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
