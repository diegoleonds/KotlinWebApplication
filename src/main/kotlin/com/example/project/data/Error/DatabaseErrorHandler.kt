package com.example.project.data.Error

import com.example.project.foundation.Error.ErrorHandler

class DatabaseErrorHandler: ErrorHandler<DatabaseError> {
    override fun getError(throwable: Throwable): DatabaseError {
        TODO("Not yet implemented")
    }
}