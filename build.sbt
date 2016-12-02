name := "BundlePricing"

scalaVersion := "2.11.7"

scalacOptions ++= Seq("-deprecation")

// libraries
libraryDependencies ++= Seq( 
"com.typesafe.akka" %% "akka-actor" % "2.4.14",
"com.typesafe.akka" %% "akka-http-core" % "2.4.11",
"com.typesafe.akka" %% "akka-http-experimental" % "2.4.11",
"com.typesafe.akka" %% "akka-http-jackson-experimental" % "2.4.11",
"com.typesafe.akka" %% "akka-http-spray-json-experimental" % "2.4.11",
"com.typesafe.akka" %% "akka-http-xml-experimental" % "2.4.11")

libraryDependencies += "org.glassfish.hk2.external" % "javax.inject" % "2.5.0-b28"

exportJars := true





