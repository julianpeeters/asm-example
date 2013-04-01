asm-example
===========

A few examples of objectweb's ASM, a Java bytecode library. Trying out the ASMifier to run 'HelloWorld' programs from bytecode in both Scala and Java in sbt.


Put objectWeb's ASM jar in the sbt project's 'lib' directory.
Run the ASMifier from the sbt project's home directory: 
    `$ java -cp lib/asm-all-4.1.jar org.objectweb.asm.util.ASMifier target/scala-2.9.1/classes/HelloScala.class>HelloScalaDump.java`

This is the Java example.  Please check the branches for examples in each language.

//TODO The above code needs to point to a different target/ file (the java one)
