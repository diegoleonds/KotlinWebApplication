package com.example.project.foundation.Result

import com.example.project.foundation.Error.BaseError

sealed class Result<T> {
    data class Success<T>(val data: T): Result<T>()
    data class Error<T>(val error: BaseError): Result<T>()
}
