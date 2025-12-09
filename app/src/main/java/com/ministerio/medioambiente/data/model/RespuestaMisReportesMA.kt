package com.ministerio.medioambiente.data.model

data class RespuestaMisReportesMA(
    val exito: Boolean,
    val mensaje: String,
    val datos: List<ReporteModelMA>
)
