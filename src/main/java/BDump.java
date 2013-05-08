import java.util.*;
import org.objectweb.asm.*;
//import org.objectweb.asm.attrs.*;
public class BDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter cw = new ClassWriter(0);
FieldVisitor fv;
MethodVisitor mv;
AnnotationVisitor av0;

cw.visit(V1_6, ACC_PUBLIC + ACC_SUPER, "B", null, "DynamicBase", null);

{
av0 = cw.visitAnnotation("Lscala/reflect/ScalaSignature;", true);
av0.visit("bytes", "\u0006\u0001m1A!\u0001\u0002\u0001\u000b\u0009\u0009!IC\u0001\u0004\u0003\u001daT-\u001c9usz\u001a\u0001a\u0005\u0002\u0001\rA\u0011q\u0001C\u0007\u0002\u0005%\u0011\u0011B\u0001\u0002\u000c\u0009ft\u0017-\\5d\u0005\u0006\u001cX\rC\u0003\u000c\u0001\u0011\u0005A\"\u0001\u0004=S:LGO\u0010\u000b\u0002\u001bA\u0011q\u0001\u0001\u0005\u0008\u001f\u0001\u0011\r\u0011\"\u0001\u0011\u0003\u0015AW\r\u001c7p+\u0005\u0009\u0002C\u0001\n\u0018\u001b\u0005\u0019\"B\u0001\u000b\u0016\u0003\u0011a\u0017M\\4\u000b\u0003Y\u0009AA[1wC&\u0011\u0001d\u0005\u0002\u0007'R\u0014\u0018N\\4\u0009\ri\u0001\u0001\u0015!\u0003\u0012\u0003\u0019AW\r\u001c7pA\u0001");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "hello", "Ljava/lang/String;", null, null);
fv.visitEnd();
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
mv.visitMethodInsn(INVOKESPECIAL, "DynamicBase", "<init>", "()V");
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
