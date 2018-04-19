object Chromo extends App {

  def swap(input1: String, input2: String, index : Int): List[String] = {

//    val stringLength = input1.length-index
//
//    val input1new = input1.take(stringLength).concat(input2.takeRight(index))
//    val input2new = input2.take(stringLength).concat(input1.takeRight(index))
//
//    List(input1new,input2new)

    val split1 = input1.splitAt(index)
    val split2 = input2.splitAt(index)

    List(split1._1 + split2._2, split2._1 + split1._2)

  }

}