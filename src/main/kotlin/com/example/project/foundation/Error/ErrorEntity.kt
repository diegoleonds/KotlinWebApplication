package com.example.project.foundation.Error

sealed class ErrorEntity(val messageResource: String) {
    object Network : ErrorEntity("")

    object NotFound : ErrorEntity("")

    object AccessDenied : ErrorEntity("")

    object ServiceUnavailable : ErrorEntity("")

    object Unknown : ErrorEntity("")
}