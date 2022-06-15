// name := "Scala.js test-app"
// scalaVersion := "2.13.1"

// enablePlugins(ScalaJSPlugin)

// enablePlugins(ScalaJSPlugin)

// name := "Scala.js Tutorial"
// scalaVersion := "2.13.1" // or any other Scala version >= 2.11.12

// // This is an application with a main method
// scalaJSUseMainModuleInitializer := true

// libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "2.1.0"

// build.sbt
 libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "2.1.0"
jsEnv := new org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv()
libraryDependencies += "com.lihaoyi" %%% "utest" % "0.7.4" % "test"
testFrameworks += new TestFramework("utest.runner.Framework")

lazy val root = project.in(file("."))
  .settings(
    scalaVersion := "2.13.4",
    scalaJSUseMainModuleInitializer := true,
  )
  .enablePlugins(ScalaJSPlugin)