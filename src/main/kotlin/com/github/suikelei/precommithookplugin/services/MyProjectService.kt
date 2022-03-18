package com.github.suikelei.precommithookplugin.services

import com.intellij.openapi.project.Project
import com.github.suikelei.precommithookplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
