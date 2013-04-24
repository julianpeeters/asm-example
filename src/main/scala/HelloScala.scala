import scala.reflect.runtime.universe._	
import scala.tools.reflect._
import scala.tools.reflect.ToolBox


class B {
  val hello = "Hello B!"
}

object HelloScala {
  def main(args: Array[String]): Unit = {
    //val b = new B

    struc(new B)
  
  //  val b = DumpLoader.loadClass("B", BDump.dump())
    //println(b.hello) //value hello is not a member of Class[?0]
   // val b_ = b.getDeclaredConstructor().newInstance()
    //println(b_.hello)	//Value hello is not a member of Any

  }
  def struc(b: {val hello: String}):Unit = {
    println(b.hello)
  }

}
