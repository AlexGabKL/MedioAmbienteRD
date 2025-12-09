package com.ministerio.medioambiente.data.model

data class RespuestaEquipoMA(
    val exito: Boolean,
    val mensaje: String,
    val datos: List<MiembroEquipoMA>
)
