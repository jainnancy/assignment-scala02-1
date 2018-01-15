package edu.knoldus

class Rotate {

  def rotate(n: Int, list: List[Any]): List[Any] ={

  list match {
    case head :: tail if(n > 0) => rotate(n - 1, tail :+head)
    case _ => list
  }
  }
}
