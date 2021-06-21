package br.com.example.livro.infrastructre.model

import br.com.example.livro.core.model.Events

data class EventInformation(
    val events: Events = Events.SAVE_PRODUCT,
    val livro: LivroEvent = LivroEvent(null, "", "", "", "", 0.0)
)