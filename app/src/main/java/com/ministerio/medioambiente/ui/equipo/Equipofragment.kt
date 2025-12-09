package com.ministerio.medioambiente.ui.equipo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ministerio.medioambiente.data.RetrofitClient
import com.ministerio.medioambiente.data.model.RespuestaEquipoMA
import com.ministerio.medioambiente.databinding.FragmentEquipoBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class EquipoFragment : Fragment() {

    private lateinit var binding: FragmentEquipoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentEquipoBinding.inflate(inflater, container, false)

        cargarEquipo()

        return binding.root
    }

    private fun cargarEquipo() {
        RetrofitClient.api.getEquipo().enqueue(object : Callback<RespuestaEquipoMA> {
            override fun onResponse(
                call: Call<RespuestaEquipoMA>,
                response: Response<RespuestaEquipoMA>
            ) {
                if (response.isSuccessful) {

                    val texto = response.body()?.datos?.joinToString("\n\n") {
                        "- ${it.nombre} (${it.puesto})"
                    }

                    binding.txtEquipo.text = texto ?: "No hay miembros registrados."
                }
            }

            override fun onFailure(call: Call<RespuestaEquipoMA>, t: Throwable) {
                binding.txtEquipo.text = "Error al cargar equipo."
            }
        })
    }
}
