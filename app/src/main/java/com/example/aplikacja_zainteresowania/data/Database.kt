package com.example.aplikacja_zainteresowania.data

import androidx.room.RoomDatabase

@androidx.room.Database(entities = [Tabela::class], version = 1, exportSchema = false)
abstract class Database: RoomDatabase() {
    abstract fun dao():Dao
}