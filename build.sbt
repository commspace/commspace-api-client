lazy val root = (project in file(".")).
  settings(
    organization := "za.co.commspace",
    name := "commspace-api-client",
    version := "1.1.2",
    scalaVersion := "2.11.4",
    scalacOptions ++= Seq("-feature"),
    javacOptions in compile ++= Seq("-Xlint:deprecation"),
    publishArtifact in (Compile, packageDoc) := false,
    resolvers += Resolver.mavenLocal,
    libraryDependencies ++= Seq(
      "io.swagger.core.v3" % "swagger-annotations" % "2.0.0",
      "org.glassfish.jersey.core" % "jersey-client" % "2.29.1",
      "org.glassfish.jersey.media" % "jersey-media-multipart" % "2.29.1",
      "org.glassfish.jersey.media" % "jersey-media-json-jackson" % "2.29.1",
      "org.glassfish.jersey.inject" % "jersey-hk2" % "2.29.1",
      "com.fasterxml.jackson.core" % "jackson-core" % "2.10.1" % "compile",
      "com.fasterxml.jackson.core" % "jackson-annotations" % "2.10.1" % "compile",
      "com.fasterxml.jackson.core" % "jackson-databind" % "2.10.1" % "compile",
      "com.fasterxml.jackson.datatype" % "jackson-datatype-jsr310" % "2.10.1" % "compile",
      "junit" % "junit" % "4.12" % "test",
      "com.novocode" % "junit-interface" % "0.10" % "test"
    )
  )
