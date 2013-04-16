import java.lang.reflect.*;
import org.objectweb.asm.*;
class E {
  String Hello = "Hello!";
}

public class C {
  public static void main (String[] args) throws Exception {
    //normal usage
    E e = new E();
      System.out.println(e.Hello);
 
    //ASM generated + reflection
    Class<?> D = DynamicClassLoader.loadClass("D", DDump.dump());   //load the class	
    Constructor<?> ctor = D.getDeclaredConstructor();
    //D d = ctor.newInstance();  //Error, "cannot find symbol: class D"
    Object d = ctor.newInstance();
      //System.out.println(d.hello); //Doesn't work, hello is not a variable of Object (how do I cast to D?)

    //since d's type is an object, not a D, I can only access its `hello` variable via further reflection?
    Field hello = D.getDeclaredField("hello");
    Object Dfield = hello.get(d);
      System.out.println(Dfield);
      System.out.println(org.objectweb.asm.Type.getType(d.getClass()));//the type is there, how to cast to it?
  }
}
