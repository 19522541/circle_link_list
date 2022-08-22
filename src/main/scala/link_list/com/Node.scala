package link_list.com

class Node(private var next :Option[Node]=None) {
  def setNext(nextNote:Option[Node]): Node ={
    this.next= nextNote
    next.get
  }
  def append(tailNode:Option[Node]):Option[Node]={
    if(Node.isCircle(Option(this))){
      return None
    }
    var currentNode= this

      while( currentNode.next.isDefined )
        {
          currentNode= currentNode.next.get
        }
          currentNode.next=tailNode
    tailNode
  }
  def nextNode(): Option[Node] ={
     next
  }
}
object Node{
  def isCircle(head:Option[Node]): Boolean ={
    if (head.isEmpty||head.get.next.isEmpty){
      return  false
    } else{
      var slowerIncreasingNode =head
      var fasterIncreasingNode = slowerIncreasingNode.get.nextNode()
      while (slowerIncreasingNode.isDefined && fasterIncreasingNode!=slowerIncreasingNode && fasterIncreasingNode.isDefined ){
        slowerIncreasingNode = slowerIncreasingNode.get.nextNode()
        if( fasterIncreasingNode.get.nextNode().isDefined){
          fasterIncreasingNode = fasterIncreasingNode.get.nextNode().get.nextNode()
        }else{
          return false
        }

      }
      if(fasterIncreasingNode==slowerIncreasingNode) {
        return true
      }
    }

    false
  }
}
