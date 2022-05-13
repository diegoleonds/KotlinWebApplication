package com.example.project.data.dao

import com.example.project.data.model.BaseEntity
import com.example.project.foundation.BasicIoOperations

abstract class Dao<E: BaseEntity>: BasicIoOperations<E, E> {
    override fun insert(entity: E) {
        TODO("Not yet implemented")
    }

    override fun getById(id: Long): E {
        TODO("Not yet implemented")
    }

    override fun getByPage(page: Int, offset: Int): List<E> {
        TODO("Not yet implemented")
    }

    override fun update(entity: E) {
        TODO("Not yet implemented")
    }

    override fun delete(entity: E) {
        TODO("Not yet implemented")
    }
}