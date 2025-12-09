package com.ministerio.medioambiente.ui.videos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ministerio.medioambiente.databinding.FragmentVideosBinding

class VideosFragment : Fragment() {

    private lateinit var binding: FragmentVideosBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentVideosBinding.inflate(inflater, container, false)

        binding.txtVideos.text = """
            🎬 Videos Educativos Disponibles:

            • Cómo reciclar correctamente
            • Cuidado de áreas protegidas
            • Importancia de los manglares
        """.trimIndent()

        return binding.root
    }
}
