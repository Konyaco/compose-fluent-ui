package com.konyaco.fluent.plugin.build

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.publish.PublishingExtension
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.api.publish.maven.tasks.AbstractPublishToMaven
import org.gradle.api.tasks.bundling.Jar
import org.gradle.kotlin.dsl.create
import org.gradle.kotlin.dsl.findByType
import org.gradle.kotlin.dsl.withType
import org.gradle.plugins.signing.Sign
import org.gradle.plugins.signing.SigningExtension

class BuildPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        target.allprojects.forEach { project ->
            project.afterEvaluate {

                project.extensions.findByType<PublishingExtension>()?.apply {
                    setupMavenPublishing(project)
                    project.extensions.findByType<SigningExtension>()?.let { signing ->
                        signing.setupSigning(this)

                        // workaround for publishing with javadoc see https://github.com/gradle/gradle/issues/26091#issuecomment-1722947958
                        project.tasks.withType<AbstractPublishToMaven>().configureEach {
                            val signingTask = project.tasks.withType<Sign>()
                            mustRunAfter(signingTask)
                        }
                    }
                }
            }
        }
    }

    private fun SigningExtension.setupSigning(publishing: PublishingExtension) {
        useInMemoryPgpKeys(
            System.getenv("SIGNING_KEY_ID"),
            System.getenv("SIGNING_KEY"),
            System.getenv("SIGNING_PASSWORD")
        )
        sign(publishing.publications)
    }

    private fun PublishingExtension.setupMavenPublishing(target: Project) {
        val javadocJar = target.tasks.findByName("javadocJar") ?: target.tasks.create("javadocJar", Jar::class) {
            archiveClassifier.set("javadoc")
        }
        publications.withType<MavenPublication> {
            artifact(javadocJar)
            pom {
                name.set("compose-fluent-ui")
                description.set("A Fluent Design UI library for compose-multiplatform.")
                url.set("https://github.com/Konyaco/compose-fluent-ui")

                licenses {
                    license {
                        name.set("The Apache License, Version 2.0")
                        url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                    }
                }

                developers {
                    developer {
                        name.set("Kon Yaco")
                        email.set("atwzj233@gmail.com")
                        url.set("https://github.com/Konyaco")
                    }
                }

                scm {
                    url.set("https://github.com/Konyaco/compose-fluent-ui")
                    connection.set("scm:git:git://github.com/Konyaco/compose-fluent-ui.git")
                    developerConnection.set("scm:git:ssh://github.com/Konyaco/compose-fluent-ui.git")
                }
            }
        }
        repositories {
            maven {
                val snapshotsUrl ="https://s01.oss.sonatype.org/content/repositories/snapshots/"
                val releasesUrl = "https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/"
                name = "OSSRH"
                url = target.uri(
                    if (target.version.toString().endsWith("SNAPSHOT")) snapshotsUrl
                    else releasesUrl
                )
                credentials {
                    username = System.getenv("OSSRH_USERNAME")
                    password = System.getenv("OSSRH_PASSWORD")
                }
            }
        }
    }
}
