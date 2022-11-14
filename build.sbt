name := "frins"

organization := "io.github.martintrojer"

version := "0.3-SNAPSHOT"

scalaVersion := "2.12.15"

publishTo := Some("Artifactory Realm" at "http://10.0.0.244/artifactory/libs-release-local")

credentials += Credentials(Path.userHome / ".sbt" / ".credentials")
resolvers += "Artifactory" at "http://10.0.0.244/artifactory/libs-release-local/"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.0" % "test"

libraryDependencies += "io.github.martintrojer" %% "atom-scala" % "0.3-SNAPSHOT"
libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.5"
