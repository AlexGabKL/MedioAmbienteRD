package com.ministerio.medioambiente.ui.normativas

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ministerio.medioambiente.databinding.FragmentNormativasBinding

class NormativasFragment : Fragment() {

    private lateinit var binding: FragmentNormativasBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNormativasBinding.inflate(inflater, container, false)

        binding.txtNormativas.text = """
            • Ley 64-00 — Medio Ambiente y Recursos Naturales
            • Decreto 233-17 — Gestión Ambiental Nacional
            • Reglamento 12-20 — Conservación de Áreas Protegidas
        """.trimIndent()

        return binding.root
    }
}
