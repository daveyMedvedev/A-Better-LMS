
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/davemedvedev/Desktop/testdemo/conf/routes
// @DATE:Sat Dec 10 21:18:33 EST 2016


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
