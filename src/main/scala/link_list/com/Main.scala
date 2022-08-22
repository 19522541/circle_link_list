package link_list.com

object Main extends App {

       val head= new Node()

val t=    head.append( Some(new Node()))
  head.append( Some(new Node()))
  head.append( Some(new Node()))
  head.append( Some(new Node()))
  head.append(t)


  println(if (Node.isCircle(Some(head)))"Is circle"else "Is not circle")

}
