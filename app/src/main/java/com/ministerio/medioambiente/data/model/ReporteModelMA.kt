package com.ministerio.medioambiente.data.model

data class ReporteModelMA(
    val id: String,
    val titulo: String,
    val descripcion: String,
    val foto: String,
    val fecha: String,
    val estado: String,
    val comentario: String?,
    val latitud: String,
    val longitud: String
)
