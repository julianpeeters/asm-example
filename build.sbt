name := "asm-example"

version := "0.0.1-SNAPSHOT"

organization := "com.julianpeeters"

scalaVersion := "2.10.1"

libraryDependencies ++= Seq(
     "org.ow2.asm" % "asm-all" % "4.1",
     "org.scala-lang" % "scala-compiler" % "2.10.1")
