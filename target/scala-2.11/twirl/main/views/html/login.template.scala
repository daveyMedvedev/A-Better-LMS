
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
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

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("A Better LMS")/*3.22*/ {_display_(Seq[Any](format.raw/*3.24*/("""

"""),format.raw/*5.1*/("""<Body>
    <div id="bg" class="bg"/>

        <div class="col-md-6 col-md-offset-3">
            <div class="container">
                <div class="row">

                    <img class="img" src="http://i.imgur.com/yZoZ2Dp.png" style="width: 50%; height: 50%">

                </div>
            </div>
            <hr>
        </div>



        <div class="container">
            <form autocomplete="off" role="form" class="form-signin" method="post" action=""""),_display_(/*22.93*/routes/*22.99*/.LoginController.login),format.raw/*22.121*/("""">
                <h1 class="form-signin-heading text-muted">LOGIN</h1>

                <input type="text" class="form-control" placeholder="Username" required="" name="username" autofocus>
                <input type="password" class="form-control" placeholder="Password" required="" name="password" autofocus>

                <div class="col-md-8 col-md-offset-2">

                    <button class="btn btn-lg btn-primary btn-block" type="submit">
                        <span class="glyphicon glyphicon-log-in"></span>
                    </button>

                </div>
            </form>
        </div>


    </div>
</Body>
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
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Tue Dec 06 22:09:36 EST 2016
                  SOURCE: /Users/davemedvedev/Desktop/testdemo/app/views/login.scala.html
                  HASH: bde534cbf014352ec2d4b5392ce6d325590852d7
                  MATRIX: 745->1|857->18|885->21|913->41|952->43|980->45|1472->510|1487->516|1531->538
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|53->22|53->22|53->22
                  -- GENERATED --
              */
          