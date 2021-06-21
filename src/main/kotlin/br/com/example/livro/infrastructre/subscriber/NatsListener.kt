package br.com.example.livro.infrastructre.subscriber

import br.com.example.livro.core.mapper.LivroConverter
import br.com.example.livro.core.ports.LivroServicePort
import br.com.example.livro.infrastructre.model.EventInformation
import io.micronaut.nats.annotation.NatsClient
import io.micronaut.nats.annotation.Subject

@NatsClient
class LivroListener(private val service: LivroServicePort) {

    @Subject("livros")
    fun received(livroInformation: EventInformation) {
        service.insert(LivroConverter.livroEventToLivro(livroInformation.livro))
    }

}