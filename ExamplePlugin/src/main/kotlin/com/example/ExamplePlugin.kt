package com.example

import org.gradle.api.*;
import org.gradle.api.plugins.*
import org.gradle.api.tasks.wrapper.*
class ExamplePlugin : Plugin<Project> {

    //Entrypoint, use project to access project specifics
    override fun apply(project: Project?) {
        greet()
    }

    //Just a simple test method
    fun greet() {
            println("Hello!")
    }
}
