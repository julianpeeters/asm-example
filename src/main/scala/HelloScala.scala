import scala.reflect.runtime.universe._	
import scala.tools.reflect._
import scala.tools.reflect.ToolBox

trait A {
  val hi = "Hello A!"
}
/*
class B extends A {
  val hello = "Hello B!"
}
*/
object HelloScala {
  type t = {val hi: String; val hello: String}
  def main(args: Array[String]): Unit = {
   // val b = new B
   //   println(b.hello)
   //   println(b.hi)
    val B = DumpLoader.loadClass("B", BDump.dump())
    val Bctor = B.getDeclaredConstructor()
    val b = Bctor.newInstance().asInstanceOf[A]
    println(b)
    println(B.getDeclaredField("hi"))   

  }
  
}
