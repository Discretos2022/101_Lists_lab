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

  def getNext(): Node = {
    if(next == null)
      return this
    else
      return next.getNext()
  }


  def isPresent(e:String): Boolean = {
    if(item == e)
      return true
    else {
      if(next != null)
        return next.isPresent(e)
      else
        return false
    }
  }


  def findElement(e: String): Node = {
    if (item == e)
      return this
    else {
      if (next != null)
        return next.findElement(e)
      else
        return null
    }
  }


  def removeLast(): Unit = {
    if(next.next == null)
      next = null
    else
      next.removeLast()
  }


  def insertBefore(before:String, n:String): Boolean = {

    if (item == before) {
      next = new Node(n, next)
      return true
    };

    if(next != null)
      return next.insertBefore(before, n)
    else
      return false;

  }



  def removeElement(e:String): Unit = {
    if(next != null){
      if (next.item == e)
        next = next.next
      else
        next.removeElement(e)
    }


  }

}
