package com.github.zhouzhanqi.yapileftuntold.services

import com.intellij.openapi.project.Project
import com.github.zhouzhanqi.yapileftuntold.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
