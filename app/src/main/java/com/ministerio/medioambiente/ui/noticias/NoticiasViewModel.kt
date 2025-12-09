package com.ministerio.medioambiente.ui.noticias

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NoticiasViewModel : ViewModel() {

    private val repo = NoticiasRepository()

    // LiveData que observa el fragment
    private val _noticias = MutableLiveData<List<NoticiaModel>>()
    val noticias: LiveData<List<NoticiaModel>> get() = _noticias

    init {
        cargarNoticias()
    }

    private fun cargarNoticias() {
        _noticias.value = repo.obtenerNoticias()
    }
}
