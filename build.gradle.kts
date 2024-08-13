plugins {
    id("java")
}

group = "inteleonyx.legiao"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/")

}

dependencies {
    //Lombok
    compileOnly("org.projectlombok:lombok:1.18.34")
    annotationProcessor("org.projectlombok:lombok:1.18.34")

    //PaperMC
    compileOnly("io.papermc.paper:paper-api:1.21.1-R0.1-SNAPSHOT")

    //Kyori Adventure
    implementation("net.kyori:adventure-api:4.17.0")
    implementation("net.kyori:adventure-platform-bukkit:4.3.4")

    //Database
    implementation("org.mariadb.jdbc:mariadb-java-client:3.4.1")
    implementation("com.zaxxer:HikariCP:5.1.0")
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(21))
}