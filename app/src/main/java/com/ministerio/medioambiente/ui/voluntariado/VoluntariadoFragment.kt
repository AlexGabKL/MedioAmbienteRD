package com.ministerio.medioambiente.ui.voluntariado

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.ministerio.medioambiente.databinding.FragmentVoluntariadoBinding

class VoluntariadoFragment : Fragment() {

    private lateinit var binding: FragmentVoluntariadoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentVoluntariadoBinding.inflate(inflater, container, false)

        binding.btnEnviarVoluntario.setOnClickListener {
            Toast.makeText(requireContext(), "Solicitud enviada (demo).", Toast.LENGTH_SHORT).show()
        }

        return binding.root
    }
}
