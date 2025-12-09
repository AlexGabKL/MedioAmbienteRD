package com.ministerio.medioambiente.data.model

data class RespuestaVideosMA(
    val exito: Boolean,
    val mensaje: String,
    val datos: List<VideoModelMA>
)
