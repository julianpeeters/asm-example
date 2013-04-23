import java.util.*;
import org.objectweb.asm.*;
//import org.objectweb.asm.attrs.*;
public class BDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter cw = new ClassWriter(0);
FieldVisitor fv;
MethodVisitor mv;
AnnotationVisitor av0;

cw.visit(V1_6, ACC_PUBLIC + ACC_SUPER, "B", null, "java/lang/Object", null);

{
av0 = cw.visitAnnotation("Lscala/reflect/ScalaSignature;", true);
av0.visit("bytes", "\u0006\u0001y1A!\u0001\u0002\u0001\u000b\u0009\u0009!IC\u0001\u0004\u0003\u001daT-\u001c9usz\u001a\u0001a\u0005\u0002\u0001\rA\u0011qAC\u0007\u0002\u0011)\u0009\u0011\"A\u0003tG\u0006d\u0017-\u0003\u0002\u000c\u0011\u00091\u0011I\\=SK\u001aDQ!\u0004\u0001\u0005\u00029\u0009a\u0001P5oSRtD#A\u0008\u0011\u0005A\u0001Q\"\u0001\u0002\u0009\u000fI\u0001!\u0019!C\u0001'\u0005)\u0001.\u001a7m_V\u0009A\u0003\u0005\u0002\u001655\u0009aC\u0003\u0002\u00181\u0005!A.\u00198h\u0015\u0005I\u0012\u0001\u00026bm\u0006L!a\u0007\u000c\u0003\rM#(/\u001b8h\u0011\u0019i\u0002\u0001)A\u0005)\u00051\u0001.\u001a7m_\u0002\u0002");
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
mv.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V");
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
