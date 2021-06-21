package br.com.example.livro.core.ports

import br.com.example.livro.core.model.Livro
import br.com.example.livro.database.entity.LivroEntity
import javax.inject.Singleton

@Singleton
interface LivroServiceEntityPort {
    fun save(livroEntity: LivroEntity): Livro
}