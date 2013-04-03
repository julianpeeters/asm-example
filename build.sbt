name := "asm-example"

version := "0.0.1-SNAPSHOT"

organization := "com.julianpeeters"

scalaVersion := "2.9.1"

resolvers += "repo.scalatools rels" at "https://oss.sonatype.org/content/groups/scala-tools/"

resolvers += "repo.scalatools snaps" at "https://oss.sonatype.org/content/repositories/snapshots/"

libraryDependencies += "org.ow2.asm" % "asm-all" % "4.1"
