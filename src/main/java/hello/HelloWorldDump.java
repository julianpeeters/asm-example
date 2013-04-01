import java.util.*;
import java.lang.reflect.*;
import org.objectweb.asm.*;
//import org.objectweb.asm.attrs.*; //needed to comment this line out in order to compile
public class HelloWorldDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter cw = new ClassWriter(0);
FieldVisitor fv;
MethodVisitor mv;
AnnotationVisitor av0;

cw.visit(V1_6, ACC_PUBLIC + ACC_SUPER, "HelloWorld", null, "java/lang/Object", null);

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

//Adding it's own dynamic classloader to the dump class
public static class DynamicClassLoader extends ClassLoader {
        public Class<?> define(String className, byte[] bytecode) {
            return super.defineClass(className, bytecode, 0, bytecode.length);
        }
    };

    public static void main(String[] args) throws Exception {
        DynamicClassLoader loader = new DynamicClassLoader();
        Class<?> helloWorldClass = loader.define("HelloWorld", dump());
        Method method = helloWorldClass.getMethod("main", String[].class);
        method.invoke(null, (Object) new String[] {});
    }
}
