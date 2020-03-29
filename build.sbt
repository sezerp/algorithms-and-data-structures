name := "aisd"

version := "0.1"

scalaVersion := "2.13.1"

val testingDependencies = Seq(
  "org.scalactic" %% "scalactic" % "3.1.1",
  "org.scalatest" %% "scalatest" % "3.1.1" % "test"
)

libraryDependencies ++= testingDependencies
