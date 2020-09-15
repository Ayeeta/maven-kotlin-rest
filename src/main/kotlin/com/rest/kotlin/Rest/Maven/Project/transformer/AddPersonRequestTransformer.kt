package com.rest.kotlin.Rest.Maven.Project.transformer

import com.rest.kotlin.Rest.Maven.Project.domain.Person
import com.rest.kotlin.Rest.Maven.Project.dto.AddPersonRequest
import org.springframework.stereotype.Component

@Component
class AddPersonRequestTransformer: Transformer<AddPersonRequest, Person> {
    override fun transforms(source: AddPersonRequest): Person {
        return Person(
                firstName = source.firstname,
                LastName = source.lastname
        )
    }
}