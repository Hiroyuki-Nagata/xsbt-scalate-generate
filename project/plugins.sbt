// resolvers += Resolver.url("sbt-plugin-releases",
//   new URL("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases/"))(
//     Resolver.ivyStylePatterns)


// addSbtPlugin("com.typesafe.sbtscalariform" % "sbtscalariform" % "1.0.0")

// addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.1.2")

// addSbtPlugin("com.jsuereth" % "xsbt-gpg-plugin" % "0.6")


resolvers += Resolver.url("Typesafe repository", new java.net.URL("http://typesafe.artifactoryonline.com/typesafe/ivy-releases/"))(Resolver.defaultIvyPatterns)

libraryDependencies <+= (sbtVersion) { v =>
  "org.scala-sbt" % "scripted-plugin" % v
}
