
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/lab 8/conf/routes
// @DATE:Tue Dec 12 12:49:03 GMT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
