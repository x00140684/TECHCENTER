
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, user: models.users.User )(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.58*/("""


"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html lang="en">
   <head>
     
     <title>Project</title>
     <meta charset="utf-8">
     <meta name="viewport" content="width=device-width, initial-scale=1">
     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
     <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
     <link href=""""),_display_(/*13.19*/routes/*13.25*/.Assets.versioned("stylesheets/main.css")),format.raw/*13.66*/("""" rel="stylesheet" />
       <link rel="stylesheet" href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css">
     <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
     <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

   </head>
   <body>
   
   <!-- Navbar -->
   <nav class="navbar navbar-default">
     <div class="container">
       <div class="navbar-header">
         <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
           <span class="icon-bar"></span>
           <span class="icon-bar"></span>
           <span class="icon-bar"></span>                        
         </button>
         <a class="navbar-brand" href=""""),_display_(/*30.41*/routes/*30.47*/.ProductCtrl.index()),format.raw/*30.67*/("""">TechCenter</a>
       </div>
       <div class="collapse navbar-collapse" id="myNavbar">
         <ul class="nav navbar-nav navbar-right">
           <li><a href=""""),_display_(/*34.26*/routes/*34.32*/.ProductCtrl.listProducts()),format.raw/*34.59*/("""">STORE</a></li>
           <li><a href="#">REGISTER</a></li>
           <li """),_display_(/*36.17*/if(title=="Login")/*36.35*/{_display_(Seq[Any](format.raw/*36.36*/("""class="active"""")))}),format.raw/*36.51*/(""">
            """),_display_(/*37.14*/if(user != null)/*37.30*/ {_display_(Seq[Any](format.raw/*37.32*/("""
                """),format.raw/*38.17*/("""<a href=""""),_display_(/*38.27*/controllers/*38.38*/.security.routes.LoginCtrl.logout()),format.raw/*38.73*/("""">LOGOUT</a>
            """)))}/*39.15*/else/*39.20*/{_display_(Seq[Any](format.raw/*39.21*/("""
                """),format.raw/*40.17*/("""<a href=""""),_display_(/*40.27*/controllers/*40.38*/.security.routes.LoginCtrl.login()),format.raw/*40.72*/("""">LOGIN</a>
            """)))}),format.raw/*41.14*/("""

        """),format.raw/*43.9*/("""</li>
         </ul>
       </div>
     </div>
   </nav>
   
   """),_display_(/*49.5*/content),format.raw/*49.12*/("""
   
   """),format.raw/*51.4*/("""<!-- Footer -->
   <div class="content">
   </div>
       <footer id="myFooter">
           <div class="container">
              
           </div>
           <div class="social-networks">
               <a href="#" class="twitter"><i class="fa fa-twitter"></i></a>
               <a href="#" class="facebook"><i class="fa fa-facebook-official"></i></a>
               <a href="#" class="google"><i class="fa fa-google-plus"></i></a>
           </div>
           <div class="footer-copyright">
               <p>© 2018 Copyright - Tech Center </p>
           </div>
       </footer>
       <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
       <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
       <script src=""""),_display_(/*69.22*/routes/*69.28*/.Assets.versioned("javascripts/main.js")),format.raw/*69.68*/(""""></script>
   </body>
   </html>"""))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 17 18:22:28 IST 2018
                  SOURCE: /home/wdd/webapps/lab3/app/views/main.scala.html
                  HASH: 7736854123d0d6c19e1060e658fa463559a7cd04
                  MATRIX: 970->1|1121->57|1150->60|1567->450|1582->456|1644->497|2462->1288|2477->1294|2518->1314|2711->1480|2726->1486|2774->1513|2879->1591|2906->1609|2945->1610|2991->1625|3033->1640|3058->1656|3098->1658|3143->1675|3180->1685|3200->1696|3256->1731|3301->1758|3314->1763|3353->1764|3398->1781|3435->1791|3455->1802|3510->1836|3566->1861|3603->1871|3694->1936|3722->1943|3757->1951|4584->2751|4599->2757|4660->2797
                  LINES: 28->1|33->1|36->4|45->13|45->13|45->13|62->30|62->30|62->30|66->34|66->34|66->34|68->36|68->36|68->36|68->36|69->37|69->37|69->37|70->38|70->38|70->38|70->38|71->39|71->39|71->39|72->40|72->40|72->40|72->40|73->41|75->43|81->49|81->49|83->51|101->69|101->69|101->69
                  -- GENERATED --
              */
          