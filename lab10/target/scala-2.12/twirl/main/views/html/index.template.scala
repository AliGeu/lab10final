
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[models.Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.34*/("""

"""),_display_(/*3.2*/(products: List[models.Product], categories: List[models.Category])),format.raw/*3.69*/("""

"""),_display_(/*5.2*/main("Products")/*5.18*/ {_display_(Seq[Any](format.raw/*5.20*/("""
 """),format.raw/*6.2*/("""<p class="lead">Product Catalogue</p>
  <div class="row">
    <div class="col-sm-2">
      <h4>Categories</h4>
      <ul class="list-group">
        """),_display_(/*11.10*/for(c <- categories) yield /*11.30*/ {_display_(Seq[Any](format.raw/*11.32*/("""
          """),format.raw/*12.11*/("""<li class="list-group-item">"""),_display_(/*12.40*/c/*12.41*/.getName),format.raw/*12.49*/("""
            """),format.raw/*13.13*/("""<span class="badge">"""),_display_(/*13.34*/c/*13.35*/.getProducts.size()),format.raw/*13.54*/("""</span>
         </li>
        """)))}),format.raw/*15.10*/("""
      """),format.raw/*16.7*/("""</ul>
    </div>
    <div class="col-sm-10">
 """),format.raw/*19.66*/("""
 """),_display_(/*20.3*/if(flash.containsKey("success"))/*20.35*/ {_display_(Seq[Any](format.raw/*20.37*/("""
   """),format.raw/*21.4*/("""<div class="alert alert-success">
      """),_display_(/*22.8*/flash/*22.13*/.get("success")),format.raw/*22.28*/("""
   """),format.raw/*23.4*/("""</div>
 """)))}),format.raw/*24.3*/("""
    """),format.raw/*25.5*/("""</div>
  
<table class="table table-bordered table-hover table-condensed">
  
  <thead>
  
  <!-- The header row-->
  
    <tr>
    
      <th>ID</th>
      
      <th>Name</th>

      <th>Category</th>
      
      <th>Description</th>
      
      <th>Stock</th>
      
      <th class="numeric">Price</th>
      
    </tr>
  
  </thead>
  
  <tbody>
    """),format.raw/*52.55*/("""
    """),_display_(/*53.6*/for(p<-products) yield /*53.22*/ {_display_(Seq[Any](format.raw/*53.24*/("""
  
  """),format.raw/*55.3*/("""<!-- Product row(s) -->
  
    <tr>
    
      <td>"""),_display_(/*59.12*/p/*59.13*/.getId),format.raw/*59.19*/("""</td>
      
      <td>"""),_display_(/*61.12*/p/*61.13*/.getName),format.raw/*61.21*/("""</td>

      <td>"""),_display_(/*63.12*/p/*63.13*/.getCategory.getName),format.raw/*63.33*/("""</td> 
      
      <td>"""),_display_(/*65.12*/p/*65.13*/.getDescription),format.raw/*65.28*/("""</td>
      
      <td>"""),_display_(/*67.12*/p/*67.13*/.getStock),format.raw/*67.22*/("""</td>
      
      <td class="numeric">&euro; """),_display_(/*69.35*/("%.2f".format(p.getPrice))),format.raw/*69.62*/("""</td>

      <td>
        <a href=""""),_display_(/*72.19*/routes/*72.25*/.HomeController.updateProduct(p.getId)),format.raw/*72.63*/("""" class="btn-xs btn-danger">
          <span class="glyphicon glyphicon-pencil"></span>
        </a>
    </td>

      <td>
          <a href=""""),_display_(/*78.21*/routes/*78.27*/.HomeController.deleteProduct(p.getId)),format.raw/*78.65*/("""" class="btn-xs btn-danger" onclick="return confirmDel();">
            <span class="glyphicon glyphicon-trash"></span>
          </a>
      </td>

    
    </tr>
  """)))}),format.raw/*85.4*/(""" """),format.raw/*85.22*/("""
  
  """),format.raw/*87.3*/("""</tbody>
  
  </table>
  <p> 
    <a href=""""),_display_(/*91.15*/routes/*91.21*/.HomeController.addProduct()),format.raw/*91.49*/("""">
      <button class="btn btn-primary">Add a product</button>
    </a>
  </p>

  <p> 
    <a href=""""),_display_(/*97.15*/routes/*97.21*/.HomeController.addCustomer()),format.raw/*97.50*/("""">
      <button class="btn btn-primary">Add a customer</button>
    </a>
  </p>
</div>
</div>
  """)))}),format.raw/*103.4*/(""" """))
      }
    }
  }

  def render(products:List[models.Product]): play.twirl.api.HtmlFormat.Appendable = apply(products)

  def f:((List[models.Product]) => play.twirl.api.HtmlFormat.Appendable) = (products) => apply(products)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Dec 12 17:13:54 GMT 2017
                  SOURCE: /home/wdd/webapps/lab10/app/views/index.scala.html
                  HASH: dc91e7e21e7892c39edfc0a242a1285efcd821a5
                  MATRIX: 962->1|1089->33|1117->36|1204->103|1232->106|1256->122|1295->124|1323->126|1500->276|1536->296|1576->298|1615->309|1671->338|1681->339|1710->347|1751->360|1799->381|1809->382|1849->401|1912->433|1946->440|2020->550|2049->553|2090->585|2130->587|2161->591|2228->632|2242->637|2278->652|2309->656|2348->665|2380->670|2765->1077|2797->1083|2829->1099|2869->1101|2902->1107|2981->1159|2991->1160|3018->1166|3069->1190|3079->1191|3108->1199|3153->1217|3163->1218|3204->1238|3256->1263|3266->1264|3302->1279|3353->1303|3363->1304|3393->1313|3467->1360|3515->1387|3578->1423|3593->1429|3652->1467|3822->1610|3837->1616|3896->1654|4092->1820|4121->1838|4154->1844|4225->1888|4240->1894|4289->1922|4418->2024|4433->2030|4483->2059|4612->2157
                  LINES: 28->1|33->1|35->3|35->3|37->5|37->5|37->5|38->6|43->11|43->11|43->11|44->12|44->12|44->12|44->12|45->13|45->13|45->13|45->13|47->15|48->16|51->19|52->20|52->20|52->20|53->21|54->22|54->22|54->22|55->23|56->24|57->25|84->52|85->53|85->53|85->53|87->55|91->59|91->59|91->59|93->61|93->61|93->61|95->63|95->63|95->63|97->65|97->65|97->65|99->67|99->67|99->67|101->69|101->69|104->72|104->72|104->72|110->78|110->78|110->78|117->85|117->85|119->87|123->91|123->91|123->91|129->97|129->97|129->97|135->103
                  -- GENERATED --
              */
          