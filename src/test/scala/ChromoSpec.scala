import org.scalatest._

class ChromoSpec extends WordSpec with MustMatchers {

  "Chromo" must {

    "return a list of 0,1 when given 1,0 and index of 0" in {
      Chromo.swap("1","0",0) mustEqual List("0","1")
    }

    "return a list of 01,10 when given 00,11 and index to change of 1" in {
      Chromo.swap("00","11",1) mustEqual List("01","10")
    }

    "return a list of 00 and 11 when given 00 and 11 and an index change of 0" in {
      Chromo.swap("00","11",0) mustEqual List("11","00")
    }

    "return a list of 0011 and 1100 when given 0000 and 1111 and index of 2" in {
      Chromo.swap("0000","1111",2) mustEqual List("0011","1100")
    }

    "return a list of 0001111 and 1110000 when given 0000000 and 1111111 and an index of 4" in {
      Chromo.swap("0000000","1111111",4) mustEqual List("0000111","1111000")
    }
  }
}
