package com.example.aplikacja_zainteresowania

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.aplikacja_zainteresowania.data.Tabela
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ZainteresowaniaViewModel @Inject constructor(
private val repository: Repository
) : ViewModel() {
    fun insert(tabela: Tabela){
        viewModelScope.launch {
            repository.insert(tabela)
        }
    }
}