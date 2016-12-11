
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object user_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class user extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("A Better LMS")/*3.22*/ {_display_(Seq[Any](format.raw/*3.24*/("""
"""),format.raw/*4.1*/("""<body ng-app ng-controller="lmsController">
<div id="bg" class="bg"/> </div>

<script type="text/javascript">
        // define angular module/app
        var lmsApp = angular.module('lmsApp', []);
        'use strict';
 </script>



    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">

        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand">
                <img src="http://placehold.it/200x50&text=LOGO" alt="LOGO">
            </a>
        </div>

        <ul class="nav navbar-right top-nav">
            <li><a>Logged in as: """),_display_(/*30.35*/controllers/*30.46*/.LoginController.uname),format.raw/*30.68*/("""</a></li>
        </ul>

        <div class="collapse navbar-collapse navbar-ex1-collapse">
            <ul class="nav navbar-nav side-nav">
                <li>
                    <a href=""><span class="glyphicon glyphicon-home"></span></a>
                </li>
                <li>
                    <a onclick="toggle('adduser');"><span class="glyphicon glyphicon-plus"></span> New User</a>
                </li>
                <li>
                    <a onclick="toggle('post');"><span class="glyphicon glyphicon-plus"></span> New Post</a>
                </li>
                <li>
                    <a ng-click = "get_users()" onclick="toggle('showusers');"><span class="glyphicon glyphicon-search"></span> Show All Users</a>
                </li>
                <li>
                    <a ng-click = "get_posts()" onclick="toggle('showposts');"><span class="glyphicon glyphicon-search"></span> Show All Posts</a>
                </li>
                <li>
                    <a ng-click = "get_users()" onclick="toggle('updateusers');"><span class="glyphicon glyphicon-search"></span> Update A User</a>
                </li>
                <li>
                    <a ng-click = "get_posts()" onclick="toggle('updateposts');"><span class="glyphicon glyphicon-search"></span> Update A Post</a>
                </li>


            </ul>
        </div>

    </nav>

    <div class="container">
        <div class="row">
                <div style="display:none" class="col-md-10" Id="post">
                    <form autocomplete="off" role="form" class="form-signin" method="post" action=""""),_display_(/*66.101*/routes/*66.107*/.PostController.savePost),format.raw/*66.131*/("""">
                        <h1 class="form-signin-heading text-muted">Make a New Post</h1>

                        <input type="text" class="form-control" placeholder="Title" required="" name="title" autofocus>
                        <input type="text" class="form-control" placeholder="Content" required="" name="content" autofocus>
                        <input type="text" class="form-control" placeholder="Section" required="" name="sectionId" autofocus>

                        <button class="btn btn-lg btn-primary btn-block" type="submit">
                            <span class="glyphicon glyphicon-plus"></span>
                        </button>
                    </form>
                </div>

                <div style="display:none" class="col-md-10" id="adduser">
                    <form autocomplete="off" role="form" class="form-signin" method="post" action=""""),_display_(/*80.101*/routes/*80.107*/.UserController.saveUser),format.raw/*80.131*/("""">
                        <h1 class="form-signin-heading text-muted">New User</h1>

                        <input type="text" class="form-control" placeholder="First Name" required="" name="fname" autofocus>
                        <input type="text" class="form-control" placeholder="Last Name" required="" name="lname" autofocus>
                        <input type="text" class="form-control" placeholder="Username" required="" name="username" autofocus>
                        <input type="password" class="form-control" placeholder="Password" required="" name="password" autofocus>
                        <input type="text" class="form-control" placeholder="Email" required="" name="email" autofocus>

                        <button class="btn btn-lg btn-primary btn-block" type="submit">
                            <span class="glyphicon glyphicon-plus"></span>
                        </button>

                    </form>
                </div>

                <div style="display:none" class="col-md-10" id="showusers">

                    <form autocomplete="off" role="form" class="form-signin" method="post" action=""""),_display_(/*98.101*/routes/*98.107*/.UserController.deleteUser),format.raw/*98.133*/("""">
                        <h1 class="form-signin-heading text-muted">Show All Users</h1>

                        <table class="table table-bordered" id="userTable">
                            <thead>
                            <tr class="clickable-row">
                                <th>First Name</th>
                                <th>Last Name</th>
                                <th>Username</th>
                                <th>Email</th>
                                <th>userID</th>
                                <th>Delete user</th>

                            </tr>
                            </thead>
                            <tbody>
                            <tr id="users" ng-repeat="x in dbUsers track by $index" class="clickable-row">

                                <td>"""),format.raw/*116.37*/("""{"""),format.raw/*116.38*/("""{"""),format.raw/*116.39*/(""" """),format.raw/*116.40*/("""x.firstName """),format.raw/*116.52*/("""}"""),format.raw/*116.53*/("""}"""),format.raw/*116.54*/("""</td>
                                <td>"""),format.raw/*117.37*/("""{"""),format.raw/*117.38*/("""{"""),format.raw/*117.39*/(""" """),format.raw/*117.40*/("""x.lastName """),format.raw/*117.51*/("""}"""),format.raw/*117.52*/("""}"""),format.raw/*117.53*/("""</td>
                                <td>"""),format.raw/*118.37*/("""{"""),format.raw/*118.38*/("""{"""),format.raw/*118.39*/(""" """),format.raw/*118.40*/("""x.username """),format.raw/*118.51*/("""}"""),format.raw/*118.52*/("""}"""),format.raw/*118.53*/("""</td>
                                <td>"""),format.raw/*119.37*/("""{"""),format.raw/*119.38*/("""{"""),format.raw/*119.39*/(""" """),format.raw/*119.40*/("""x.email """),format.raw/*119.48*/("""}"""),format.raw/*119.49*/("""}"""),format.raw/*119.50*/("""</td>
                                <td>"""),format.raw/*120.37*/("""{"""),format.raw/*120.38*/("""{"""),format.raw/*120.39*/(""" """),format.raw/*120.40*/("""x.id """),format.raw/*120.45*/("""}"""),format.raw/*120.46*/("""}"""),format.raw/*120.47*/("""</td>

                                <td class="text-xs-center">
                                    <button class="btn btn-danger-outline" ng-click="delete_users(x)">Delete User</button>
                                </td>

                            </tr>
                            </tbody>
                        </table>

                    </form>
                </div>

            <div style="display:none" class="col-md-10" id="updateusers">
                <form autocomplete="off" role="form" class="form-signin" method="post" ng-repeat="x in dbUsers track by $index" action=""""),_display_(/*134.138*/routes/*134.144*/.UserController.saveUser),format.raw/*134.168*/("""">
                    <h1 class="form-signin-heading text-muted">New User</h1>

                    <input type="text" class="form-control" placeholder="First Name" required="" ng-model="x.firstName" name="fname" autofocus>
                    <input type="text" class="form-control" placeholder="Last Name" required="" ng-model="x.lastName" name="lname" autofocus>
                    <input type="text" class="form-control" placeholder="Username" required="" ng-model="x.username" name="username" autofocus>
                    <input type="password" class="form-control" placeholder="Password" required="" ng-model="x.password" name="password" autofocus>
                    <input type="text" class="form-control" placeholder="Email" required="" ng-model="x.email" name="email" autofocus>

                    <button class="btn btn-lg btn-primary btn-block" type="submit">
                        <span class="glyphicon glyphicon-plus"></span>
                    </button>

                </form>
            </div>

            <div class="container">
                <div class="row">
                    <div style="display:none" class="col-md-10" Id="updateposts">
                        <form autocomplete="off" role="form" class="form-signin" ng-repeat="x in dbPosts track by $index" method="post" action=""""),_display_(/*153.146*/routes/*153.152*/.PostController.savePost),format.raw/*153.176*/("""">
                            <h1 class="form-signin-heading text-muted">Update a Post</h1>

                            <input type="text" class="form-control" placeholder="Title" ng-model="x.title" required="" name="title" autofocus>
                            <input type="text" class="form-control" placeholder="Content" ng-model="x.content" required="" name="content" autofocus>
                            <input type="text" class="form-control" placeholder="Section" ng-model="x.section" equired="" name="sectionId" autofocus>

                            <button class="btn btn-lg btn-primary btn-block" type="submit">
                                <span class="glyphicon glyphicon-plus"></span>
                            </button>
                        </form>
                    </div>

            <div style="display:none" class="col-md-10" id="showposts">

                <form autocomplete="off" role="form" class="form-signin" method="post" action=""""),_display_(/*168.97*/routes/*168.103*/.PostController.deletePost),format.raw/*168.129*/("""">
                    <h1 class="form-signin-heading text-muted">Show All Posts</h1>

                    <table class="table table-bordered" id="postTable">
                        <thead>
                        <tr class="clickable-row">
                            <th>Post Title</th>
                            <th>Post Content</th>
                            <th>Posted By</th>
                            <th>Delete Post</th>


                        </tr>
                        </thead>
                        <tbody>
                        <tr id="posts" ng-repeat="x in dbPosts track by $index" class="clickable-row">

                            <td>"""),format.raw/*185.33*/("""{"""),format.raw/*185.34*/("""{"""),format.raw/*185.35*/(""" """),format.raw/*185.36*/("""x.title """),format.raw/*185.44*/("""}"""),format.raw/*185.45*/("""}"""),format.raw/*185.46*/("""</td>
                            <td>"""),format.raw/*186.33*/("""{"""),format.raw/*186.34*/("""{"""),format.raw/*186.35*/(""" """),format.raw/*186.36*/("""x.content """),format.raw/*186.46*/("""}"""),format.raw/*186.47*/("""}"""),format.raw/*186.48*/("""</td>
                            <td>"""),format.raw/*187.33*/("""{"""),format.raw/*187.34*/("""{"""),format.raw/*187.35*/(""" """),format.raw/*187.36*/("""x.id """),format.raw/*187.41*/("""}"""),format.raw/*187.42*/("""}"""),format.raw/*187.43*/("""</td>

                            <td class="text-xs-center">
                                <button class="btn btn-danger-outline" ng-click="delete_posts(x)">Delete Post</button>
                            </td>



                            </td>
                        </tr>
                        </tbody>
                    </table>

                </form>
            </div>


        </div>
        </div>
    </div>


</body>
""")))}))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/**/
object user extends user_Scope0.user
              /*
                  -- GENERATED --
                  DATE: Sat Dec 10 22:13:14 EST 2016
                  SOURCE: /Users/davemedvedev/Desktop/testdemo/app/views/user.scala.html
                  HASH: 3ddb7a3d08209711abdcf6979c25efdcaf675acc
                  MATRIX: 743->1|855->18|883->21|911->41|950->43|977->44|1917->957|1937->968|1980->990|3616->2598|3632->2604|3678->2628|4592->3514|4608->3520|4654->3544|5820->4682|5836->4688|5884->4714|6724->5525|6754->5526|6784->5527|6814->5528|6855->5540|6885->5541|6915->5542|6986->5584|7016->5585|7046->5586|7076->5587|7116->5598|7146->5599|7176->5600|7247->5642|7277->5643|7307->5644|7337->5645|7377->5656|7407->5657|7437->5658|7508->5700|7538->5701|7568->5702|7598->5703|7635->5711|7665->5712|7695->5713|7766->5755|7796->5756|7826->5757|7856->5758|7890->5763|7920->5764|7950->5765|8576->6362|8593->6368|8640->6392|9991->7714|10008->7720|10055->7744|11058->8719|11075->8725|11124->8751|11822->9420|11852->9421|11882->9422|11912->9423|11949->9431|11979->9432|12009->9433|12076->9471|12106->9472|12136->9473|12166->9474|12205->9484|12235->9485|12265->9486|12332->9524|12362->9525|12392->9526|12422->9527|12456->9532|12486->9533|12516->9534
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|61->30|61->30|61->30|97->66|97->66|97->66|111->80|111->80|111->80|129->98|129->98|129->98|147->116|147->116|147->116|147->116|147->116|147->116|147->116|148->117|148->117|148->117|148->117|148->117|148->117|148->117|149->118|149->118|149->118|149->118|149->118|149->118|149->118|150->119|150->119|150->119|150->119|150->119|150->119|150->119|151->120|151->120|151->120|151->120|151->120|151->120|151->120|165->134|165->134|165->134|184->153|184->153|184->153|199->168|199->168|199->168|216->185|216->185|216->185|216->185|216->185|216->185|216->185|217->186|217->186|217->186|217->186|217->186|217->186|217->186|218->187|218->187|218->187|218->187|218->187|218->187|218->187
                  -- GENERATED --
              */
          