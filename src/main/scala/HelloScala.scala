import scala.reflect.runtime.universe._	
import scala.tools.reflect._
import scala.tools.reflect.ToolBox


class B extends {//MyRecord { //Error: class type required but AnyRef{val hello: String} found
  val hello = "Hello B!"
}

object HelloScala {
  type MyRecord = { val hello: String}
  def main(args: Array[String]): Unit = {
    //val b = new B

  val b = DumpLoader.loadClass("B", BDump.dump())
    //println(b.hello) //value hello is not a member of Class[?0]
    val b_ = b.getDeclaredConstructor().newInstance().asInstanceOf[MyRecord]
    //println(b_.hello)	//Value hello is not a member of Any
    val box = new Box[MyRecord](b_)

   // struc(new B)
    struc(b_)
  //  println(new MyRecord)  //Error: class type required but AnyRef{val hello: String} found
  
  
  }

  def struc(b: MyRecord):Unit = {
    println(b.hello)
    //println(classOf[MyRecord]) //Error: class type required but AnyRef{val hello: String} found
  }


  class Box[B](x: B) {
        
  }
}
