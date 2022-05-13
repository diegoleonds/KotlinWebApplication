package com.example.project.data.dao

import com.example.project.data.Error.DatabaseError
import com.example.project.data.model.BaseEntity
import com.example.project.foundation.Error.ErrorHandler
import com.example.project.foundation.Result.Result

abstract class Dao<E: BaseEntity> {

    protected abstract val errorHandler: ErrorHandler<DatabaseError>

    fun insert(entity: E): Result<Long> {
        TODO("Not yet implemented")
    }

    fun getById(id: Long): Result<E> {
        TODO("Not yet implemented")
    }

    fun getByPage(page: Int, offset: Int): Result<List<E>> {
        TODO("Not yet implemented")
    }

    fun update(entity: E): Result<Long> {
        TODO("Not yet implemented")
    }

    fun delete(entity: E): Result<Long> {
        TODO("Not yet implemented")
    }
}