import scala.reflect.runtime.universe._	
import scala.tools.reflect._
import scala.tools.reflect.ToolBox
import scala.language.dynamics

class DynamicBase extends Dynamic {
  def selectDynamic(name: String) = name
}
/*
class  B extends DynamicBase {
  val hello = "Hello B!"
}

*/
object HelloScala {
  def main(args: Array[String]): Unit = {
    //val b = new B
    //  println(b.hello)

    val cls = DumpLoader.loadClass("B", BDump.dump())
      println(cls)      

    val ctor = cls.getDeclaredConstructor()
    val b = ctor.newInstance().asInstanceOf[DynamicBase]
      println(b.hello)

  }

}
