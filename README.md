asm-example
===========

A few examples of objectweb's ASM, a Java bytecode library. Trying out the ASMifier to run 'HelloWorld' programs from bytecode in both Scala and Java in sbt.

To Reproduce this example, `git clone` into your local repository, *or*:

1) Create an sbt project, then create and run a simple 'HelloWorld.scala'.
2) Use the ASMifier on the generated .class files by putting objectWeb's ASM jar in the sbt project's 'lib' directory, and running the ASMifier from the sbt project's home directory: 
    `$ java -cp lib/asm-all-4.1.jar org.objectweb.asm.util.ASMifier target/scala-2.9.1/classes/HelloScala.class>HelloScalaDump.java` 
And on the 'anonymous' class:
    `$ java -cp lib/asm-all-4.1.jar org.objectweb.asm.util.ASMifier target/scala-2.9.1/classes/HelloScala$.class>HelloScala$Dump.java`
3) `import org.objectweb.asm.attrs.*;` doesn't seem to be in asm-all-4.1.jar, so I comment it out in both 'dump' files, and it works but I don't know why.

4) To run the classes, place the bytecode-generating 'dump' files in `src\` and provide a `ClassLoader` and `main` method that loads the classes and invokes the `main` method of the spoofed class.

