
package edu.knoldus

object ListOperation extends App {

  val list1 = ('a' to 'k').toList
  val obj1= new Rotate
  val value = 5
  print(s"Output for rotated list for $value places\n")
  val rotatedList = obj1.rotate(value,list1)
  print(s"Input: $list1 \nOutput: $rotatedList \n")

  val list2 = List('b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e', 'a', 'a', 'a', 'a')
  val obj2 = new Elimination
  val eliminatedList = obj2.eliminateDuplicate(list2,List())
  print(s"\nOutput for list after eliminating duplicates \n")
  print(s"Input: $list2 \nOutput: $eliminatedList\n")

  val obj3 = new HappyNumber
  val range = 10 to 60
  print(s"\nOutput for Happy numbers ranging from $range \n")
  obj3.displayHappyNumbers(range.toList)

}
