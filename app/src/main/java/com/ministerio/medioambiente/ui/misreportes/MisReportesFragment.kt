package com.ministerio.medioambiente.ui.misreportes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ministerio.medioambiente.databinding.FragmentMisreportesBinding

class MisReportesFragment : Fragment() {

    private lateinit var binding: FragmentMisreportesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMisreportesBinding.inflate(inflater, container, false)

        binding.txtMisReportes.text = """
            • Reporte #1 — Estado: En revisión
            
            • Reporte #2 — Estado: Recibido
            
            • Reporte #3 — Estado: Procesado
            
            • Reporte #4 — Estado: Enviado al departamento correspondiente

            • Reporte #5 — Estado: Pendiente de verificación

            • Reporte #6 — Estado: Clasificado como prioridad media

            • Reporte #7 — Estado: En proceso de evaluación técnica

            • Reporte #8 — Estado: A la espera de información adicional

            • Reporte #9 — Estado: Completado y archivado

            • Reporte #10 — Estado: Rechazado por datos insuficientes

        """.trimIndent()

        return binding.root
    }
}
