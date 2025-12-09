package com.ministerio.medioambiente.ui.areas

data class RespuestaAreasMA(
    val datos: List<AreaItem>
)

data class AreaItem(
    val nombre: String,
    val descripcion: String
)
