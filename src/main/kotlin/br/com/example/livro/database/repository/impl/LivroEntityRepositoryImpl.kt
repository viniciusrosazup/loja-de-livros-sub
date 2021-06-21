package br.com.example.livro.database.repository.impl

import br.com.example.livro.database.entity.LivroEntity
import br.com.example.livro.database.repository.LivroEntityRepository
import com.datastax.oss.driver.api.core.CqlSession
import com.datastax.oss.driver.api.core.cql.SimpleStatement
import java.util.*
import javax.inject.Singleton

@Singleton
class LivroEntityRepositoryImpl(private val session: CqlSession) : LivroEntityRepository {
    override fun saveCql(livroEntity: LivroEntity): LivroEntity {
        session.execute(
            SimpleStatement.newInstance(
                "INSERT INTO livro.Livro(id,autor,description,numero_de_paginas,isbn,preco) VALUES (?,?,?,?,?,?)",
                UUID.randomUUID(),
                livroEntity.autor,
                livroEntity.description,
                livroEntity.numero_de_paginas,
                livroEntity.isbn,
                livroEntity.preco
            )
        )

        return livroEntity
    }
}