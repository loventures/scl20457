lazy val doobieVersion = "1.0.0-RC1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "scl20457",
    version := "1.0.0",
    scalaVersion := "3.1.3",
    libraryDependencies ++= Seq(
      "org.tpolecat" %% "doobie-core" % doobieVersion,
      "org.tpolecat" %% "doobie-postgres" % doobieVersion 
    )
  )