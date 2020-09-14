package com.rest.kotlin.Rest.Maven.Project.dto

data class UpdatePersonRequest(val id: Long, val firstname: String, val lastname: String? = null)