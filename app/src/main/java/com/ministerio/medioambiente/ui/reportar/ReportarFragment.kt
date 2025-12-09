package com.ministerio.medioambiente.ui.reportar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.ministerio.medioambiente.databinding.FragmentReportarBinding

class ReportarFragment : Fragment() {

    private lateinit var binding: FragmentReportarBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentReportarBinding.inflate(inflater, container, false)

        binding.btnEnviar.setOnClickListener {
            Toast.makeText(requireContext(), "Reporte enviado (demo).", Toast.LENGTH_SHORT).show()
        }

        return binding.root
    }
}
