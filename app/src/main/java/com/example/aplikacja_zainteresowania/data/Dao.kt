package com.example.aplikacja_zainteresowania.data

import androidx.core.view.WindowInsetsCompat.Type.InsetsType
import androidx.room.Insert

@androidx.room.Dao
interface Dao {
    @Insert
    suspend fun insert(tabela: Tabela)
}