package com.example.kotlinexam.db

import androidx.room.*
import com.example.kotlinexam.model.FeatureModel


@Dao
interface FeatureDao {
    @Query("SELECT * FROM featureModel")
    fun getAll(): List<FeatureModel>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(storyModel: FeatureModel)

    @Delete
    fun delete(storyModel: FeatureModel)
}