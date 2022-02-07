import scala.scalanative.build._

ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "2.12.14"

// Set to false or remove if you want to show stubs as linking errors
nativeLinkStubs := false


lazy val root = (project in file("."))
  .settings(
    name := "scafi-benchmark",
    libraryDependencies += "io.github.cquiroz" %%% "scala-java-time" % "2.4.0-M1"
  ).enablePlugins(ScalaNativePlugin)
