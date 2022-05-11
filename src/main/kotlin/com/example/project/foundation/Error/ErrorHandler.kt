package com.example.project.foundation.Error

interface ErrorHandler {
    fun getError(throwable: Throwable): ErrorEntity
}