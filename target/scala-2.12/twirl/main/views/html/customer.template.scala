
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

object customer extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[models.Customer],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: List[models.Customer]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.35*/("""

"""),_display_(/*3.2*/main("Customer")/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""
 """),format.raw/*4.2*/("""<p class="lead">Customers</p>
  
<table class="table table-bordered table-hover table-condensed">
  
  <thead>
  
  <!-- The header row-->
  
    <tr>
    
      <th>ID</th>
      
      <th>Name</th>
     
    </tr>
  
  </thead>
  
  <tbody>
    """),format.raw/*23.55*/("""
    """),_display_(/*24.6*/for(p<-customer) yield /*24.22*/ {_display_(Seq[Any](format.raw/*24.24*/("""
  
  """),format.raw/*26.3*/("""<!-- Customer row(s) -->
  
    <tr>
    
      <td>"""),_display_(/*30.12*/p/*30.13*/.getId),format.raw/*30.19*/("""</td>
      
      <td>"""),_display_(/*32.12*/p/*32.13*/.getName),format.raw/*32.21*/("""</td>

      <td>
        <a href=""""),_display_(/*35.19*/routes/*35.25*/.HomeController.deleteCustomer(p.getId)),format.raw/*35.64*/("""" class="btn-xs btn-danger" onclick="return confirmDel();">
          <span class="glyphicon glyphicon-trash"></span>
        </a>
    </td>
    
    </tr>
  """)))}),format.raw/*41.4*/(""" """),format.raw/*41.22*/("""
  
  """),format.raw/*43.3*/("""</tbody>
  
  </table>
  
  """)))}),format.raw/*47.4*/(""" """))
      }
    }
  }

  def render(customer:List[models.Customer]): play.twirl.api.HtmlFormat.Appendable = apply(customer)

  def f:((List[models.Customer]) => play.twirl.api.HtmlFormat.Appendable) = (customer) => apply(customer)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Dec 12 13:47:57 GMT 2017
                  SOURCE: /home/wdd/webapps/lab 8/app/views/customer.scala.html
                  HASH: eb5c10f865407905f48a2e33c36ec9275327fc41
                  MATRIX: 966->1|1094->34|1122->37|1146->53|1185->55|1213->57|1489->355|1521->361|1553->377|1593->379|1626->385|1706->438|1716->439|1743->445|1794->469|1804->470|1833->478|1896->514|1911->520|1971->559|2160->718|2189->736|2222->742|2281->771
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|55->23|56->24|56->24|56->24|58->26|62->30|62->30|62->30|64->32|64->32|64->32|67->35|67->35|67->35|73->41|73->41|75->43|79->47
                  -- GENERATED --
              */
          