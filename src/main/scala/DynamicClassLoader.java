//package models;
import java.lang.reflect.*;

public class DynamicClassLoader {
/*
  public static void main (String[] args)  {
    System.out.println("hello");
    try {
      Class<?> c$ = loadClass("MyRecord$", MyRecord$Dump.dump()); //First load the "anonymous" class
      Class<?> c = loadClass("MyRecord", MyRecordDump.dump());   //Then load the "real" class
    //println(c.x);
      Method ap = c$.getDeclaredMethod("apply", String.class);  //Get the main method of the "real" class
    //  ap.invoke(null, (Object) new String[]{});        //and invoke it to run the spoofed program
      //ap.invoke(null, (String) new String(){});
      System.out.println(ap.getDeclaringClass());
      System.out.println(ap.getParameterTypes());
      System.out.println(ap.getGenericReturnType());
     // ap.invoke(MyRecord, "hi");
    } catch (Exception e) {
      e.printStackTrace();
      System.exit(1);
    }
  }
*/
  public static Class<?> loadClass(String className, byte[] b)  {
    //override classDefine (as it is protected) and define the class.
    Class<?> clazz = null;
    try {
     // ClassLoader loader = ClassLoader.getSystemClassLoader();
      ClassLoader loader = Thread.currentThread().getContextClassLoader();
      Class<?> cls = Class.forName("java.lang.ClassLoader");
      Method method = cls.getDeclaredMethod("defineClass", new Class[] { String.class, byte[].class, int.class, int.class });

        // protected method invocaton
      method.setAccessible(true);
      try {
        Object[] args = new Object[] { className, b, new Integer(0), new Integer(b.length)};
        clazz = (Class) method.invoke(loader, args);
     } finally {
        method.setAccessible(false);
      }
    } catch (Exception e) {
      e.printStackTrace();
      System.exit(1);
    }
    return clazz;
  }
}

