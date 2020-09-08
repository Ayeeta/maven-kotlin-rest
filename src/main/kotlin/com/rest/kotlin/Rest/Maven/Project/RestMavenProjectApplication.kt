package com.rest.kotlin.Rest.Maven.Project

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class RestMavenProjectApplication{
	@GetMapping
	fun sayHello():String{
		return "Hello World"
	}
}

fun main(args: Array<String>) {
	runApplication<RestMavenProjectApplication>(*args)
}
