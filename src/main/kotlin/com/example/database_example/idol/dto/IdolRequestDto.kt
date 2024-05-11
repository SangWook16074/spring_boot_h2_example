package com.example.database_example.idol.dto

import com.example.database_example.idol.entity.Idol

data class IdolRequestDto(
    val id : Long,
    var name : String,
    var age : Int,
) {
    fun toEntity() : Idol = Idol(
        id = id,
        name = name,
        age = age,
    )
}

data class IdolResponseDto(
    val id : Long,
    var name : String,
    var age : Int,
)
