package com.rest.kotlin.Rest.Maven.Project.service

import com.rest.kotlin.Rest.Maven.Project.dao.PersonDAO
import com.rest.kotlin.Rest.Maven.Project.dto.AddPersonRequest
import com.rest.kotlin.Rest.Maven.Project.dto.PersonResponse
import com.rest.kotlin.Rest.Maven.Project.dto.UpdatePersonRequest
import com.rest.kotlin.Rest.Maven.Project.transformer.AddPersonRequestTransformer
import org.springframework.stereotype.Service

@Service
class PersonManagementServiceImpl(private val personDAO: PersonDAO, private val addPersonRequestTransformer: AddPersonRequestTransformer) : PersonManagementService {
    override fun findById(id: Long): PersonResponse? {
        TODO("Not yet implemented")
    }

    override fun findAll(): List<PersonResponse> {
        TODO("Not yet implemented")
    }

    override fun save(addPersonRequest: AddPersonRequest): PersonResponse {
        TODO("Not yet implemented")
    }

    override fun update(updatePersonRequest: UpdatePersonRequest): PersonResponse {
        TODO("Not yet implemented")
    }

    override fun deleteById(id: Long) {
        TODO("Not yet implemented")
    }
}