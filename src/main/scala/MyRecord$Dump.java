//package models;
import java.util.*;
import org.objectweb.asm.*;
//import org.objectweb.asm.attrs.*;
public class MyRecord$Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter cw = new ClassWriter(0);
FieldVisitor fv;
MethodVisitor mv;
AnnotationVisitor av0;

cw.visit(V1_5, ACC_PUBLIC + ACC_FINAL + ACC_SUPER, "MyRecord$", null, "scala/runtime/AbstractFunction1", new String[] { "scala/ScalaObject", "scala/Serializable" });

// ATTRIBUTE Scala
{
fv = cw.visitField(ACC_PUBLIC + ACC_FINAL + ACC_STATIC, "MODULE$", "LMyRecord$;", null, null);
fv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_STATIC, "<clinit>", "()V", null, null);
mv.visitCode();
mv.visitTypeInsn(NEW, "MyRecord$");
mv.visitMethodInsn(INVOKESPECIAL, "MyRecord$", "<init>", "()V");
mv.visitInsn(RETURN);
mv.visitMaxs(1, 0);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_FINAL, "toString", "()Ljava/lang/String;", null, null);
mv.visitCode();
mv.visitLdcInsn("MyRecord");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "unapply", "(LMyRecord;)Lscala/Option;", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 1);
Label l0 = new Label();
mv.visitJumpInsn(IFNONNULL, l0);
mv.visitFieldInsn(GETSTATIC, "scala/None$", "MODULE$", "Lscala/None$;");
Label l1 = new Label();
mv.visitJumpInsn(GOTO, l1);
mv.visitLabel(l0);
mv.visitTypeInsn(NEW, "scala/Some");
mv.visitInsn(DUP);
mv.visitVarInsn(ALOAD, 1);
mv.visitMethodInsn(INVOKEVIRTUAL, "MyRecord", "x", "()Ljava/lang/String;");
mv.visitMethodInsn(INVOKESPECIAL, "scala/Some", "<init>", "(Ljava/lang/Object;)V");
mv.visitLabel(l1);
mv.visitInsn(ARETURN);
mv.visitMaxs(3, 2);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "apply", "(Ljava/lang/String;)LMyRecord;", null, null);
mv.visitCode();
mv.visitTypeInsn(NEW, "MyRecord");
mv.visitInsn(DUP);
mv.visitVarInsn(ALOAD, 1);
mv.visitMethodInsn(INVOKESPECIAL, "MyRecord", "<init>", "(Ljava/lang/String;)V");
mv.visitInsn(ARETURN);
mv.visitMaxs(3, 2);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "readResolve", "()Ljava/lang/Object;", null, null);
mv.visitCode();
mv.visitFieldInsn(GETSTATIC, "MyRecord$", "MODULE$", "LMyRecord$;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_BRIDGE, "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitVarInsn(ALOAD, 1);
mv.visitTypeInsn(CHECKCAST, "java/lang/String");
mv.visitMethodInsn(INVOKEVIRTUAL, "MyRecord$", "apply", "(Ljava/lang/String;)LMyRecord;");
mv.visitInsn(ARETURN);
mv.visitMaxs(2, 2);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKESPECIAL, "scala/runtime/AbstractFunction1", "<init>", "()V");
mv.visitVarInsn(ALOAD, 0);
mv.visitFieldInsn(PUTSTATIC, "MyRecord$", "MODULE$", "LMyRecord$;");
mv.visitInsn(RETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
cw.visitEnd();

return cw.toByteArray();
}
}
