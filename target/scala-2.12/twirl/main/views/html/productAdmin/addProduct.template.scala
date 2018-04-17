
package views.html.productAdmin

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
/*1.2*/import models.products.Category
/*2.2*/import models.products.Product
/*3.2*/import models.users.User

object addProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[Product],User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(productForm: Form[Product], user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*5.2*/import helper._


Seq[Any](format.raw/*4.42*/("""
"""),format.raw/*6.1*/("""
"""),_display_(/*7.2*/main("Add Product",user)/*7.26*/ {_display_(Seq[Any](format.raw/*7.28*/("""
    """),format.raw/*8.5*/("""<style></style>
    <p class="lead">Add a new product</p>
    """),_display_(/*10.6*/form(action=routes.AdminProductCtrl.addProductSubmit(), 'class -> "form-horizontal", 'role -> "form",'enctype -> "multipart/form-data")/*10.141*/ {_display_(Seq[Any](format.raw/*10.143*/("""
        """),format.raw/*11.37*/("""
        """),_display_(/*12.10*/CSRF/*12.14*/.formField),format.raw/*12.24*/("""
        """),_display_(/*13.10*/inputText(productForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*13.85*/("""
        """),format.raw/*14.9*/("""<!-- Checkboxes for categories - current categories for this product are checked -->
        <!-- Category.options provides a hashmap of value, name pairs -->
        <!-- If product (id) is in catagory - mark it as checked -->
        <!-- Checkbox name is catSelect[],  selected values will be stored in -->
        <!-- form object using catSelect defined in Product  -->
        """),_display_(/*19.10*/for((value, name) <- Category.options) yield /*19.48*/ {_display_(Seq[Any](format.raw/*19.50*/("""
            """),format.raw/*20.13*/("""<input type="checkbox" name="catSelect[]" value=""""),_display_(/*20.63*/value),format.raw/*20.68*/(""""
            
            />"""),_display_(/*22.16*/name),format.raw/*22.20*/("""<br>        
        """)))}),format.raw/*23.10*/("""
        """),_display_(/*24.10*/inputText(productForm("description"), '_label -> "Description", 'class -> "form-control")),format.raw/*24.99*/("""
        """),_display_(/*25.10*/inputText(productForm("stock"), '_label -> "Stock", 'class -> "form-control")),format.raw/*25.87*/("""
        """),_display_(/*26.10*/inputText(productForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*26.87*/("""

        """),_display_(/*28.10*/inputText(productForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*28.74*/("""

        """),format.raw/*30.9*/("""<label>Image Upload</label>
        <input class="btn-sm btn-default" type="file" name="upload">
        <br><br>
        <div class="actions">
            <input type="submit" value="Add Product" class="btn btn-primary">
            <a href=""""),_display_(/*35.23*/routes/*35.29*/.ProductCtrl.listProducts(0)),format.raw/*35.57*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*39.6*/("""
""")))}))
      }
    }
  }

  def render(productForm:Form[Product],user:User): play.twirl.api.HtmlFormat.Appendable = apply(productForm,user)

  def f:((Form[Product],User) => play.twirl.api.HtmlFormat.Appendable) = (productForm,user) => apply(productForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Apr 16 12:25:54 IST 2018
                  SOURCE: /home/wdd/webapps/lab3/app/views/productAdmin/addProduct.scala.html
                  HASH: e8fe9d5f5b46ec24b457ef5022b145edc74c214e
                  MATRIX: 664->1|703->34|741->66|1087->92|1200->134|1245->132|1272->150|1299->152|1331->176|1370->178|1401->183|1490->246|1635->381|1676->383|1713->420|1750->430|1763->434|1794->444|1831->454|1927->529|1963->538|2374->922|2428->960|2468->962|2509->975|2586->1025|2612->1030|2669->1060|2694->1064|2747->1086|2784->1096|2894->1185|2931->1195|3029->1272|3066->1282|3164->1359|3202->1370|3287->1434|3324->1444|3595->1688|3610->1694|3659->1722|3807->1840
                  LINES: 24->1|25->2|26->3|31->4|34->5|37->4|38->6|39->7|39->7|39->7|40->8|42->10|42->10|42->10|43->11|44->12|44->12|44->12|45->13|45->13|46->14|51->19|51->19|51->19|52->20|52->20|52->20|54->22|54->22|55->23|56->24|56->24|57->25|57->25|58->26|58->26|60->28|60->28|62->30|67->35|67->35|67->35|71->39
                  -- GENERATED --
              */
          