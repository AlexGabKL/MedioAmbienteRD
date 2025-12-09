package com.ministerio.medioambiente.ui.inicio

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ministerio.medioambiente.databinding.ItemSlideBinding

class SliderAdapter(
    private val imagenes: List<Int>,
    private val textos: List<String>
) : RecyclerView.Adapter<SliderAdapter.SliderViewHolder>() {

    inner class SliderViewHolder(val binding: ItemSlideBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SliderViewHolder {
        val binding = ItemSlideBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return SliderViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SliderViewHolder, position: Int) {
        holder.binding.imgSlide.setImageResource(imagenes[position])
        holder.binding.txtSlide.text = textos[position]
    }

    override fun getItemCount(): Int = imagenes.size
}
