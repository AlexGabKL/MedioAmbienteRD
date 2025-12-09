package com.ministerio.medioambiente.ui.noticias

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ministerio.medioambiente.databinding.ItemNoticiaBinding

class NoticiasAdapter(private val lista: List<NoticiaModel>) :
    RecyclerView.Adapter<NoticiasAdapter.NoticiaViewHolder>() {

    inner class NoticiaViewHolder(val binding: ItemNoticiaBinding)
        : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoticiaViewHolder {
        val binding = ItemNoticiaBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return NoticiaViewHolder(binding)
    }

    override fun onBindViewHolder(holder: NoticiaViewHolder, position: Int) {
        val item = lista[position]

        holder.binding.txtTitulo.text = item.titulo
        holder.binding.txtDescripcion.text = item.descripcion

        Glide.with(holder.itemView.context)
            .load(item.imagen)
            .into(holder.binding.imgNoticia)
    }

    override fun getItemCount(): Int = lista.size
}
