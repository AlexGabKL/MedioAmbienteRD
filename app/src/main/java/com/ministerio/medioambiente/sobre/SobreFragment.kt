package com.ministerio.medioambiente.ui.sobre

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ministerio.medioambiente.databinding.FragmentSobreBinding

class SobreFragment : Fragment() {

    private lateinit var binding: FragmentSobreBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSobreBinding.inflate(inflater, container, false)

        binding.txtTitulo.text = "Ministerio de Medio Ambiente RD"
        binding.txtDescripcion.text = "Aplicación oficial demostrativa para educación ambiental."

        return binding.root
    }
}
