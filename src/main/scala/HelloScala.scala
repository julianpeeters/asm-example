import scala.reflect.runtime.universe._	

object HelloScala {
  def main(args: Array[String]): Unit = {
    val b = new B
    val cls = b.getClass()
    val b_ = cls.getDeclaredConstructor().newInstance()
    println(b.hello)
    println(b_.hello)	
  }
}
class B {
  val hello = "Hello B!"
}
