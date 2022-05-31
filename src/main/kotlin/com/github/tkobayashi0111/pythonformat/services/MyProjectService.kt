package com.github.tkobayashi0111.pythonformat.services

import com.intellij.openapi.project.Project
import com.github.tkobayashi0111.pythonformat.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
