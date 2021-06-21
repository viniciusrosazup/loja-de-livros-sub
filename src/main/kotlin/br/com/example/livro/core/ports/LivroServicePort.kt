package br.com.example.livro.core.ports

import br.com.example.livro.core.model.Livro
import br.com.example.livro.infrastructre.model.LivroEvent
import javax.inject.Singleton

@Singleton
interface LivroServicePort {
    fun insert(livro: Livro): LivroEvent
}