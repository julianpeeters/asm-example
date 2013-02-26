asm-example

A few examples of objectweb's asm, a java bytecode library. Trying out the ASMifier to run HelloWorlds from bytecode in both Scala and Java.
Put objectWeb's ASM jar in the sbt project's 'lib' directory.
Run the ASMifier from the sbt project's home directory: '$ java -cp lib/asm-all-4.1.jar org.objectweb.asm.util.ASMifier target/scala-2.9.1/classes/HelloScala.class>HelloScalaDump.java'
