package com.ministerio.medioambiente.ui.noticias

class NoticiasRepository {

    fun obtenerNoticias(): List<NoticiaModel> {
        return listOf(
            NoticiaModel("Título 1", "Descripción 1", "https://www.google.com"),
            NoticiaModel("Título 2", "Descripción 2", "https://www.google.com"),
            NoticiaModel("Título 3", "Descripción 3", "https://www.google.com")
        )
    }
}
