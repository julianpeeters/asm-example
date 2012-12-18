import java.util.*;
import java.lang.reflect.*;
import org.objectweb.asm.*;
//import org.objectweb.asm.attrs.*;
public class HelloScalaOBJDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter cw = new ClassWriter(0);
FieldVisitor fv;
MethodVisitor mv;
AnnotationVisitor av0;

cw.visit(V1_5, ACC_PUBLIC + ACC_FINAL + ACC_SUPER, "HelloScala$", null, "java/lang/Object", new String[] { "scala/App", "scala/ScalaObject" });

// ATTRIBUTE Scala
cw.visitInnerClass("HelloScala$delayedInit$body", "HelloScala", "delayedInit$body", ACC_PUBLIC + ACC_FINAL + ACC_STATIC);

{
fv = cw.visitField(ACC_PUBLIC + ACC_FINAL + ACC_STATIC, "MODULE$", "LHelloScala$;", null, null);
fv.visitEnd();
}
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "executionStart", "J", null, null);
fv.visitEnd();
}
{
fv = cw.visitField(ACC_PRIVATE, "scala$App$$_args", "[Ljava/lang/String;", null, null);
fv.visitEnd();
}
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "scala$App$$initCode", "Lscala/collection/mutable/ListBuffer;", "Lscala/collection/mutable/ListBuffer<Lscala/Function0<Lscala/runtime/BoxedUnit;>;>;", null);
fv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_STATIC, "<clinit>", "()V", null, null);
mv.visitCode();
mv.visitTypeInsn(NEW, "HelloScala$");
mv.visitMethodInsn(INVOKESPECIAL, "HelloScala$", "<init>", "()V");
mv.visitInsn(RETURN);
mv.visitMaxs(1, 0);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_BRIDGE, "executionStart", "()J", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitFieldInsn(GETFIELD, "HelloScala$", "executionStart", "J");
mv.visitInsn(LRETURN);
mv.visitMaxs(2, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_FINAL + ACC_BRIDGE, "scala$App$$_args", "()[Ljava/lang/String;", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitFieldInsn(GETFIELD, "HelloScala$", "scala$App$$_args", "[Ljava/lang/String;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_FINAL + ACC_BRIDGE, "scala$App$$_args_$eq", "([Ljava/lang/String;)V", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitVarInsn(ALOAD, 1);
mv.visitFieldInsn(PUTFIELD, "HelloScala$", "scala$App$$_args", "[Ljava/lang/String;");
mv.visitInsn(RETURN);
mv.visitMaxs(2, 2);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_FINAL + ACC_BRIDGE, "scala$App$$initCode", "()Lscala/collection/mutable/ListBuffer;", "()Lscala/collection/mutable/ListBuffer<Lscala/Function0<Lscala/runtime/BoxedUnit;>;>;", null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitFieldInsn(GETFIELD, "HelloScala$", "scala$App$$initCode", "Lscala/collection/mutable/ListBuffer;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_BRIDGE, "scala$App$_setter_$executionStart_$eq", "(J)V", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitVarInsn(LLOAD, 1);
mv.visitFieldInsn(PUTFIELD, "HelloScala$", "executionStart", "J");
mv.visitInsn(RETURN);
mv.visitMaxs(3, 3);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_BRIDGE, "scala$App$_setter_$scala$App$$initCode_$eq", "(Lscala/collection/mutable/ListBuffer;)V", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitVarInsn(ALOAD, 1);
mv.visitFieldInsn(PUTFIELD, "HelloScala$", "scala$App$$initCode", "Lscala/collection/mutable/ListBuffer;");
mv.visitInsn(RETURN);
mv.visitMaxs(2, 2);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_BRIDGE, "args", "()[Ljava/lang/String;", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKESTATIC, "scala/App$class", "args", "(Lscala/App;)[Ljava/lang/String;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_BRIDGE, "delayedInit", "(Lscala/Function0;)V", "(Lscala/Function0<Lscala/runtime/BoxedUnit;>;)V", null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitVarInsn(ALOAD, 1);
mv.visitMethodInsn(INVOKESTATIC, "scala/App$class", "delayedInit", "(Lscala/App;Lscala/Function0;)V");
mv.visitInsn(RETURN);
mv.visitMaxs(2, 2);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_BRIDGE, "main", "([Ljava/lang/String;)V", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitVarInsn(ALOAD, 1);
mv.visitMethodInsn(INVOKESTATIC, "scala/App$class", "main", "(Lscala/App;[Ljava/lang/String;)V");
mv.visitInsn(RETURN);
mv.visitMaxs(2, 2);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V");
mv.visitVarInsn(ALOAD, 0);
mv.visitFieldInsn(PUTSTATIC, "HelloScala$", "MODULE$", "LHelloScala$;");
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKESTATIC, "scala/App$class", "$init$", "(Lscala/App;)V");
mv.visitVarInsn(ALOAD, 0);
mv.visitTypeInsn(NEW, "HelloScala$delayedInit$body");
mv.visitInsn(DUP);
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKESPECIAL, "HelloScala$delayedInit$body", "<init>", "(LHelloScala$;)V");
mv.visitMethodInsn(INVOKEINTERFACE, "scala/DelayedInit", "delayedInit", "(Lscala/Function0;)V");
mv.visitInsn(RETURN);
mv.visitMaxs(4, 1);
mv.visitEnd();
}
cw.visitEnd();

return cw.toByteArray();
}

    public static class DynamicClassLoader extends ClassLoader {
        public Class<?> define(String className, byte[] bytecode) {
            return super.defineClass(className, bytecode, 0, bytecode.length);
        }
    };

    public static void main(String[] args) throws Exception {
        DynamicClassLoader loader = new DynamicClassLoader();
        Class<?> helloWorldClass = loader.define("HelloScala$", dump());
        Method method = helloWorldClass.getMethod("main", String[].class);
        method.invoke(null, (Object) new String[] {});
    }



}
