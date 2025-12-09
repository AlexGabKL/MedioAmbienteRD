package com.ministerio.medioambiente.ui.noticias

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class NoticiasFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflar el layout normalmente (sin binding)
        val view = inflater.inflate(
            com.ministerio.medioambiente.R.layout.fragment_noticias,
            container,
            false
        )

        // RecyclerView desde el layout
        val recycler = view.findViewById<RecyclerView>(com.ministerio.medioambiente.R.id.recyclerNoticias)
        recycler.layoutManager = LinearLayoutManager(requireContext())

        // Lista fija de noticias
        val noticias = listOf(
            Noticia("Protección de los Manglares", "Los manglares del país siguen siendo una prioridad. Equipos del ministerio realizaron jornadas de limpieza y monitoreo para asegurar su conservación y la protección de la biodiversidad local."),
            Noticia("Nueva Jornada de Reforestación Nacional", "Más de 2,000 voluntarios participaron en una jornada de reforestación en distintas provincias. Se plantaron especies nativas para recuperar zonas afectadas por la deforestación."),
            Noticia("Campaña de Reciclaje en Comunidades Urbanas", "Inició una nueva campaña para fomentar la separación de residuos en barrios urbanos. El objetivo es reducir desechos en vertederos y promover el reciclaje desde los hogares."),
            Noticia("Conservación de Especies en Peligro", "Técnicos especializados continúan el monitoreo de aves y reptiles en riesgo. Se reforzaron medidas para proteger sus hábitats naturales y evitar la disminución de sus poblaciones."),
            Noticia("Programas Educativos para Escuelas", "El ministerio lanzó talleres ambientales en más de 30 escuelas. Los estudiantes aprendieron sobre el cuidado del agua, reciclaje y preservación de recursos naturales.")
        )

        // Adaptador simple
        recycler.adapter = NoticiasAdapterSimple(noticias)

        return view
    }
}

// ----------------------
// MODELO SIMPLE
// ----------------------
data class Noticia(val titulo: String, val descripcion: String)

// ----------------------
// ADAPTADOR SIMPLE
// ----------------------
class NoticiasAdapterSimple(
    private val lista: List<Noticia>
) : RecyclerView.Adapter<NoticiasAdapterSimple.ViewHolder>() {

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val titulo = view.findViewById<android.widget.TextView>(android.R.id.text1)
        val descripcion = view.findViewById<android.widget.TextView>(android.R.id.text2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // Layout manual sencillo
        val layout = android.widget.LinearLayout(parent.context).apply {
            orientation = android.widget.LinearLayout.VERTICAL
            setPadding(30, 30, 30, 30)

            val titleText = android.widget.TextView(context).apply {
                id = android.R.id.text1
                textSize = 20f
                setTextColor(android.graphics.Color.BLACK)
            }

            val descText = android.widget.TextView(context).apply {
                id = android.R.id.text2
                textSize = 16f
                setTextColor(android.graphics.Color.DKGRAY)
            }

            addView(titleText)
            addView(descText)
        }

        return ViewHolder(layout)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = lista[position]
        holder.titulo.text = item.titulo
        holder.descripcion.text = item.descripcion
    }

    override fun getItemCount(): Int = lista.size
}
