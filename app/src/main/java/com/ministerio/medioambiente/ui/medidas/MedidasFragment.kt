package com.ministerio.medioambiente.ui.medidas

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ministerio.medioambiente.data.RetrofitClient
import com.ministerio.medioambiente.data.model.RespuestaMedidasMA
import com.ministerio.medioambiente.databinding.FragmentMedidasBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MedidasFragment : Fragment() {

    private lateinit var binding: FragmentMedidasBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMedidasBinding.inflate(inflater, container, false)

        cargarMedidas()

        return binding.root
    }

    private fun cargarMedidas() {
        RetrofitClient.api.getMedidas().enqueue(object : Callback<RespuestaMedidasMA> {
            override fun onResponse(
                call: Call<RespuestaMedidasMA>,
                response: Response<RespuestaMedidasMA>
            ) {
                if (response.isSuccessful) {

                    val texto = response.body()?.datos?.joinToString("\n\n") {
                        "- ${it.titulo}\n${it.descripcion}"
                    }

                    binding.txtMedidas.text = texto ?: "No hay medidas disponibles."
                }
            }

            override fun onFailure(call: Call<RespuestaMedidasMA>, t: Throwable) {
                binding.txtMedidas.text = "Error al cargar las medidas."
            }
        })
    }
}
