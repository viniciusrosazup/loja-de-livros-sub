package br.com.example.livro.core.model

data class EventInformation(
    val events: Events = Events.SAVE_PRODUCT,
    val livro: Livro = Livro(null, "", "", "", "", 0.0)
)