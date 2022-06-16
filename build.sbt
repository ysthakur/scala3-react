enablePlugins(ScalaJSPlugin)
enablePlugins(ScalaJSBundlerPlugin)

ThisBuild / version := "0.1.0-SNAPSHOT"

Global / onChangedBuildSource := ReloadOnSourceChanges

scalaJSLinkerConfig ~= { _.withModuleKind(ModuleKind.CommonJSModule) }

lazy val root = (project in file("."))
  .settings(
    name := "scala3-react",
    scalaVersion := "3.1.3",
    idePackagePrefix := Some("com.ysthakur.react"),
    libraryDependencies ++= Seq(
      "org.scala-js" %%% "scalajs-dom" % "2.1.0",
      "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1"
    ),
    scalaJSUseMainModuleInitializer := true,
//    jsEnv := new org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv(),
//    Compile / fastOptJS / artifactPath := baseDirectory.value / "lib" / "main.js",
//    Compile / fastOptJS / webpack / artifactPath := baseDirectory.value / "lib" / "main-bundle.js",
//    Compile / fullOptJS / artifactPath := baseDirectory.value / "lib" / "main.js",
//    Compile / fullOptJS / webpack / artifactPath := baseDirectory.value / "lib" / "main-bundle.js",
    webpackBundlingMode := BundlingMode.Application,
    Compile / npmDependencies ++= Seq(
      "react" -> "17.0.2",
      "react-dom" -> "17.0.2"
    )
  )

Global / excludeLintKeys += idePackagePrefix
