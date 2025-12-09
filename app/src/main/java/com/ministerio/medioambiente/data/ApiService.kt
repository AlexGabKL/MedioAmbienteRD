package com.ministerio.medioambiente.data

import com.ministerio.medioambiente.data.model.*
import retrofit2.Call
import retrofit2.http.*

interface ApiService {

    // ----------------------------
    // SERVICIOS
    // ----------------------------
    @GET("servicios.php")
    fun getServicios(): Call<RespuestaServiciosMA>


    // ----------------------------
    // NOTICIAS
    // ----------------------------
    @GET("2cc7f3b3dbfc3e6c8b42")
    fun getNoticias(): Call<RespuestaNoticiasMA>



    // ----------------------------
    // VIDEOS EDUCATIVOS
    // ----------------------------
    @GET("videos.php")
    fun getVideos(): Call<RespuestaVideosMA>


    // ----------------------------
    // AREAS PROTEGIDAS
    // ----------------------------
    @GET("areas-protegidas.php")
    fun getAreas(): Call<RespuestaAreasMA>


    // ----------------------------
    // MEDIDAS AMBIENTALES
    // ----------------------------
    @GET("medidas.php")
    fun getMedidas(): Call<RespuestaMedidasMA>


    // ----------------------------
    // EQUIPO DEL MINISTERIO
    // ----------------------------
    @GET("equipo.php")
    fun getEquipo(): Call<RespuestaEquipoMA>


    // ----------------------------
    // VOLUNTARIADO / REGISTRO
    // ----------------------------
    @FormUrlEncoded
    @POST("registrar.php")
    fun registrar(
        @Field("cedula") cedula: String,
        @Field("nombre") nombre: String,
        @Field("correo") correo: String,
        @Field("clave") clave: String,
        @Field("telefono") telefono: String
    ): Call<LoginResponseMA>


    // ----------------------------
    // LOGIN
    // ----------------------------
    @FormUrlEncoded
    @POST("login.php")
    fun login(
        @Field("correo") correo: String,
        @Field("clave") clave: String
    ): Call<LoginResponseMA>


    // ----------------------------
    // REPORTAR DAÑO AMBIENTAL
    // ----------------------------
    @FormUrlEncoded
    @POST("reportar.php")
    fun reportar(
        @Field("titulo") titulo: String,
        @Field("descripcion") descripcion: String,
        @Field("foto") foto: String,
        @Field("latitud") latitud: String,
        @Field("longitud") longitud: String
    ): Call<LoginResponseMA>


    // ----------------------------
    // MIS REPORTES
    // ----------------------------
    @GET("mis-reportes.php")
    fun getMisReportes(
        @Query("correo") correo: String
    ): Call<RespuestaMisReportesMA>


    // ----------------------------
    // NORMATIVAS AMBIENTALES
    // ----------------------------
    @GET("normativas.php")
    fun getNormativas(): Call<RespuestaNormativasMA>

}
