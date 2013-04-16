import java.util.*;
import java.lang.reflect.*;
import org.objectweb.asm.*;
//import org.objectweb.asm.attrs.*;

public class HelloDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter cw = new ClassWriter(0);
FieldVisitor fv;
MethodVisitor mv;
AnnotationVisitor av0;

cw.visit(V1_6, ACC_PUBLIC + ACC_SUPER, "Hello", null, "java/lang/Object", null);

{
mv = cw.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V");
mv.visitInsn(RETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_STATIC, "main", "([Ljava/lang/String;)V", null, null);
mv.visitCode();
mv.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
mv.visitLdcInsn("Hello");
mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V");
mv.visitInsn(RETURN);
mv.visitMaxs(2, 1);
mv.visitEnd();
}
cw.visitEnd();

return cw.toByteArray();
}

  private static Class loadClass(String className, byte[] b) {
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

  public static void main(String[] args) throws Exception {
     Class<?> c = loadClass("Hello", dump());   //load the class
     try {
       Method mainMethod = c.getMethod("main", String[].class);  //Get the main method
       mainMethod.invoke(null, (Object) new String[]{});        //and invoke it to run the spoofed program
     } catch (Exception e) {
      e.printStackTrace();
      System.exit(1);
     }
  }
}
