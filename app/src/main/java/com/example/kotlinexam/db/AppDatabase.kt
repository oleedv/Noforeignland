package com.example.kotlinexam.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.kotlinexam.model.PropertiesModel

@Database(
  entities = arrayOf(
//    FeatureModel::class,
//    GeometryModel::class,
    PropertiesModel::class
  ), version = 1,
exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
//  abstract fun featureDao(): FeatureDao
  abstract fun propertiesDao(): PropertiesDao
//  abstract fun geometryDao(): GeometryDao

  companion object {
    @Volatile
    private var INSTANCE: AppDatabase? = null

    fun getDatabase(context: Context): AppDatabase {
      val tempInstance = INSTANCE
      if (tempInstance != null) {
        return tempInstance
      }
      synchronized(this) {
        val instance = Room.databaseBuilder(
          context.applicationContext,
          AppDatabase::class.java,
          "example"
        ).allowMainThreadQueries().build()
        INSTANCE = instance
        return instance
      }
    }
  }
}




