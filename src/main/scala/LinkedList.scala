class LinkedList(h:Node = null) {

  var head:Node = h;
  var num:Int = 0;

  if(head != null)
    num += 1

  def addToStart(s:String): Unit = {
    num += 1
    head = new Node(s, head)
  }

  def getSize:Int = {
    if(head == null)
      return 0
    else
      return head.getNum
  }

  override def toString: String = {
    if(head != null)
      return s"List content (size ${getSize}) : ${head.toString}"
    else
      return s"List content (size 0) : null"
  }

}
