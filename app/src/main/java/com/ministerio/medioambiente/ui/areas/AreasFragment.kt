package com.ministerio.medioambiente.ui.areas

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ministerio.medioambiente.databinding.FragmentAreasBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import com.ministerio.medioambiente.data.RetrofitClient
import com.ministerio.medioambiente.data.model.RespuestaAreasMA

class AreasFragment : Fragment() {

    private lateinit var binding: FragmentAreasBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAreasBinding.inflate(inflater, container, false)

        cargarAreas()

        return binding.root
    }

    private fun cargarAreas() {

        val api = RetrofitClient.api

        api.getAreas().enqueue(object : Callback<RespuestaAreasMA> {
            override fun onResponse(
                call: Call<RespuestaAreasMA>,
                response: Response<RespuestaAreasMA>
            ) {
                if (response.isSuccessful) {

                    val lista = response.body()?.datos

                    val texto = lista?.joinToString("\n\n") { area ->
                        "${area.nombre}\n${area.descripcion}"
                    }

                    binding.txtAreas.text = texto ?: "No hay áreas protegidas disponibles."
                } else {
                    binding.txtAreas.text = "Error al cargar áreas."
                }
            }

            override fun onFailure(call: Call<RespuestaAreasMA>, t: Throwable) {
                binding.txtAreas.text = "Error al conectar con el servidor."
            }
        })
    }
}
