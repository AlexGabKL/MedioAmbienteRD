package com.ministerio.medioambiente.data.model

data class RespuestaNormativasMA(
    val exito: Boolean,
    val mensaje: String,
    val datos: List<NormativaModelMA>
)
