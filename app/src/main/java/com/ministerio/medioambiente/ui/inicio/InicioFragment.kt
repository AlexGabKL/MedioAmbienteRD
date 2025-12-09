package com.ministerio.medioambiente.ui.inicio

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.ministerio.medioambiente.R
import com.ministerio.medioambiente.databinding.FragmentInicioBinding

class InicioFragment : Fragment() {

    private lateinit var binding: FragmentInicioBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentInicioBinding.inflate(inflater, container, false)

        configurarSlider()
        configurarTextos()

        return binding.root
    }

    private fun configurarSlider() {

        val imagenes: List<Int> = listOf(
            R.drawable.slide1,
            R.drawable.slide2,
            R.drawable.slide3
        )

        val textos: List<String> = listOf(
            "Protejamos nuestros bosques",
            "Cuidemos nuestras playas",
            "Preservemos la biodiversidad"
        )

        val adapter = SliderAdapter(imagenes, textos)
        binding.slider.adapter = adapter
        binding.slider.orientation = ViewPager2.ORIENTATION_HORIZONTAL
    }

    private fun configurarTextos() {
        binding.txtBienvenida.text = "Protegiendo el medio ambiente de la República Dominicana."
        binding.txtDescripcion.text =
            "Únete a los esfuerzos para conservar nuestros recursos naturales, proteger la biodiversidad y fomentar una cultura de sostenibilidad."
    }
}
