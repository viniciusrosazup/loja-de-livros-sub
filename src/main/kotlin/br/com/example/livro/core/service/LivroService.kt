package br.com.example.livro.core.service

import br.com.example.livro.core.mapper.LivroConverter
import br.com.example.livro.core.model.Livro
import br.com.example.livro.core.ports.LivroServiceEntityPort
import br.com.example.livro.core.ports.LivroServicePort
import br.com.example.livro.infrastructre.model.LivroEvent
import javax.inject.Singleton

@Singleton
class LivroService(private val service: LivroServiceEntityPort) : LivroServicePort {
    override fun insert(livro: Livro): LivroEvent {
        return LivroConverter.livroToLivroEventDto(service.save(LivroConverter.livroToLivroEntity(livro)))
    }
}