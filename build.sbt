name := """David Medvedev Final Project"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  filters,
  "com.fdflib"%"4dflib"%"1.1",
  "com.squareup.okhttp" % "okhttp" % "2.6.0",
  "com.google.code.gson" % "gson" % "2.4"
)
