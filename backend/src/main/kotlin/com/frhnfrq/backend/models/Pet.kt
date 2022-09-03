package com.frhnfrq.backend.models

import javax.persistence.*

@Entity
@Table
data class Pet(
    @Id
    @SequenceGenerator(
        name = "pet_sequence",
        sequenceName = "pet_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "pet_sequence"
    )
    val id: Long = 0,
    val name: String,
    val age: Int,
    val type: String,
)
