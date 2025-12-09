package com.ministerio.medioambiente.ui.areas

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object AreasRetrofitClient {

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://TU_API/") // CAMBIA ESTO
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val api: AreasApiService = retrofit.create(AreasApiService::class.java)
}
