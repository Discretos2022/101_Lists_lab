class LinkedList(h:Node = null) {

  var head:Node = h

  def addToStart(s:String): Unit = {
    head = new Node(s, head)
  }

  def getSize():Int = {
    if(head == null)
      return 0
    else
      return head.getNum
  }

  override def toString: String = {
    if(head != null)
      return s"List content (size ${getSize()}) : ${head.toString}"
    else
      return s"List content (size 0) : null"
  }


  def removeFirstElement(): Unit = {
    if(head != null){
      if (head.next != null)
        head = head.next
      else
        head = null
    }
  }

  def getLastElement(): Node = {
    if(getSize == 0)
      return null
    else
      return head.getNext()
  }

  def addToEnd(element:String): Unit = {
    if(getLastElement() != null){
      getLastElement().next = new Node(getLastElement().item, null)
      getLastElement().item = element
    }
    else
      head = new Node(element, null)
  }

  def isPresent(e:String): Boolean = {

    if(getSize() == 0)
      return false;
    else
      return head.isPresent(e)

  }


  def findElement(e:String): Node = {

    if (getSize == 0)
      return null;
    else
      return head.findElement(e)

  }

  def swapElements(e1:String, e2:String): Unit = {

    var n1:Node = findElement(e1)
    var n2:Node = findElement(e2)

    var s:String = n1.item

    n1.item = n2.item
    n2.item = s

  }

  def removeLastElement(): Unit = {

    if(head != null){
      if (head.next == null)
        head = null
      else
        head.removeLast()
    }
  }

  def insertAfter(before:String, n:String): Boolean = {

    if(head.item == before) {
      head.next = new Node(n, head.next)
      return true
    }

    if(head.next != null)
      return head.next.insertBefore(before, n)
    else
      return false;

  }


  def removeElement(e:String): Unit = {

    if(head == null)
      return

    if(head.item == e) {
      head = head.next
      return
    };

    head.removeElement(e);
  }

}
