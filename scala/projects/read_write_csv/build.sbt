ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

libraryDependencies += "org.apache.spark" %% "spark-sql" % "3.2.0"

lazy val root = (project in file("."))
  .settings(
    name := "read_write_csv"
  )
