
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/davemedvedev/Desktop/testdemo/conf/routes
// @DATE:Wed Dec 07 07:06:12 EST 2016


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
