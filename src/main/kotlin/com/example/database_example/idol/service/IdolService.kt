package com.example.database_example.idol.service

import com.example.database_example.idol.dto.IdolRequestDto
import com.example.database_example.idol.dto.IdolResponseDto
import com.example.database_example.idol.entity.Idol
import com.example.database_example.idol.repository.IdolRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.findByIdOrNull
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class IdolService {

    @Autowired
    private lateinit var idolRepository : IdolRepository

    /**
     * SELECT * FROM IDOL;
     */
    fun getIdolList() : List<IdolResponseDto> {
        val result = idolRepository.findAll()
        return result.map { it.toResponse() }
    }

    /**
     * SELECT * FROM IDOL
     * WHERE "id" = number;
     */

    fun getIdolById(id : Long) : IdolResponseDto {
        val result = idolRepository.findByIdOrNull(id)
            ?: throw ResponseStatusException(HttpStatus.NOT_FOUND)
        return result.toResponse()
    }


    /**
     * INSERT INTO IDOL VALUES(
     *      id : long integer,
     *      name : varchar,
     *      age : integer,
     * )
     */
    fun postIdol(idol : IdolRequestDto) : IdolResponseDto {
        val result = idolRepository.save(idol.toEntity())
        return result.toResponse()
    }

    /**
     * DELETE FROM IDOL WHERE "ID" = NUMBER;
     */

    fun deleteIdolById(id : Long) : Unit {

           idolRepository.deleteById(id)
    }
}