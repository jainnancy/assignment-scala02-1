package edu.knoldus

class Elimination {

  def eliminateDuplicate(list: List[Char],resultList: List[Char]): List[Char] ={

    list match{
      case head1 :: head2 :: tail if(head1 == head2) => eliminateDuplicate(head1 :: tail, resultList)
      case head1 :: head2 :: tail if(head1 != head2) => eliminateDuplicate(head2 :: tail, resultList :+ head1)
     // case head1 :: head2 :: Nil if(head1 == head2) => eliminateDuplicate(List(), resultList :+ head1)
      case head1 :: head2 :: Nil if(head1 != head2) => eliminateDuplicate(List() :+ head2, resultList :+ head1)
      case head1 :: Nil => eliminateDuplicate(List(), resultList :+ head1)
      case _ => resultList
    }
  }

}
