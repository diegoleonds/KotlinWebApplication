package com.example.project.data.dao

import com.example.project.data.Error.DatabaseErrorHandler
import com.example.project.data.model.Book

class BookDao(
    override val errorHandler: DatabaseErrorHandler
) : Dao<Book>() {
}