plugins {
    id("com.android.application") version "8.13.0" apply false
    id("org.jetbrains.kotlin.android") version "2.2.10" apply false
}

allprojects {
    tasks.withType<JavaCompile> {
        val compilerArgs = options.compilerArgs
        compilerArgs.add("-Xlint:unchecked")
        compilerArgs.add("-Xlint:deprecation")
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.layout.buildDirectory)
}
