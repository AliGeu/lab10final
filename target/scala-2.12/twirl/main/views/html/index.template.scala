
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

"""),_display_(/*3.2*/main("Products")/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""
 """),format.raw/*4.2*/("""<p class="lead">Product Catalogue</p>

 """),format.raw/*6.66*/("""
 """),_display_(/*7.3*/if(flash.containsKey("success"))/*7.35*/ {_display_(Seq[Any](format.raw/*7.37*/("""
   """),format.raw/*8.4*/("""<div class="alert alert-success">
      """),_display_(/*9.8*/flash/*9.13*/.get("success")),format.raw/*9.28*/("""
   """),format.raw/*10.4*/("""</div>
 """)))}),format.raw/*11.3*/("""
  
"""),format.raw/*13.1*/("""<table class="table table-bordered table-hover table-condensed">
  
  <thead>
  
  <!-- The header row-->
  
    <tr>
    
      <th>ID</th>
      
      <th>Name</th>
      
      <th>Description</th>
      
      <th>Stock</th>
      
      <th class="numeric">Price</th>
      
    </tr>
  
  </thead>
  
  <tbody>
    """),format.raw/*36.55*/("""
    """),_display_(/*37.6*/for(p<-products) yield /*37.22*/ {_display_(Seq[Any](format.raw/*37.24*/("""
  
  """),format.raw/*39.3*/("""<!-- Product row(s) -->
  
    <tr>
    
      <td>"""),_display_(/*43.12*/p/*43.13*/.getId),format.raw/*43.19*/("""</td>
      
      <td>"""),_display_(/*45.12*/p/*45.13*/.getName),format.raw/*45.21*/("""</td>
      
      <td>"""),_display_(/*47.12*/p/*47.13*/.getDescription),format.raw/*47.28*/("""</td>
      
      <td>"""),_display_(/*49.12*/p/*49.13*/.getStock),format.raw/*49.22*/("""</td>
      
      <td class="numeric">&euro; """),_display_(/*51.35*/("%.2f".format(p.getPrice))),format.raw/*51.62*/("""</td>
    
    </tr>
  """)))}),format.raw/*54.4*/(""" """),format.raw/*54.22*/("""
  
  """),format.raw/*56.3*/("""</tbody>
  
  </table>
  <p> 
    <a href=""""),_display_(/*60.15*/routes/*60.21*/.HomeController.addProduct()),format.raw/*60.49*/("""">
      <button class="btn btn-primary">Add a product</button>
    </a>
  </p>

  <p> 
    <a href=""""),_display_(/*66.15*/routes/*66.21*/.HomeController.addCustomer()),format.raw/*66.50*/("""">
      <button class="btn btn-primary">Add a customer</button>
    </a>
  </p>
  """)))}),format.raw/*70.4*/(""" """))
      }
    }
  }

  def render(products:List[models.Product]): play.twirl.api.HtmlFormat.Appendable = apply(products)

  def f:((List[models.Product]) => play.twirl.api.HtmlFormat.Appendable) = (products) => apply(products)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Dec 12 12:43:56 GMT 2017
                  SOURCE: /home/wdd/webapps/lab 8/app/views/index.scala.html
                  HASH: 48c5fc8470f868fcff3b1de5705e1bab2e70cac1
                  MATRIX: 962->1|1089->33|1117->36|1141->52|1180->54|1208->56|1275->160|1303->163|1343->195|1382->197|1412->201|1478->242|1491->247|1526->262|1557->266|1596->275|1627->279|1977->651|2009->657|2041->673|2081->675|2114->681|2193->733|2203->734|2230->740|2281->764|2291->765|2320->773|2371->797|2381->798|2417->813|2468->837|2478->838|2508->847|2582->894|2630->921|2684->945|2713->963|2746->969|2817->1013|2832->1019|2881->1047|3010->1149|3025->1155|3075->1184|3189->1268
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|38->6|39->7|39->7|39->7|40->8|41->9|41->9|41->9|42->10|43->11|45->13|68->36|69->37|69->37|69->37|71->39|75->43|75->43|75->43|77->45|77->45|77->45|79->47|79->47|79->47|81->49|81->49|81->49|83->51|83->51|86->54|86->54|88->56|92->60|92->60|92->60|98->66|98->66|98->66|102->70
                  -- GENERATED --
              */
          