package com.example.aplikacja_zainteresowania.modules

import android.content.Context
import androidx.room.Room
import com.example.aplikacja_zainteresowania.Repository
import com.example.aplikacja_zainteresowania.data.Dao
import com.example.aplikacja_zainteresowania.data.Database
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Singleton
    @Provides
    fun provideDatabase(@ApplicationContext applicationContext: Context):Database{
        return Room.databaseBuilder(
            applicationContext,
            Database::class.java,
            "zainteresowania_database"
        ).build()
    }
    @Singleton
    @Provides
    fun provideDao(database: Database): Dao {
        return database.dao()
    }
    @Singleton
    @Provides
    fun provideDatabaseRepository(calorieDao: Dao): Repository {
        return Repository(calorieDao)
    }
}