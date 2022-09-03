package com.frhnfrq.backend.services

import com.frhnfrq.backend.models.Pet
import com.frhnfrq.backend.repositories.PetRepository
import org.springframework.stereotype.Service

@Service
class PetService(
    private val petRepository: PetRepository
) {

    fun getPets(): List<Pet> {
        return petRepository.findAll()
    }

    fun createPet(pet: Pet) {
        petRepository.save(pet)
    }
}