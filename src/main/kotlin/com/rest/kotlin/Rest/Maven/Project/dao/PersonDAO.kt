package com.rest.kotlin.Rest.Maven.Project.dao

import com.rest.kotlin.Rest.Maven.Project.domain.Person
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PersonDAO: JpaRepository<Person, Long>
