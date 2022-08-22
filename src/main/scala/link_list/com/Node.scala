package link_list.com

class Node(private var next :Option[Node]=None) {
  def setNext(nextNote:Option[Node]): Node ={
    this.next= nextNote
    next.get
  }
  def nextNode(): Option[Node] ={
     next
  }
}
object Node{
  def isCircle(head:Option[Node]): Boolean ={

    if (head==None||head.get.next==None){

      return  false
    } else{
      var slower =head
      var faster = slower.get.nextNode()
      while (slower!=None && faster!=slower && faster!=None ){
        println(slower)
        slower = slower.get.nextNode()
        faster = faster.get.nextNode().get.nextNode()
      }
      if(faster==slower) {
        return true
      }
    }

    return  false
  }
}
