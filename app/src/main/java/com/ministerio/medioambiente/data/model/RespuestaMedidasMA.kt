package com.ministerio.medioambiente.data.model

data class RespuestaMedidasMA(
    val exito: Boolean,
    val mensaje: String,
    val datos: List<MedidaModelMA>
)
