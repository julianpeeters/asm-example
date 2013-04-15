name := "asm-example"

version := "0.0.1-SNAPSHOT"

organization := "com.julianpeeters"

//scalaVersion := "2.9.1"
scalaVersion := "2.10.1"

resolvers ++= Seq(
  "repo.scalatools rels" at "https://oss.sonatype.org/content/groups/scala-tools/",
  "repo.scalatools snaps" at "https://oss.sonatype.org/content/repositories/snapshots/",
  "mvnRepository" at "mvnrepository.com/artifact/",
  "repo.novus rels" at "http://repo.novus.com/releases/",
  "repo.novus snaps" at "http://repo.novus.com/snapshots/"
)

libraryDependencies ++= Seq(
    "org.ow2.asm" % "asm-all" % "4.1",
    "com.novus" % "salat-core_2.9.0-1" % "0.0.8-SNAPSHOT",
    //"org.scala-lang" % "scala-compiler" % "2.10.1"
    "org.scala-lang" % "scala-compiler" % "2.10.1"
)
