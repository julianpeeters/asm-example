asm-example
===========

A few examples of objectweb's asm, a java bytecode library. Trying out the ASMifier to run HelloWorlds from bytecode in both Scala and Java.

This is the Java example in sbt.  Please check the branches for other examples.

Put objectWeb's ASM jar in the sbt project's 'lib' directory.
Run the ASMifier from the sbt project's home directory: 

1) Create an sbt project, then create and run a simple 'HelloWorld.java'.
2) Use the ASMifier on the generated .class by first putting objectWeb's ASM jar in the sbt project's 'lib' directory, and then running the ASMifier from the sbt project's home directory: 
    `$ java -cp lib/asm-all-4.1.jar org.objectweb.asm.util.ASMifier target/scala-2.9.1/classes/Hello.class>HelloDump.java` 
3) To run the class, place the bytecode-generating 'dump' files in `src\` and provide a `ClassLoader` and `main` method that loads the class and invokes the `main` method of the spoofed class.

