package com.rest.kotlin.Rest.Maven.Project.transformer

interface Transformer<A, B> {
    fun transforms(source: A) : B
}