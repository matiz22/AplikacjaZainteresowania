package com.example.aplikacja_zainteresowania

import com.example.aplikacja_zainteresowania.data.Dao
import com.example.aplikacja_zainteresowania.data.Tabela
import javax.inject.Inject

class Repository @Inject constructor(private val dao: Dao) {
    suspend fun insert(tabela: Tabela){
        dao.insert(tabela)
    }
}