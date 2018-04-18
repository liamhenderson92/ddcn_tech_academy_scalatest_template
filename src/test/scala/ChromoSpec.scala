import org.scalatest._

class ChromoSpec extends WordSpec with MustMatchers {

  "Chromo" must {

    "return a list of 1,0 when given 0,1 and index to change of 1" in {
      Chromo.swap("0","1",1) mustEqual List("1","0")
    }

    "return a list of 0,1 when given 1,0 and index to change of 0" in {
      Chromo.swap("1","0",1) mustEqual List("0","1")
    }

    "return a list of 1100 and 0011 when given 0000 and 1111 and index of 2" in {
      Chromo.swap("0000","1111",2) mustEqual List("0011","1100")
    }

    "return a list of 0001111 and 1110000 when given 0000000 and 1111111 and an index of 4" in {
      Chromo.swap("0000000","1111111",4) mustEqual List("0001111","1110000")
    }

    "return a list of 00 and 11 when given 00 and 11 and an index change of 0" in {
      Chromo.swap("00","11",0) mustEqual List("00","11")
    }
  }
}
