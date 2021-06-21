package br.com.example.livro.core.mapper

import br.com.example.livro.core.model.Livro
import br.com.example.livro.database.entity.LivroEntity
import br.com.example.livro.infrastructre.model.LivroEvent
import javax.inject.Singleton

@Singleton
class LivroConverter {
    companion object {
        fun livroToLivroEventDto(livro: Livro) =
            LivroEvent(livro.id, livro.autor, livro.description, livro.numero_de_paginas, livro.isbn, livro.preco)

        fun livroToLivroEntity(livro: Livro) =
            LivroEntity(livro.id!!, livro.autor, livro.description, livro.numero_de_paginas, livro.isbn, livro.preco)

        fun livroEntityToLivro(livro: LivroEntity) =
            Livro(livro.id, livro.autor, livro.description, livro.numero_de_paginas, livro.isbn, livro.preco)

        fun livroEventToLivro(livro: LivroEvent) =
            Livro(livro.id, livro.autor, livro.description, livro.numero_de_paginas, livro.isbn, livro.preco)
    }


}