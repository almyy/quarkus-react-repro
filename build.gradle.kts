plugins {
    kotlin("jvm") version "1.4.21"
    id("io.quarkus") version "1.10.3.Final"
}

group = "org.repro"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform("io.quarkus:quarkus-bom:1.10.3.Final"))
    implementation(kotlin("stdlib"))
    implementation("io.quarkus:quarkus-kotlin")
    implementation("io.quarkus:quarkus-resteasy")
    implementation("io.quarkus:quarkus-undertow")
}


java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}


tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
        kotlinOptions.javaParameters = true
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
        kotlinOptions.javaParameters = true
    }

}
