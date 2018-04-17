
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
/*1.2*/import models.products.Category
/*2.2*/import models.products.Product
/*3.2*/import models.users.User

object listProducts extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[List[Product],List[Category],Long,String,User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(products: List[Product], categories: List[Category],catId: Long, filter: String, user: User,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.121*/("""


"""),_display_(/*7.2*/main("Products",user)/*7.23*/ {_display_(Seq[Any](format.raw/*7.25*/("""
"""),format.raw/*8.1*/("""<p class="lead">Product Catalogue</p>
<br>
<div class="row">
  <div class="col-sm-2">
    <h4>Categories</h4>
    <div class="list-group">
      <a href=""""),_display_(/*14.17*/routes/*14.23*/.ProductCtrl.listProducts(0, filter)),format.raw/*14.59*/("""" class="list-group-item">All Categories</a>
      """),_display_(/*15.8*/for(c <- categories) yield /*15.28*/ {_display_(Seq[Any](format.raw/*15.30*/("""
        """),format.raw/*16.9*/("""<a href=""""),_display_(/*16.19*/routes/*16.25*/.ProductCtrl.listProducts(c.getId, filter)),format.raw/*16.67*/("""" class="list-group-item">"""),_display_(/*16.94*/c/*16.95*/.getName),format.raw/*16.103*/("""
          """),format.raw/*17.11*/("""<span class="badge">"""),_display_(/*17.32*/c/*17.33*/.getProducts.size()),format.raw/*17.52*/("""</span>
        </a>
      """)))}),format.raw/*19.8*/("""
    """),format.raw/*20.5*/("""</div>
  </div>
  <div class="col-sm-10">
      """),_display_(/*23.8*/if(flash.containsKey("success"))/*23.40*/ {_display_(Seq[Any](format.raw/*23.42*/("""
        """),format.raw/*24.9*/("""<div class="alert alert-success">
          """),_display_(/*25.12*/flash/*25.17*/.get("success")),format.raw/*25.32*/("""
        """),format.raw/*26.9*/("""</div>
      """)))}),format.raw/*27.8*/("""
      """),format.raw/*28.7*/("""<div id="actions">
        <from action="routes.ProductCtrl.listProducts(catId)"method="GET">
          <input type="search" id="searchbox" name="filter" value=""""),_display_(/*30.69*/filter),format.raw/*30.75*/("""" placeholder="Filter by product name...">
          <input type="submit" id="searchsubmit" value="Filter by name" class="btn-md btn-primary">
        </form>
      </div>
    <table class="table table-bordered table-hover table-condensed">   
      <thead>
        <tr>
          <th>ID</th>
          <th>Name</th>
          <th>Category</th>
          <th>Description</th>
          <th>Stock</th>
          <th>Price</th>   
        </tr>
      </thead>

      <tbody>
        """),_display_(/*47.10*/for(p<-products) yield /*47.26*/ {_display_(Seq[Any](format.raw/*47.28*/("""
          """),format.raw/*48.11*/("""<tr>
              """),_display_(/*49.16*/if(env.resource("public/images/productImages/thumbnails/" + p.getId + ".jpg").isDefined)/*49.104*/ {_display_(Seq[Any](format.raw/*49.106*/("""
                """),format.raw/*50.17*/("""<td><img src="/assets/images/productImages/thumbnails/"""),_display_(/*50.72*/(p.getId + ".jpg")),format.raw/*50.90*/(""""/></td>
            """)))}/*51.15*/else/*51.20*/{_display_(Seq[Any](format.raw/*51.21*/("""
                """),format.raw/*52.17*/("""<td><img src="/assets/images/productImages/thumbnails/noImage.jpg"/></td>
            """)))}),format.raw/*53.14*/("""
            """),format.raw/*54.13*/("""<td class="numeric">"""),_display_(/*54.34*/p/*54.35*/.getId),format.raw/*54.41*/("""</td>
            <td><a href=""""),_display_(/*55.27*/routes/*55.33*/.ProductCtrl.productDetails(p.getId)),format.raw/*55.69*/("""">
                """),_display_(/*56.18*/p/*56.19*/.getName),format.raw/*56.27*/("""</td>
               </a>     
            <td>"""),_display_(/*58.18*/p/*58.19*/.getDescription),format.raw/*58.34*/("""</td>
            <td  class="numeric">"""),_display_(/*59.35*/p/*59.36*/.getStock),format.raw/*59.45*/("""</td>
            <td  class="numeric">€ """),_display_(/*60.37*/("%.2f".format(p.getPrice))),format.raw/*60.64*/("""</td>
          
          </tr>
        """)))}),format.raw/*63.10*/("""
      """),format.raw/*64.7*/("""</tbody>

    </table>
  </div>
</div>
""")))}))
      }
    }
  }

  def render(products:List[Product],categories:List[Category],catId:Long,filter:String,user:User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(products,categories,catId,filter,user,env)

  def f:((List[Product],List[Category],Long,String,User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (products,categories,catId,filter,user,env) => apply(products,categories,catId,filter,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 17 18:36:34 IST 2018
                  SOURCE: /home/wdd/webapps/lab3/app/views/listProducts.scala.html
                  HASH: 2a5601441fca8a686c830e1c2315ab7c69ba9f29
                  MATRIX: 651->1|690->34|728->66|1124->92|1339->211|1368->215|1397->236|1436->238|1463->239|1645->394|1660->400|1717->436|1795->488|1831->508|1871->510|1907->519|1944->529|1959->535|2022->577|2076->604|2086->605|2116->613|2155->624|2203->645|2213->646|2253->665|2311->693|2343->698|2418->747|2459->779|2499->781|2535->790|2607->835|2621->840|2657->855|2693->864|2737->878|2771->885|2960->1047|2987->1053|3496->1535|3528->1551|3568->1553|3607->1564|3654->1584|3752->1672|3793->1674|3838->1691|3920->1746|3959->1764|4000->1787|4013->1792|4052->1793|4097->1810|4215->1897|4256->1910|4304->1931|4314->1932|4341->1938|4400->1970|4415->1976|4472->2012|4519->2032|4529->2033|4558->2041|4633->2089|4643->2090|4679->2105|4746->2145|4756->2146|4786->2155|4855->2197|4903->2224|4976->2266|5010->2273
                  LINES: 24->1|25->2|26->3|31->4|36->4|39->7|39->7|39->7|40->8|46->14|46->14|46->14|47->15|47->15|47->15|48->16|48->16|48->16|48->16|48->16|48->16|48->16|49->17|49->17|49->17|49->17|51->19|52->20|55->23|55->23|55->23|56->24|57->25|57->25|57->25|58->26|59->27|60->28|62->30|62->30|79->47|79->47|79->47|80->48|81->49|81->49|81->49|82->50|82->50|82->50|83->51|83->51|83->51|84->52|85->53|86->54|86->54|86->54|86->54|87->55|87->55|87->55|88->56|88->56|88->56|90->58|90->58|90->58|91->59|91->59|91->59|92->60|92->60|95->63|96->64
                  -- GENERATED --
              */
          