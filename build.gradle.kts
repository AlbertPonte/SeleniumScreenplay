buildscript {
    //ext.serenityCoreVersion = '3.3.0'
    //ext.serenityCoreVersion = '4.0.0-beta2'
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath("net.serenity-bdd:serenity-gradle-plugin:3.4.2")
    }
}

plugins {

    id ("java")
    id ("eclipse")
    id ("idea")
}

defaultTasks "clean" "test" "aggregate"

group "per.ati.kallpa.software"
version "1.0-SNAPSHOT"


repositories {
    mavenCentral()
}

dependencies {

    implementation ("net.serenity-bdd:serenity-core:4.2.1")
    implementation ("net.serenity-bdd:serenity-junit5:4.2.1")
    implementation ("net.serenity-bdd:serenity-cucumber:4.2.1")
    implementation("net.serenity-bdd:serenity-cucumber6:2.6.0")
    implementation ("net.serenity-bdd:serenity-ensure:4.2.1")
    implementation ("net.serenity-bdd:serenity-screenplay:4.2.1")
    implementation ("net.serenity-bdd:serenity-screenplay-webdriver:4.2.1")
    implementation("net.serenity-bdd:serenity-reports:4.2.1")
    implementation("org.seleniumhq.selenium:selenium-server:3.141.59")
}
