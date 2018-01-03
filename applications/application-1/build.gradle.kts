plugins {
    kotlin("jvm")
}

repositories {
    jcenter()
}

dependencies {
    "compile"("org.jetbrains.kotlin:kotlin-stdlib-jre8:1.2.10")
    "compile"(project(":components:component-1"))
}
