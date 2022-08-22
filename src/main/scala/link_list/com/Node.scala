package link_list.com

import link_list.com.Node.isCircle

import scala.collection.mutable.RedBlackTree

class Node(private var next :Option[Node]=None) {
  def setNext(nextNote:Option[Node]): Node ={
    this.next= nextNote
    next.get
  }
  def append(tailNode:Option[Node]):Option[Node]={
//    if(Node.isCircle(Option(this))){
//      return None
//    }
    var currentNode= this

      while( currentNode.next.isDefined )
        {
          currentNode= currentNode.next.get
        }
          currentNode.next=tailNode
    return tailNode
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
      while (slower.isDefined && faster!=slower && faster.isDefined ){

        slower = slower.get.nextNode()
        if( faster.get.nextNode().isDefined){
          faster = faster.get.nextNode().get.nextNode()
        }else{
          return false
        }

      }
      if(faster==slower) {
        return true
      }
    }

    return  false
  }
}
