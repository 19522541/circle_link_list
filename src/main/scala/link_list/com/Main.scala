package link_list.com

object Main extends App {

       val head= new Node()
      val  t1=  head.setNext(Some(head))
       val t2=  t1.setNext(Some(new Node()))
        val t3=  t2.setNext(Some(new Node()))
  t3.setNext(Some(t1))

    println(if (Node.isCircle(Some(head)))"Is circle"else "Is not circle")

}
