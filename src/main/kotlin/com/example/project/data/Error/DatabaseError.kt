package com.example.project.data.Error

import com.example.project.foundation.Error.BaseError

sealed class DatabaseError(
    override val messageResource: String
) : BaseError() {

}