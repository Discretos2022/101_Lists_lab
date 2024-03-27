object Main extends App{


  var list:Node = new Node("Paris", new Node("Bern", new Node("Rome", null)));


  var linkedList:LinkedList = new LinkedList()
  println(linkedList.toString)
  linkedList.addToStart("Rome")
  println(linkedList.toString)
  linkedList.addToStart("Paris")
  println(linkedList.toString)
  linkedList.addToStart("Tokyo")
  println(linkedList.toString)

}
