package com.frhnfrq.backend.services

import com.frhnfrq.backend.models.Pet
import org.springframework.stereotype.Service

@Service
class PetService {

    fun getPets(): List<Pet> {
        return listOf(
            Pet(
                name = "Akira",
                age = 4,
                type = "Cat"
            )
        )
    }
}