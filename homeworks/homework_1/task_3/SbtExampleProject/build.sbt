ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.16"

lazy val root = (project in file("."))
  .settings(
    name := "SbtExampleProject"
  )

libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "2.4.0"