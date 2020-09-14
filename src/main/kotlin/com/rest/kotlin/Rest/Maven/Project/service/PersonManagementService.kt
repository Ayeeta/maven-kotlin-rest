package com.rest.kotlin.Rest.Maven.Project.service

import com.rest.kotlin.Rest.Maven.Project.dto.AddPersonRequest
import com.rest.kotlin.Rest.Maven.Project.dto.PersonResponse
import com.rest.kotlin.Rest.Maven.Project.dto.UpdatePersonRequest

interface PersonManagementService {

    fun findById(id: Long): PersonResponse?
    fun findAll(): List<PersonResponse>
    fun save(addPersonRequest: AddPersonRequest): PersonResponse
    fun update(updatePersonRequest: UpdatePersonRequest): PersonResponse
    fun deleteById(id: Long)
}