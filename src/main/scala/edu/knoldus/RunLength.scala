/*
object RunLength {

  val list = List(1,1,2,2,3,3,3,2,2)
  val result = runLengthEncoding(1,list(0),list)

  def runLengthEncoding(i: Int,a: Int,b: Int,list: List[Int]): List[(Int, Int)] =
  {
    i match {
      case i if (list(i) == list(i + 1)) => runLengthEncoding(i+1,list(i), b + 1, list)
      case i if (list(i) != list(i + 1)) => runLengthEncoding(i+1,list(i), 1, list)

    }
        /*if(list(i) == list(i+1))
          {
            List(list(i),b + 1, list)
          }
        else
          {
            list(list(i), 1, list)
          }
      }
    case */
  }
}
*/
