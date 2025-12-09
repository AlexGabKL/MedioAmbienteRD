package com.ministerio.medioambiente.ui.acerca

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ministerio.medioambiente.R
import com.ministerio.medioambiente.databinding.FragmentAcercaBinding

class AcercaFragment : Fragment() {

    private lateinit var binding: FragmentAcercaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentAcercaBinding.inflate(inflater, container, false)

        // Texto principal
        binding.txtTitulo.text = "Acerca del Proyecto"

        // Texto del párrafo descriptivo
        binding.txtDescripcion.text =
            "Este sistema fue desarrollado por dos estudiantes comprometidos con el " +
                    "cuidado del medio ambiente y la transformación digital del sector público.\n\n" +
                    "Nuestro objetivo es ofrecer una aplicación sencilla, accesible y útil " +
                    "para que los ciudadanos puedan consultar información ambiental, " +
                    "reportar incidentes y participar en iniciativas del Ministerio " +
                    "de Medio Ambiente de la República Dominicana."

        // Información de Alex
        binding.txtAlex.text = "👤 Alex Gabriel Kroumov Krumova\nMatrícula: 2023-0192"
        binding.imgAlex.setImageResource(R.drawable.alex)  // tu imagen real

        // Información del compañero
        binding.txtCompanero.text = "👤 Ángel Ramírez\nMatrícula: 2023-0291"
        binding.imgCompanero.setImageResource(R.drawable.companero)  // foto real de tu compañero

        return binding.root
    }
}
