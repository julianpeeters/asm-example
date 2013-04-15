asm-example
===========

A few examples of objectweb's ASM, a Java bytecode library. Trying out the ASMifier to run 'HelloWorld' programs from bytecode in both Scala and Java in sbt.


1) Put objectWeb's ASM jar in the sbt project's 'lib' directory.
2) Run the ASMifier from the sbt project's home directory: 
    `$ java -cp lib/asm-all-4.1.jar org.objectweb.asm.util.ASMifier B.class>BDump.java`
3) Modify the output "dump" file as needed, e.g.: `import org.objectweb.asm.attrs.*;` doesn't seem to be in asm-all-4.1.jar, so I comment it out, and it works but I don't know why.
4) 
This is the Java example.  Please check the branches for examples in each language.

