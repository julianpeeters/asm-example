import java.lang.reflect.*;
/*
class B {
  static String hello = "hello";
}
*/
public class A extends B{
  public static void main (String[] args) throws Exception {
   // System.out.println(hello);
    Class<?> cls = DynamicClassLoader.loadClass("B", BDump.dump());   //load the class	

  }
}
