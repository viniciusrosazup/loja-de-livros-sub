package br.com.example.livro.database.repository

import br.com.example.livro.core.model.Livro
import br.com.example.livro.database.entity.LivroEntity
import javax.inject.Singleton

@Singleton
interface LivroEntityRepository {
    fun saveCql(livroEntity: LivroEntity): LivroEntity
}