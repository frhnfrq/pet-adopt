package com.frhnfrq.backend.repositories

import com.frhnfrq.backend.models.Pet
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PetRepository: JpaRepository<Pet, Long> {
}