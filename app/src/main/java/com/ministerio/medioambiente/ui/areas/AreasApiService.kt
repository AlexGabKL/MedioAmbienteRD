package com.ministerio.medioambiente.ui.areas

import retrofit2.Call
import retrofit2.http.GET

interface AreasApiService {

    @GET("areas")   // cambia por tu endpoint real
    fun getAreas(): Call<RespuestaAreasMA>
}
