package br.com.example.livro.database.service

import br.com.example.livro.core.mapper.LivroConverter
import br.com.example.livro.core.model.Livro
import br.com.example.livro.core.ports.LivroServiceEntityPort
import br.com.example.livro.database.entity.LivroEntity
import br.com.example.livro.database.repository.LivroEntityRepository
import javax.inject.Singleton

@Singleton
class LivroService(private val repository: LivroEntityRepository) : LivroServiceEntityPort {
    override fun save(livroEntity: LivroEntity): Livro {
        val livroEntityResult = repository.saveCql(livroEntity)
        return LivroConverter.livroEntityToLivro(livroEntityResult)
    }
}