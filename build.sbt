import com.github.retronym.SbtOneJar._

oneJarSettings

name := "Cenvosorena Trespo-doesgenyllyr"

version := "0.00"

scalaVersion := "2.11.4"

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.11" % "2.1.3" % "test",
  "org.scala-lang.modules" %% "scala-swing" % "1.0.1",
  "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.2",
  "org.scala-lang.modules" %% "scala-xml" % "1.0.2",
  "com.github.scopt" %% "scopt" % "3.2.0"
)

resolvers += Resolver.sonatypeRepo("public")

mainClass := Some("com.bb94.ctd.CTD")
