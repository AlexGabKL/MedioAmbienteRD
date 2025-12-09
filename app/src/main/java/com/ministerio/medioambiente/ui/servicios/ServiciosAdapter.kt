package com.ministerio.medioambiente.ui.servicios

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.ministerio.medioambiente.R
import com.ministerio.medioambiente.data.model.ServicioModelMA

class ServiciosAdapter(
    context: Context,
    private val servicios: List<ServicioModelMA>
) : ArrayAdapter<ServicioModelMA>(context, 0, servicios) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = convertView ?: LayoutInflater.from(context)
            .inflate(R.layout.item_servicio, parent, false)

        val servicio = getItem(position)!!

        view.findViewById<TextView>(R.id.txtServicioNombre).text = servicio.nombre
        view.findViewById<TextView>(R.id.txtServicioDesc).text = servicio.descripcion

        return view
    }
}
