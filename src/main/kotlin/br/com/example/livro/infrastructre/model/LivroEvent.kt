package br.com.example.livro.infrastructre.model

import java.util.*

data class LivroEvent(
    val id: UUID? = null,
    val autor: String = "",
    val description: String = "",
    val numero_de_paginas: String = "",
    val isbn: String = "",
    val preco: Double = 0.0
)