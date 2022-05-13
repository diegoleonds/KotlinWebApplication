package com.example.project.foundation.Error

interface ErrorHandler<E: BaseError> {
    fun getError(throwable: Throwable): E
}