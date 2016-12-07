
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
<head>
    <title>"""),_display_(/*5.13*/title),format.raw/*5.18*/("""</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
    <script src="//ajax.googleapis.com/ajax/libs/angularjs/1.2.23/angular.min.js"></script>
    <script src="//https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src=""""),_display_(/*9.19*/routes/*9.25*/.Assets.versioned("javascripts/hello.js")),format.raw/*9.66*/("""" type="text/javascript"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>
    <link rel="stylesheet" href=""""),_display_(/*11.35*/routes/*11.41*/.Assets.versioned("stylesheets/main.css")),format.raw/*11.82*/("""">



</head>
<body>
<div style="padding:20px">
    """),_display_(/*18.6*/content),format.raw/*18.13*/("""
"""),format.raw/*19.1*/("""</div>
</body>
</html>

<!--
<div id="bg" class="bg"/> </div>
<nav role="navigation" class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">

        <div class="navbar-header">
            <button type="button" data-target="#navbarCollapse" data-toggle="collapse" class="navbar-toggle">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a href="#" class="navbar-brand">Better LMS</a>
        </div>
        <!-- Collection of nav links and other content for toggling
        <div id="navbarCollapse" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">Home</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a>Logged in As: """),_display_(/*43.39*/controllers/*43.50*/.LoginController.uname),format.raw/*43.72*/("""</a></li>
            </ul>
        </div>
    </div>
</nav>
-->"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Wed Dec 07 02:22:13 EST 2016
                  SOURCE: /Users/davemedvedev/Desktop/testdemo/app/views/main.scala.html
                  HASH: 1c16dfec0c70b839ee9294a3a5820e310bffc143
                  MATRIX: 748->1|873->31|900->32|968->74|993->79|1329->389|1343->395|1404->436|1606->611|1621->617|1683->658|1762->711|1790->718|1818->719|2799->1673|2819->1684|2862->1706
                  LINES: 27->1|32->1|33->2|36->5|36->5|40->9|40->9|40->9|42->11|42->11|42->11|49->18|49->18|50->19|74->43|74->43|74->43
                  -- GENERATED --
              */
          