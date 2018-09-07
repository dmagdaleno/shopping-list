package com.diti.shoppinglist.model

import org.springframework.data.annotation.Id
import org.springframework.data.elasticsearch.annotations.Document

@Document(indexName = "shoppinglist", type = "product")
data class Product(
        @Id
        val id: String = "",
        val name: String = "",
        val category: String = "",
        val subcategory: String = "",
        val supplier: String = "",
        val price: String = "",
        val tags: List<String> = emptyList()
)