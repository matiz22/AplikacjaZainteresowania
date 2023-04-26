package com.example.aplikacja_zainteresowania.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Tabela(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val imie: String,
    val nazwisko: String,
    val plec: Boolean,
    val muzyka: Boolean,
    val film: Boolean
    )
