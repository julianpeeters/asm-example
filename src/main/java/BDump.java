import java.util.*;
import org.objectweb.asm.*;
//import org.objectweb.asm.attrs.*;
public class BDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter cw = new ClassWriter(0);
FieldVisitor fv;
MethodVisitor mv;
AnnotationVisitor av0;

cw.visit(V1_6, ACC_PUBLIC + ACC_SUPER, "B", null, "java/lang/Object", new String[] { "A" });

{
av0 = cw.visitAnnotation("Lscala/reflect/ScalaSignature;", true);
av0.visit("bytes", "\u0006\u0001\u00052A!\u0001\u0002\u0001\u000b\u0009\u0009!IC\u0001\u0004\u0003\u001daT-\u001c9usz\u001a\u0001aE\u0002\u0001\r1\u0001\"a\u0002\u0006\u000e\u0003!Q\u0011!C\u0001\u0006g\u000e\u000cG.Y\u0005\u0003\u0017!\u0011a!\u00118z%\u00164\u0007CA\u0007\u000f\u001b\u0005\u0011\u0011BA\u0008\u0003\u0005\u0005\u0009\u0005\"B\u0009\u0001\u0009\u0003\u0011\u0012A\u0002\u001fj]&$h\u0008F\u0001\u0014!\u0009i\u0001\u0001C\u0004\u0016\u0001\u0009\u0007I\u0011\u0001\u000c\u0002\u000b!,G\u000e\\8\u0016\u0003]\u0001\"\u0001G\u000f\u000e\u0003eQ!AG\u000e\u0002\u00091\u000cgn\u001a\u0006\u00029\u0005!!.\u0019<b\u0013\u0009q\u0012D\u0001\u0004TiJLgn\u001a\u0005\u0007A\u0001\u0001\u000b\u0011B\u000c\u0002\r!,G\u000e\\8!\u0001");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "hello", "Ljava/lang/String;", null, null);
fv.visitEnd();
}
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "hi", "Ljava/lang/String;", null, null);
fv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "hi", "()Ljava/lang/String;", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitFieldInsn(GETFIELD, "B", "hi", "Ljava/lang/String;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "A$_setter_$hi_$eq", "(Ljava/lang/String;)V", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitVarInsn(ALOAD, 1);
mv.visitFieldInsn(PUTFIELD, "B", "hi", "Ljava/lang/String;");
mv.visitInsn(RETURN);
mv.visitMaxs(2, 2);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "hello", "()Ljava/lang/String;", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitFieldInsn(GETFIELD, "B", "hello", "Ljava/lang/String;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V");
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKESTATIC, "A$class", "$init$", "(LA;)V");
mv.visitVarInsn(ALOAD, 0);
mv.visitLdcInsn("Hello B!");
mv.visitFieldInsn(PUTFIELD, "B", "hello", "Ljava/lang/String;");
mv.visitInsn(RETURN);
mv.visitMaxs(2, 1);
mv.visitEnd();
}
cw.visitEnd();

return cw.toByteArray();
}
}
