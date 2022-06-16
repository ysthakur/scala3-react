enablePlugins(ScalaJSPlugin)

ThisBuild / version := "0.1.0-SNAPSHOT"

Global / onChangedBuildSource := ReloadOnSourceChanges

lazy val root = (project in file("."))
  .settings(
    name := "scala3-react",
    scalaVersion := "3.1.3",
    idePackagePrefix := Some("com.ysthakur.react"),
    libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "2.1.0",
    scalaJSUseMainModuleInitializer := true,
    jsEnv := new org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv(),
    Compile / fastOptJS / artifactPath := baseDirectory.value / "lib" / "main.js",
    Compile / fullOptJS / artifactPath := baseDirectory.value / "lib" / "main.js"
  )

Global / excludeLintKeys += idePackagePrefix
