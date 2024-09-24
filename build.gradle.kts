buildscript {

    repositories {
        mavenCentral()
    }
}
plugins {
    id ("java")
    id ("idea")
}

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
    implementation("org.seleniumhq.selenium:selenium-chrome-driver:4.25.0")
    implementation("org.seleniumhq.selenium:selenium-remote-driver:4.25.0")
}
