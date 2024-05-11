package com.example.database_example.idol.controller

import com.example.database_example.idol.dto.IdolRequestDto
import com.example.database_example.idol.dto.IdolResponseDto
import com.example.database_example.idol.entity.Idol
import com.example.database_example.idol.service.IdolService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/idols")
class IdolController {

    @Autowired
    private lateinit var idolService: IdolService

    /**
     * 아이돌 전체 조회
     */
    @GetMapping
    private fun getIdolList() : ResponseEntity<List<IdolResponseDto>> {
        val result = idolService.getIdolList()
        return ResponseEntity.status(HttpStatus.OK).body(result)
    }

    /**
     * 아이디로 아이돌 조회
     */
    @GetMapping("/{id}")
    private fun getIdolById(@PathVariable id : Long) : ResponseEntity<Any> {
        val result = idolService.getIdolById(id)
        return ResponseEntity.status(HttpStatus.OK).body(result)
    }

    /**
     * 아이돌 생성
     */
    @PostMapping
    private fun postIdol(@RequestBody idolRequestDto : IdolRequestDto)
    : ResponseEntity<IdolResponseDto> {
        val result = idolService.postIdol(idolRequestDto)
        return ResponseEntity
            .status(HttpStatus.CREATED)
            .body(result)
    }

    /**
     * 아이돌 정보 갱신
     */
    @PutMapping
    private fun putIdol(@RequestBody idolRequestDto : IdolRequestDto)
    : ResponseEntity<IdolResponseDto> {
        val result = idolService.postIdol(idolRequestDto)
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(result)
    }

    /**
     * 아이돌 정보 삭제
     */
    @DeleteMapping("/{id}")
    private fun deleteIdolById(@PathVariable id : Long) : Unit {
        idolService.deleteIdolById(id)
    }
}