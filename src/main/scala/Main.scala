object Main extends App{


  var list:Node = new Node("Paris", new Node("Bern", new Node("Rome", null)))


  var linkedList:LinkedList = new LinkedList()
  println(linkedList.toString)
  linkedList.addToStart("Rome")
  println(linkedList.toString)
  linkedList.addToStart("Paris")
  println(linkedList.toString)
  linkedList.addToStart("Tokyo")
  println(linkedList.toString)


  println(linkedList.getLastElement().item)

  linkedList.removeFirstElement()
  println(linkedList.toString)

  linkedList.addToEnd("Discland")
  println(linkedList.toString)

  println(linkedList.isPresent("DiscLand"))

  println(linkedList.findElement("hahaha"))

  linkedList.swapElements("Discland", "Paris")
  println(linkedList.toString)


  linkedList.removeLastElement()
  println(linkedList.toString)


  linkedList.insertAfter("Rome", "Discraft")
  println(linkedList.toString)



  linkedList = new LinkedList();

  linkedList.addToEnd("Land")
  linkedList.addToEnd("World")
  linkedList.addToEnd("Disc")

  println(linkedList)

  linkedList.removeElement("Disc")

  println(linkedList)



}
