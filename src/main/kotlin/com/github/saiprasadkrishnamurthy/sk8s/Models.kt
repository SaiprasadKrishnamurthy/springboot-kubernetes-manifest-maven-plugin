package com.github.saiprasadkrishnamurthy.sk8s

/**
 * various model objects.
 * @author Sai.
 */
data class PropertiesContext(val profile: String, val props: MutableMap<Any, Any> = mutableMapOf(), val normalisedProps: MutableMap<Any, Any> = mutableMapOf(), val file: String)

data class GenerateK8sManifestsRequest(val artifactId: String,
                                       val version: String,
                                       val dockerImageName: String,
                                       val deploymentYmlTemplateFile: String,
                                       val configMapYmlTemplateFile: String,
                                       val outputDir: String,
                                       val baseDir: String = System.getProperty("user.dir"),
                                       val generateVersionHistory: Boolean = false)
