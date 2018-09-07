package com.diti.shoppinglist.controller

import com.diti.shoppinglist.repository.ProductRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/es")
class ProductController(val repository: ProductRepository) {

    @GetMapping("/products")
    fun getAll() = ResponseEntity.ok(repository.findAll())
}