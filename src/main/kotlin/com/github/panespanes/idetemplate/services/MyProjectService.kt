package com.github.panespanes.idetemplate.services

import com.intellij.openapi.project.Project
import com.github.panespanes.idetemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
