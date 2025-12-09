package com.ministerio.medioambiente.data.model

data class RespuestaAreasMA(
    val exito: Boolean,
    val mensaje: String,
    val datos: List<AreaProtegidaModelMA>
)
