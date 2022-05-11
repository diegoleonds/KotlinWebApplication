package com.example.project.foundation

interface BasicIoOperations<I, O> {
    fun insert(input: I)
    fun getById(id: Long): O
    fun getByPage(page: Int, offset: Int): List<O>
    fun delete(input: I)
    fun update(input: I)
}