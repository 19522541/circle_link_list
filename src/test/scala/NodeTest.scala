import link_list.com.Node
import org.scalatest.funsuite.AnyFunSuite

class NodeTest extends AnyFunSuite{
 test("Node.isCirle When linked_list is not circle"){
   val head= new Node()
   head.append(Option( new Node()))
   head.append(Option( new Node()))
   head.append(Option( new Node()))

   assert(Node.isCircle(Option(head))===false)
 }
  test("Node.isCirle When linked_list is circle"){
    val head= new Node()
    head.append(Option( new Node()))
   val t= head.append(Option( new Node()))
    head.append(Option( new Node()))
    head.append(Option( new Node()))
    head.append(t)

    assert(Node.isCircle(Option(head))===true)
  }
  test("Node.isCirle When linked_list is circle in the head of list"){
    val head= new Node()
    head.append(Option( new Node()))
    head.append(Option( new Node()))
    head.append(Option( new Node()))
    head.append(Option(head))

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
