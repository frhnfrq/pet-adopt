package com.frhnfrq.backend.controllers

import com.frhnfrq.backend.models.Pet
import com.frhnfrq.backend.services.PetService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/pet")
class PetController(
    private val petService: PetService
) {

    @GetMapping
    fun getPets(): List<Pet> {
        return petService.getPets()
    }

    @PostMapping
    fun createPet(pet: Pet) {
        petService.createPet(pet)
    }

}