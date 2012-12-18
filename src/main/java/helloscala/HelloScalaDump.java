import java.util.*;
import java.lang.reflect.*;
import org.objectweb.asm.*;
//import org.objectweb.asm.attrs.*;
public class HelloScalaDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter cw = new ClassWriter(0);
FieldVisitor fv;
MethodVisitor mv;
AnnotationVisitor av0;

cw.visit(V1_5, ACC_PUBLIC + ACC_FINAL + ACC_SUPER, "HelloScala", null, "java/lang/Object", null);

{
av0 = cw.visitAnnotation("Lscala/reflect/ScalaSignature;", true);
av0.visit("bytes", "\u0006\u0001y9Q!\u0001\u0002\u0009\u0006\u0015\u0009!\u0002S3mY>\u001c6-\u00197b\u0015\u0005\u0019\u0011a\u0002\u001ff[B$\u0018PP\u0002\u0001!\u00091q!D\u0001\u0003\r\u0015A!\u0001#\u0002\n\u0005)AU\r\u001c7p'\u000e\u000cG.Y\n\u0005\u000f)\u0011\u0002\u0004\u0005\u0002\u000c!5\u0009AB\u0003\u0002\u000e\u001d\u0005!A.\u00198h\u0015\u0005y\u0011\u0001\u00026bm\u0006L!!\u0005\u0007\u0003\r=\u0013'.Z2u!\u0009\u0019b#D\u0001\u0015\u0015\u0005)\u0012!B:dC2\u000c\u0017BA\u000c\u0015\u0005\r\u0009\u0005\u000f\u001d\u0009\u0003'eI!A\u0007\u000b\u0003\u0017M\u001b\u0017\r\\1PE*,7\r\u001e\u0005\u00069\u001d!\u0009!H\u0001\u0007y%t\u0017\u000e\u001e \u0015\u0003\u0015\u0001");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_FINAL + ACC_STATIC, "main", "([Ljava/lang/String;)V", null, null);
mv.visitCode();
mv.visitFieldInsn(GETSTATIC, "HelloScala$", "MODULE$", "LHelloScala$;");
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "HelloScala$", "main", "([Ljava/lang/String;)V");
mv.visitInsn(RETURN);
mv.visitMaxs(2, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_FINAL + ACC_STATIC, "delayedInit", "(Lscala/Function0;)V", "(Lscala/Function0<Lscala/runtime/BoxedUnit;>;)V", null);
mv.visitCode();
mv.visitFieldInsn(GETSTATIC, "HelloScala$", "MODULE$", "LHelloScala$;");
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "HelloScala$", "delayedInit", "(Lscala/Function0;)V");
mv.visitInsn(RETURN);
mv.visitMaxs(2, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_FINAL + ACC_STATIC, "args", "()[Ljava/lang/String;", null, null);
mv.visitCode();
mv.visitFieldInsn(GETSTATIC, "HelloScala$", "MODULE$", "LHelloScala$;");
mv.visitMethodInsn(INVOKEVIRTUAL, "HelloScala$", "args", "()[Ljava/lang/String;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 0);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_FINAL + ACC_STATIC, "scala$App$_setter_$scala$App$$initCode_$eq", "(Lscala/collection/mutable/ListBuffer;)V", null, null);
mv.visitCode();
mv.visitFieldInsn(GETSTATIC, "HelloScala$", "MODULE$", "LHelloScala$;");
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "HelloScala$", "scala$App$_setter_$scala$App$$initCode_$eq", "(Lscala/collection/mutable/ListBuffer;)V");
mv.visitInsn(RETURN);
mv.visitMaxs(2, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_FINAL + ACC_STATIC, "scala$App$_setter_$executionStart_$eq", "(J)V", null, null);
mv.visitCode();
mv.visitFieldInsn(GETSTATIC, "HelloScala$", "MODULE$", "LHelloScala$;");
mv.visitVarInsn(LLOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "HelloScala$", "scala$App$_setter_$executionStart_$eq", "(J)V");
mv.visitInsn(RETURN);
mv.visitMaxs(3, 2);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_FINAL + ACC_STATIC, "scala$App$$initCode", "()Lscala/collection/mutable/ListBuffer;", "()Lscala/collection/mutable/ListBuffer<Lscala/Function0<Lscala/runtime/BoxedUnit;>;>;", null);
mv.visitCode();
mv.visitFieldInsn(GETSTATIC, "HelloScala$", "MODULE$", "LHelloScala$;");
mv.visitMethodInsn(INVOKEVIRTUAL, "HelloScala$", "scala$App$$initCode", "()Lscala/collection/mutable/ListBuffer;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 0);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_FINAL + ACC_STATIC, "scala$App$$_args_$eq", "([Ljava/lang/String;)V", null, null);
mv.visitCode();
mv.visitFieldInsn(GETSTATIC, "HelloScala$", "MODULE$", "LHelloScala$;");
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "HelloScala$", "scala$App$$_args_$eq", "([Ljava/lang/String;)V");
mv.visitInsn(RETURN);
mv.visitMaxs(2, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_FINAL + ACC_STATIC, "scala$App$$_args", "()[Ljava/lang/String;", null, null);
mv.visitCode();
mv.visitFieldInsn(GETSTATIC, "HelloScala$", "MODULE$", "LHelloScala$;");
mv.visitMethodInsn(INVOKEVIRTUAL, "HelloScala$", "scala$App$$_args", "()[Ljava/lang/String;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 0);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_FINAL + ACC_STATIC, "executionStart", "()J", null, null);
mv.visitCode();
mv.visitFieldInsn(GETSTATIC, "HelloScala$", "MODULE$", "LHelloScala$;");
mv.visitMethodInsn(INVOKEVIRTUAL, "HelloScala$", "executionStart", "()J");
mv.visitInsn(LRETURN);
mv.visitMaxs(2, 0);
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
        Class<?> helloWorldClass = loader.define("HelloScala", dump());
        Method method = helloWorldClass.getMethod("main", String[].class);
        method.invoke(null, (Object) new String[] {});
    }


}
