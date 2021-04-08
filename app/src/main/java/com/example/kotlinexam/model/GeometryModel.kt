package com.example.kotlinexam.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName
import java.io.Serializable


@Entity
class GeometryModel: Serializable {
    @SerializedName("id")
    @Expose
    @PrimaryKey
    private var id:Int? = 0

    @SerializedName("type")
    @Expose
    private var type: String? = "null"

    @SerializedName("coordinates")
    @Expose
    private var coordinates: List<Double?>? = null

    fun getType(): String? {
        return type
    }

    fun setType(type: String?) {
        this.type = type
    }

    fun getCoordinates(): List<Double?>? {
        return coordinates
    }

    fun setCoordinates(coordinates: List<Double?>?) {
        this.coordinates = coordinates
    }

    fun getId(): Int? {
        return id
    }

    fun setId(id: Int?) {
        this.id = id
    }
}