rootProject.name = "junit-pioneer"
include("demo")

plugins {
	id("com.gradle.enterprise") version "3.14.1"
}

gradleEnterprise { 
	buildScan {
		termsOfServiceUrl = "https://gradle.com/terms-of-service"
		termsOfServiceAgree = "yes"
	}
}