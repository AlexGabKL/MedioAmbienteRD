package com.ministerio.medioambiente.data.model

data class RespuestaNoticiasMA(
    val exito: Boolean,
    val mensaje: String,
    val datos: List<NoticiaModelMA>
)
