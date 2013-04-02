import java.util.*;
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
av0.visit("bytes", "\u0006\u00015:Q!\u0001\u0002\u0009\u0006\u0015\u0009!\u0002S3mY>\u001c6-\u00197b\u0015\u0005\u0019\u0011a\u0002\u001ff[B$\u0018PP\u0002\u0001!\u00091q!D\u0001\u0003\r\u0015A!\u0001#\u0002\n\u0005)AU\r\u001c7p'\u000e\u000cG.Y\n\u0004\u000f)\u0011\u0002CA\u0006\u0011\u001b\u0005a!BA\u0007\u000f\u0003\u0011a\u0017M\\4\u000b\u0003=\u0009AA[1wC&\u0011\u0011\u0003\u0004\u0002\u0007\u001f\nTWm\u0019;\u0011\u0005M1R\"\u0001\u000b\u000b\u0003U\u0009Qa]2bY\u0006L!a\u0006\u000b\u0003\u0017M\u001b\u0017\r\\1PE*,7\r\u001e\u0005\u00063\u001d!\u0009AG\u0001\u0007y%t\u0017\u000e\u001e \u0015\u0003\u0015AQ\u0001H\u0004\u0005\u0002u\u0009A!\\1j]R\u0011a$\u0009\u0009\u0003'}I!\u0001\u0009\u000b\u0003\u0009Us\u0017\u000e\u001e\u0005\u0006Em\u0001\raI\u0001\u0005CJ<7\u000fE\u0002\u0014I\u0019J!!\n\u000b\u0003\u000b\u0005\u0013(/Y=\u0011\u0005\u001dRcBA\n)\u0013\u0009IC#\u0001\u0004Qe\u0016$WMZ\u0005\u0003W1\u0012aa\u0015;sS:<'BA\u0015\u0015\u0001");
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
cw.visitEnd();

return cw.toByteArray();
}
}
