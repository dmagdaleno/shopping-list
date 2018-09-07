package com.diti.shoppinglist.repository

import com.diti.shoppinglist.model.Product
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository

interface ProductRepository: ElasticsearchRepository<Product, String>