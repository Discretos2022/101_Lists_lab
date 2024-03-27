class LinkedList(h:Node = null) {

  var head:Node = h

  def addToStart(s:String): Unit = {
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


  def removeFirstElement(): Unit = {
    head = head.next
  }

  def getLastElement(): Node = {
    if(getSize == 0)
      return null
    else
      return head.getNext()
  }

  def addToEnd(element:String): Unit = {
    getLastElement().next = new Node(element, null)
  }

  def isPresent(e:String): Boolean = {

    if(getSize == 0)
      return false;
    else
      return head.isPresent(e)

  }

}
