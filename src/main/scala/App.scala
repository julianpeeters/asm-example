import java.io._
import org.objectweb.asm._
import java.lang.reflect._
import scala.tools.scalap.scalax.rules.scalasig._ //from salat?
import scala.tools.reflect.ToolBox
import scala.reflect._
import scala.reflect.api._
import scala.reflect.runtime._
import scala.reflect.runtime.universe._
import reflect.runtime.currentMirror
//import scala.reflect.generic.ByteCodecs
import scala.reflect.internal.pickling._
//import scala.reflect.runtime.mirrors._

case class MyRecordX(x: String)
class MyRecordY(x:String)

//class Property[T](instance: T, methodName: String)(implicit tttt:TypeTag[T]) {
//class Property[T](instance: T)(implicit tttt:TypeTag[T]) {
// def getType = tttt.erasure
// val method: java.lang.reflect.Method = m.erasure.getDeclaredMethod(methodName)
//}

object App extends App{

  lazy val value = "Hello World"

  val model$ = DynamicClassLoader.loadClass("MyRecord$", MyRecord$Dump.dump()) //Load the object
  val model  = DynamicClassLoader.loadClass("MyRecord", MyRecordDump.dump()) //Then load the class

  def getType[T: TypeTag](obj: T) = typeOf[T]

  
  //val instance$ = model$.newInstance()
 // val apply$: Method = model$.getMethod("apply", classOf[String])
 // val applied =  apply$.invoke(instance$, "hello world")
  //println(tupled("Hello Tuple"))
  val annos = model.getAnnotations
  val scalaSigAnno = annos.head
  println(annos(0))
  annos.toList
  


  val ssig = scalaSigAnno.asInstanceOf[ScalaSignature]
  //val sSig = annos.getByteCode
  val b = ByteCodecs.decode(MyRecordDump.dump())
  println(b)
  
  val const = model.getConstructors.head
  val record = const.newInstance(value)//.asInstanceOf[AnyRef] 
  val classl = model.getClassLoader()
 // ScalaSigParser.parse(model.getClass)//.getOrElse(error("No ScalaSig for class " + cls.getName + ", make sure it is a top-level case class"))
  
  
  val mir = scala.reflect.runtime.universe.runtimeMirror(classl)
 
  
 // println(mir)

/*
val output = new FileWriter("/tmp/outputuni.txt")
output.write(mir.toString)
output.flush
*/
  //val record = mir.reflect(model)
///mir.TypeOf[]
 // val myRecord = model.cast(record).asInstanceOf[AnyRef]  //without cast, it's an Any
  println(record)
 // println(myRecord)
  val cls = record.getClass
  println(cls)
 // val non = record.reflectField(_)
  //println(non)
  //val parsed = ScalaSigParser.parse(annos)

    val t = getType(record)


  println(model)
  //println(model.typeSignature)
  println(scalaSigAnno.annotationType())

  //println(ssig)
  //val parsed = ScalaSigAttributeParsers.parse(ssig)

/*
  val scalaSig: ScalaSig = classFile.attribute(SCALA_SIG).map(_.byteCode).map(ScalaSigAttributeParsers.parse).get //match {
  // No entries in ScalaSig attribute implies that the signature is stored in the annotation
   val SCALA_SIG_ANNOTATION = "Lscala/reflect/ScalaSignature;"
   val BYTES_VALUE = "bytes"


  private def unpickleFromAnnotation(classFile: ClassFile, isPackageObject: Boolean): ScalaSig = {
    import classFile._
    classFile.annotation(SCALA_SIG_ANNOTATION) match {
      case None => null
      case Some(Annotation(_, elements)) =>
        val bytesElem = elements.find(elem => constant(elem.elementNameIndex) == BYTES_VALUE).get
        val bytes = ((bytesElem.elementValue match {
          case ConstValueIndex(index) => constantWrapped(index)
        }).asInstanceOf[StringBytesPair].bytes)
        val length = ByteCodecs.decode(bytes)
        val scalaSig = ScalaSigAttributeParsers.parse(ByteCode(bytes.take(length)))
        scalaSig
    }
  }

*/

//







  //val myRec = TypeName("C")
  //val foo = (VAL("pos", TYPE_REF(REF("board") DOT "Coord")): Tree)
  //println(foo)



println(t)
println(t.getClass)
 
  val instanceMirror = currentMirror.reflect(record)
  val classSymbol = instanceMirror.symbol
  val p = classSymbol.asType
  //val typeSymbol = p.asInstanceOf[typeSymbol]
  println(p)
  //println(p)
  val q = p.toType
  println(q)
  //val sym = classSymbol.asInstanceOf[scala.tools.scalap.scalax.rules.scalasig.Symbol]
  //type r = p//.type
  //println(classOf[r])
  val typeSig = classSymbol.typeSignature
  println(typeSig)
 
    println(p)
  
  //val meme = mir.showRaw

  
  //val existential = sym.newExistential(newTypeName("MyRecord"))
  //val typeSymbol = currentMirror.typeSymbol

   



 // val classType = typeSig.member("MyRecord": termName)
  //println(classType) 


  val baseHead = classSymbol.baseClasses.head
  println(baseHead)
  val typeP = classSymbol.typeParams
  println(typeP)
  println(reflectedClass)
  val typeCtor = p.annotations
  println(typeCtor)
  val raw = showRaw(p)
  
  println(p.companionSymbol)
 // println(classOf[p])
  //println(classOf[reflectedClass.type])
 println(typeSig.members)
println(raw)
 
println(showRaw(record))



def asHolder [T : TypeTag](x:T) = typeOf[T] ///////SOOO close, but Type Tag returns type as Any

val held = asHolder(record)
println(held)
println(show(held))
//println(typeSig)
val raws = showRaw(classSymbol)
type rawst = raws.type
//println(classOf[rawst])

 //val test1 = p.member(newTermName("MyDynamiceRecord")).asClass 
  ///type y = classSymbol.toType                             ///////////////////////Danger Volatile
 // println(classOf[y])
  
  //val z = typeOf[classSymbol.toType {val x: String}]   //////Also no go, volatile



  val isCaseClass = classSymbol.isCaseClass
    println(s"isCaseClass: $isCaseClass")
  //val classMirror = currentMirror.reflectClass(classSymbol)
  //println(classMirror)
  //val ty = classMirror.getType
  
 // val ty = instanceMirror.getType
  
  println(instanceMirror)
  //println(classSymbol)
 // type csym = classSymbol.type /////////////////// volatile
  //println(classOf[csym])
  println(isCaseClass)
  val recTermName = newTermName("MyRecord")

  val top = Select(This(newTypeName("scala")), newTermName("Predef"))
  val down = Select(top, newTermName("Predef"))
  val tree  = TypeApply(down,  List(Literal(Constant("""hello tree"""))))
 // val treeApplied  = TypeApply(top,  List(Ident(p)) )
  val treeApplied  = TypeApply(tree,  List(Ident(p)) )
  //val tree = Apply(Ident(recTermName), List(Literal(Constant("hello tree"))))
  

  val recTypeName = newTypeName("MyRecord")
  val myTree = Apply(Ident(recTypeName), List(Literal(Constant("hello tree"))))
 // println(applied)
  val mR = Ident(recTermName)

  println(mR)
 // type nR = mR.type////Volatile
 // println(classOf[nR])

 // val reified =  scala.reflect.runtime.universe.reify{record}
 // val reified =  scala.reflect.runtime.universe.reify{classSymbol}
 // val reified =  scala.reflect.runtime.universe.reify{model}
  val reified =  scala.reflect.runtime.universe.reify{case class MyRecord(x:String)}
  


  val tb = mir.mkToolBox()
  println(tb)
  println(showRaw(tb.parse("""MyRecord("hello")""")))
  //val ttree = typeCheck(tb.parse("""MyRecord("hello")"""))
  //println(ttree)
  ///val 
 
  
  val tipe = TypeRef(NoPrefix, classSymbol, List())

  

def printType[T : TypeTag](t: T) = typeOf[T]
  val typeTag = (printType(model)).asInstanceOf[AnyRef]
println(typeTag)                        ///TypeTags return any
  type typeTagType = typeTag.type
  val asSeen = tipe.asSeenFrom(NoPrefix, classSymbol)
  println(tipe)
  println(asSeen)

 //println(classOf[typeTagType])
  println(typeSig)


  //println(reified.splice)

def specialCopy(): Unit = {
//def specialCopy[T](): T = {
  val methodArity   = model.getDeclaredMethod("productArity")
  val methodElement = model.getMethod("productElement", classOf[Int])
  val productArity  = methodArity.invoke(record).asInstanceOf[Int]
  println(productArity)
 // println(model.msgType)

  val args = ((0 to productArity-1) map { i: Int =>
      (i match  {
        case j if j==productArity-3 =>
          new String

        case j if j==productArity-2 =>
          new String

        case _ =>
          // cast to the proper type of the unknown case class
          val callSite = model.cast(record)//record//.asInstanceOf[T]
          val param    = i.asInstanceOf[java.lang.Integer]
          val property = methodElement.invoke(callSite, param)
                 property
      }).asInstanceOf[Object]
    }).toSeq

    // case classes have exactly one constructor
    val constructor = model.getConstructors.head
    // cast to the proper type of the unknown case class
   // val newRec = constructor.newInstance(args:_*)//.asInstanceOf[T]
      val iCtor = constructor.newInstance(args:_*)//.asInstanceOf[T]
      val inst = model.cast(iCtor)

 println(constructor.getDeclaredAnnotations)
 val parTy = println(constructor.getGenericParameterTypes())
 println(parTy)
// println(constructor.getDeclaringClass.cast(record).length)  // After casting, record is still a ?0 

   
 // val recordCast = model.cast(newRec)
  val recordCast = model.cast(inst)
  println(recordCast.getClass)
  println(recordCast)
  //println(recordCast.length) // Same problem, is still an Any after cast

//println(classOf[newRec])

println(classSymbol.typeSignature)
  }
 specialCopy()



 // println(tree)
  println(myTree.tpe)
  //println(treeApplied)
  val ident = Ident(p)
  println(ident)
  //println(classOf[ident])
  //println(record.actualType)
//abstract class myRecord extends typeTagType

  println(reified)
  val reTree = reified.tree
  //println(reTree)
 // println(showRaw(reTree))

  val typeCheck = tb.typeCheck(reTree)
  //println()
   println(typeCheck.tpe)
println(tb.eval(reTree).getClass)
//println(tb.compile(reTree))
//println(tb.eval(reTree))
println(tb.inferImplicitValue(typeCheck.tpe))
 // val parsed = tb.parse("case class MyRecord(x:String)")
  //val parsed = tb.parse("""object Hello extends App{val hi = "hi";println(hi)}""")
//  val parsed = tb.parse("println(2)")
  val parsed = tb.parse("class MyRecord{}")
  println(parsed)
  val parsedTypeCheck = tb.typeCheck(parsed)
println(parsedTypeCheck.tpe)
println(parsedTypeCheck.symbol)
//println(tb.compile(parsed))
//println(tb.compile(parsed).apply)
  //val recType = typeOf[MyRecord]
//println(recType.member(newTermName("MyRecord")))
println(tb.eval(parsed))


//val cass = {case class MyRec(x:String)}
//println(classOf[Any])
 // val nom = MyRecord("Hi")
  //val castRecord = MyRecord.cast(record)//Using the real case class returns a MyRecord Type

 // val castRecord = model.cast(record)  /////Should return a MyRecord, but when castRecord is used  its an Any
// println(castRecord)
// println(castRecord.getClass)
//println(castRecord.length)



specialCopy()

val reflectedClass = mir.reflectClass(classSymbol)
println(reflectedClass)
println(instanceMirror)
//val testCast = record.asInstanceOf[MyRecord]
//println(testCast)

//val testRec = MyRecord("hello")
val ttt = scala.reflect.runtime.universe.typeTag[MyRecordX]
println(ttt)
val typO = typeOf[MyRecordX]
val typeO = typO.members
println(typeO)

//val Rrecord = scala.reflect.runtime.universe.reify[MyRecordX]({case class MyRecord(x:String)})

  //val writer = new PrintWriter(new File("test2.txt" ))
     // writer.write(typeCheck.toString)
     // writer.close()
type myRecordEx = MyRecordX
//type myInstance = instance$.type//.asInstanceOf[AnyRef]
//val duh = instance$.asInstanceOf[AnyRef]
//type dat = duh.type
val rect = record.asInstanceOf[AnyRef]
type recT = rect.type
println(MyRecordX.getClass)
//println(instance$.getClass)
println(classTag[myRecordEx])
println(classTag[recT])

//class faker extends myRecordEx(value)
class faker extends MyRecordY(value)
//val fake = new faker
println(classOf[faker])

 
// val supcast = record.asInstanceOf[MyRecordX]

//println(p.tpe)
  //println(classSymbol.getAnnotation)

  //val instance$ = model$.newInstance().asInstanceOf[AnyRef]

  //val method: Method = model$.getMethod("apply", classOf[Object])
  //val invoked = method.invoke(instance$, "Hi")
 // println(invoked)

 // val method: Method = model$.getMethod("<init>")

 //   val method: Method = model.getMethod("gd1$1", classOf[String])
    

 // val readResolve: Method = model$.getMethod("readResolve")
 // val resolved = readResolve.invoke(instance$)
 // println(resolved)

 // val method: Method = model.getMethod("copy", classOf[String])
 // val invoked = method.invoke(null, classOf[instance$])

 // val method: Method = model.getMethod("productElement", classOf[Int])
 // val invoked = method.invoke()
 // val method: Method = model.getMethod("<init>", classOf[String])
 // val method: Method = model$.getMethod("<clinit>")
 // val method: Method = model$.getMethod("unapply", classOf[_])
 // val method: Method = model.getMethod("x", classOf[String])
 // val method: Method = model.getMethod("productIterator", [], classOf[Iterator[Object]])
 // val method: Method = model.getMethod("andThen", classOf[Function1[_,_]])





}

