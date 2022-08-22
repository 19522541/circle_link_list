import link_list.com.Node
import org.scalatest.funsuite.AnyFunSuite

class NodeTest extends AnyFunSuite{
 test("Node.isCirle When linked_list is not circle"){
   val head= new Node()
   val  t1=  head.setNext(Some(head))
   val t2=  t1.setNext(Some(new Node()))
   val t3=  t2.setNext(Some(new Node()))
   assert(Node.isCircle(Option(head))===false)
 }
  test("Node.isCirle When linked_list is circle"){
    val head= new Node()
    val  t1=  head.setNext(Some(head))
    val t2=  t1.setNext(Some(new Node()))
    val t3=  t2.setNext(Some(new Node()))
    val t4=  t3.setNext(Some(new Node()))
    t3.setNext(Some(t1))
    assert(Node.isCircle(Option(head))===true)
  }
  test("Node.isCirle When linked_list is circle in the head of list"){
    val head= new Node()
    val  t1=  head.setNext(Some(head))
    val t2=  t1.setNext(Some(new Node()))
    val t3=  t2.setNext(Some(new Node()))
    val t4=  t3.setNext(Some(new Node()))
    t3.setNext(Some(head))
    assert(Node.isCircle(Option(head))===true)
  }
  test(("Node.isCirle when linked-list has only one node")){
    val head =new Node()
    assert(Node.isCircle(Option(head))===false)
  }
  test(("Node.isCirle when linked-list is empty")){
    assert(Node.isCircle(None)===false)
  }
}
