import java.util.*;
import org.objectweb.asm.*;
//import org.objectweb.asm.attrs.*;
public class DDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter cw = new ClassWriter(0);
FieldVisitor fv;
MethodVisitor mv;
AnnotationVisitor av0;

cw.visit(V1_6, ACC_SUPER, "D", null, "java/lang/Object", null);

{
fv = cw.visitField(0, "hello", "Ljava/lang/String;", null, null);
fv.visitEnd();
}
{
mv = cw.visitMethod(0, "<init>", "()V", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V");
mv.visitVarInsn(ALOAD, 0);
mv.visitLdcInsn("hello");
mv.visitFieldInsn(PUTFIELD, "D", "hello", "Ljava/lang/String;");
mv.visitInsn(RETURN);
mv.visitMaxs(2, 1);
mv.visitEnd();
}
cw.visitEnd();

return cw.toByteArray();
}
 
}
