package com.example.kotlinexam.db

import androidx.room.*
import com.example.kotlinexam.model.PropertiesModel


@Dao
interface PropertiesDao {
    @Query("SELECT * FROM propertiesmodel")
    fun getAll(): List<PropertiesModel>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(storyModel: PropertiesModel)

    @Delete
    fun delete(storyModel: PropertiesModel)
}