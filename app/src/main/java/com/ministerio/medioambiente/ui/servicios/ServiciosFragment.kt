package com.ministerio.medioambiente.ui.servicios

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ministerio.medioambiente.data.RetrofitClient
import com.ministerio.medioambiente.data.model.RespuestaServiciosMA
import com.ministerio.medioambiente.databinding.FragmentServiciosBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ServiciosFragment : Fragment() {

    private lateinit var binding: FragmentServiciosBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentServiciosBinding.inflate(inflater, container, false)

        cargarServicios()

        return binding.root
    }

    private fun cargarServicios() {
        RetrofitClient.api.getServicios().enqueue(object : Callback<RespuestaServiciosMA> {
            override fun onResponse(
                call: Call<RespuestaServiciosMA>,
                response: Response<RespuestaServiciosMA>
            ) {
                if (response.isSuccessful) {
                    val datos = response.body()?.datos ?: emptyList()

                    binding.listServicios.adapter =
                        ServiciosAdapter(requireContext(), datos)
                }
            }

            override fun onFailure(call: Call<RespuestaServiciosMA>, t: Throwable) {}
        })
    }
}
