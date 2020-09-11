package com.rest.kotlin.Rest.Maven.Project

import com.rest.kotlin.Rest.Maven.Project.domain.Person
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class RestMavenProjectApplication{
	@GetMapping
	fun person(): Person {
		return Person(2, "Joe", "Rudolf")
	}
}

fun main(args: Array<String>) {
	runApplication<RestMavenProjectApplication>(*args)
}
