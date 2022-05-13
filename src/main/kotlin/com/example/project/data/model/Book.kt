package com.example.project.data.model

import javax.persistence.*

@Entity
@Table(name = "book")
class Book(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    override var id: Long,

    @Column(nullable = false)
    var name: String,
): BaseEntity()