import scala.reflect.runtime.universe._	
import scala.tools.reflect._
import scala.tools.reflect.ToolBox
/*
}
class B {
  val hello = "Hello B!"
}
*/
object HelloScala {
  def main(args: Array[String]): Unit = {
    //val b = new B

    val cm = runtimeMirror(getClass.getClassLoader)
    val tb  = cm.mkToolBox()
    val expr = tb.parse("""class C {val hello = "Hello B!"}; scala.reflect.classTag[C].runtimeClass; new C""")
      println(expr)
    val eval = tb.eval(expr)
      println(eval)
    //  println(cm.classSymbol(eval.asInstanceOf[RuntimeClass]))

    val b = DumpLoader.loadClass("B", BDump.dump())
    //println(b.hello) //value hello is not a member of Class[?0]
    val b_ = b.getDeclaredConstructor().newInstance()
    //println(b_.hello)	//Value hello is not a member of Any


    val cm_ = runtimeMirror(b.getClassLoader)
    val tb_  = cm_.mkToolBox()
    val expr_ = tb_.parse("""class C {val hello = "Hello B!"}; scala.reflect.classTag[C].runtimeClass""")
      println(expr_)
    val eval_ = tb_.eval(expr_)
     // println(eval.asInstanceOf[RuntimeClass])
  }
}
