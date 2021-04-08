package com.example.kotlinexam.model

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName
import java.io.Serializable

@Entity
class PropertiesModel : Serializable {

    @NonNull
    @PrimaryKey
    @SerializedName("id")
    @Expose
    private var id: String? = ""

    @SerializedName("name")
    @Expose
    private var name: String? = "null"

    @SerializedName("icon")
    @Expose
    private var icon: String? = "null"


    fun getName(): String? {
        return name
    }

    fun setName(name: String?) {
        this.name = name
    }

    fun getIcon(): String? {
        return icon
    }

    fun setIcon(icon: String?) {
        this.icon = icon
    }

    fun getId(): String? {
        return id
    }

    fun setId(id: String?) {
        this.id = id
    }
}