import java.util.*;
import org.objectweb.asm.*;
import org.objectweb.asm.attrs.*;
public class BDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter cw = new ClassWriter(0);
FieldVisitor fv;
MethodVisitor mv;
AnnotationVisitor av0;

cw.visit(V1_6, ACC_SUPER, "B", null, "java/lang/Object", null);

{
mv = cw.visitMethod(0, "<init>", "()V", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V");
mv.visitInsn(RETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_STATIC, "hi", "()V", null, null);
mv.visitCode();
mv.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
mv.visitLdcInsn("hi");
mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V");
mv.visitInsn(RETURN);
mv.visitMaxs(2, 0);
mv.visitEnd();
}
cw.visitEnd();

return cw.toByteArray();
}
}
