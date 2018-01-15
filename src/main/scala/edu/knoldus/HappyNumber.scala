package edu.knoldus

class HappyNumber {

  def calculate(n: Int): Int = {
    n match {
      case n if n == 0 => 0
      case _ => (n % 10) * (n % 10) + calculate(n / 10)
    }
  }

  def sum(list: List[Int], n: Int): Boolean = {

    n match {
      case n if list.contains(n) => false
      case n if n == 1 => true
      case _ => sum(list :+ n, calculate(n))
    }
  }

  def isHappyNumber(n: Int): Unit = {
       if(sum(List(), n))
    { print(s"$n ")
    }
  }

  def displayHappyNumbers(list: List[Int]): Unit = {
    for (x <- list) {
      isHappyNumber(x)
    }
  }

}
