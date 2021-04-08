package com.example.kotlinexam.db

import androidx.room.*
import com.example.kotlinexam.model.GeometryModel


@Dao
interface GeometryDao {
    @Query("SELECT * FROM geometrymodel")
    fun getAll(): List<GeometryModel>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(storyModel: GeometryModel)

    @Delete
    fun delete(storyModel: GeometryModel)
}