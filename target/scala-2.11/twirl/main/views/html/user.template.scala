
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

            </ul>
        </div>

    </nav>

    <div class="container">
        <div class="row">
                <div style="display:none" class="col-md-10" Id="post">
                    <form autocomplete="off" role="form" class="form-signin" method="post" action=""""),_display_(/*59.101*/routes/*59.107*/.PostController.savePost),format.raw/*59.131*/("""">
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
                    <form autocomplete="off" role="form" class="form-signin" method="post" action=""""),_display_(/*73.101*/routes/*73.107*/.UserController.saveUser),format.raw/*73.131*/("""">
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

                    <form autocomplete="off" role="form" class="form-signin" method="post" action=""""),_display_(/*91.101*/routes/*91.107*/.UserController.deleteUser),format.raw/*91.133*/("""">
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

                                <td>"""),format.raw/*109.37*/("""{"""),format.raw/*109.38*/("""{"""),format.raw/*109.39*/(""" """),format.raw/*109.40*/("""x.firstName """),format.raw/*109.52*/("""}"""),format.raw/*109.53*/("""}"""),format.raw/*109.54*/("""</td>
                                <td>"""),format.raw/*110.37*/("""{"""),format.raw/*110.38*/("""{"""),format.raw/*110.39*/(""" """),format.raw/*110.40*/("""x.lastName """),format.raw/*110.51*/("""}"""),format.raw/*110.52*/("""}"""),format.raw/*110.53*/("""</td>
                                <td>"""),format.raw/*111.37*/("""{"""),format.raw/*111.38*/("""{"""),format.raw/*111.39*/(""" """),format.raw/*111.40*/("""x.username """),format.raw/*111.51*/("""}"""),format.raw/*111.52*/("""}"""),format.raw/*111.53*/("""</td>
                                <td>"""),format.raw/*112.37*/("""{"""),format.raw/*112.38*/("""{"""),format.raw/*112.39*/(""" """),format.raw/*112.40*/("""x.email """),format.raw/*112.48*/("""}"""),format.raw/*112.49*/("""}"""),format.raw/*112.50*/("""</td>
                                <td>"""),format.raw/*113.37*/("""{"""),format.raw/*113.38*/("""{"""),format.raw/*113.39*/(""" """),format.raw/*113.40*/("""x.id """),format.raw/*113.45*/("""}"""),format.raw/*113.46*/("""}"""),format.raw/*113.47*/("""</td>

                                <td class="text-xs-center">
                                    <button class="btn btn-danger-outline" ng-click="delete_users(x)">Delete User</button>
                                </td>

                                </td>
                            </tr>
                            </tbody>
                        </table>

                    </form>
                </div>

            <div style="display:none" class="col-md-10" id="showposts">

                <form autocomplete="off" role="form" class="form-signin" method="post" action=""""),_display_(/*129.97*/routes/*129.103*/.PostController.deletePost),format.raw/*129.129*/("""">
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

                            <td>"""),format.raw/*146.33*/("""{"""),format.raw/*146.34*/("""{"""),format.raw/*146.35*/(""" """),format.raw/*146.36*/("""x.title """),format.raw/*146.44*/("""}"""),format.raw/*146.45*/("""}"""),format.raw/*146.46*/("""</td>
                            <td>"""),format.raw/*147.33*/("""{"""),format.raw/*147.34*/("""{"""),format.raw/*147.35*/(""" """),format.raw/*147.36*/("""x.content """),format.raw/*147.46*/("""}"""),format.raw/*147.47*/("""}"""),format.raw/*147.48*/("""</td>
                            <td>"""),format.raw/*148.33*/("""{"""),format.raw/*148.34*/("""{"""),format.raw/*148.35*/(""" """),format.raw/*148.36*/("""x.id """),format.raw/*148.41*/("""}"""),format.raw/*148.42*/("""}"""),format.raw/*148.43*/("""</td>

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
                  DATE: Wed Dec 07 07:33:37 EST 2016
                  SOURCE: /Users/davemedvedev/Desktop/testdemo/app/views/user.scala.html
                  HASH: d4c64bf389cafeba190af63cb08c7f65c0417050
                  MATRIX: 743->1|855->18|883->21|911->41|950->43|977->44|1917->957|1937->968|1980->990|3233->2215|3249->2221|3295->2245|4209->3131|4225->3137|4271->3161|5437->4299|5453->4305|5501->4331|6341->5142|6371->5143|6401->5144|6431->5145|6472->5157|6502->5158|6532->5159|6603->5201|6633->5202|6663->5203|6693->5204|6733->5215|6763->5216|6793->5217|6864->5259|6894->5260|6924->5261|6954->5262|6994->5273|7024->5274|7054->5275|7125->5317|7155->5318|7185->5319|7215->5320|7252->5328|7282->5329|7312->5330|7383->5372|7413->5373|7443->5374|7473->5375|7507->5380|7537->5381|7567->5382|8188->5975|8205->5981|8254->6007|8952->6676|8982->6677|9012->6678|9042->6679|9079->6687|9109->6688|9139->6689|9206->6727|9236->6728|9266->6729|9296->6730|9335->6740|9365->6741|9395->6742|9462->6780|9492->6781|9522->6782|9552->6783|9586->6788|9616->6789|9646->6790
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|61->30|61->30|61->30|90->59|90->59|90->59|104->73|104->73|104->73|122->91|122->91|122->91|140->109|140->109|140->109|140->109|140->109|140->109|140->109|141->110|141->110|141->110|141->110|141->110|141->110|141->110|142->111|142->111|142->111|142->111|142->111|142->111|142->111|143->112|143->112|143->112|143->112|143->112|143->112|143->112|144->113|144->113|144->113|144->113|144->113|144->113|144->113|160->129|160->129|160->129|177->146|177->146|177->146|177->146|177->146|177->146|177->146|178->147|178->147|178->147|178->147|178->147|178->147|178->147|179->148|179->148|179->148|179->148|179->148|179->148|179->148
                  -- GENERATED --
              */
          