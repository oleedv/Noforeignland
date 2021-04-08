package com.example.kotlinexam.model


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName
import java.io.Serializable


@Entity
class FeatureModel:Serializable {
    @SerializedName("id")
    @Expose
    @PrimaryKey
    private var id:Int? = 0

    @SerializedName("type")
    @Expose
    private var type: String? = "null"

    @SerializedName("properties")
    @Expose
    private var properties: PropertiesModel? = null

    @SerializedName("geometry")
    @Expose
    private var geometry: GeometryModel? = null

    fun getType(): String? {
        return type
    }

    fun setType(type: String?) {
        this.type = type
    }

    fun getProperties(): PropertiesModel? {
        return properties
    }

    fun setProperties(properties: PropertiesModel?) {
        this.properties = properties
    }

    fun getGeometry(): GeometryModel? {
        return geometry
    }

    fun setGeometry(geometry: GeometryModel?) {
        this.geometry = geometry
    }

    fun getId(): Int? {
        return id
    }

    fun setId(id: Int?) {
        this.id = id
    }
}