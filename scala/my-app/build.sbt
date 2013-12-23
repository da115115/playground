name := "MyApplication"

version := "1.0"

scalaVersion := "2.10.1"

libraryDependencies += "com.nicta" %% "scoobi" % "0.7.3"

resolvers ++= Seq("cloudera" at "https://repository.cloudera.com/content/repositories/releases",
                  "Sonatype-snapshots" at "http://oss.sonatype.org/content/repositories/snapshots")

