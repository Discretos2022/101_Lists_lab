class Node(i:String, n:Node) {

  var item:String = i
  var next:Node = n

  override def toString: String = {

    if(next != null)
      return item + " -> " + next.toString
    else
      return item + " -> " + "null"

  }

  def getNum: Int = {
    if(next != null)
      return 1 + next.getNum
    else
      return 1
  }

}
