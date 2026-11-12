plugins {
    id("java")
}

group = "com.github.morgachevaleksey"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

//Шоб джава запускалась
sourceSets {
    main {
        java {
            srcDir("src/main/fundamentals/java")
            // если появятся другие Java-корни:
            // srcDir("src/main/springBoot/java")
        }
    }
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}