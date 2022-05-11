package com.example.project.data.model

import javax.persistence.*
import com.example.project.data.model.Entity

@javax.persistence.Entity
@Table(name = "book")
data class Book(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    override var id: Long = -1,

    @Column(nullable = false)
    var name: String = ""
): Entity()