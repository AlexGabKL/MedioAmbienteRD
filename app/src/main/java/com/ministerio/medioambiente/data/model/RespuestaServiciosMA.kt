package com.ministerio.medioambiente.data.model

data class RespuestaServiciosMA(
    val exito: Boolean,
    val mensaje: String,
    val datos: List<ServicioModelMA>
)
