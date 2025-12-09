package com.ministerio.medioambiente.ui.noticias

import retrofit2.http.GET

interface NoticiasApiService {

    @GET("noticias.json")
    suspend fun obtenerNoticias(): List<NoticiaModel>

    companion object {
        const val BASE_URL = "https://tu-api-o-json-en-github.com/"
    }
}
