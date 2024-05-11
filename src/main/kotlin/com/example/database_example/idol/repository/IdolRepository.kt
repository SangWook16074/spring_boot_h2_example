package com.example.database_example.idol.repository

import com.example.database_example.idol.entity.Idol
import org.springframework.data.repository.CrudRepository

interface IdolRepository : CrudRepository<Idol, Long>