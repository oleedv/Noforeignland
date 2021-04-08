package com.example.kotlinexam.model


import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName




class ResponseModel {
    @SerializedName("type")
    @Expose
    private var type: String? = null

    @SerializedName("features")
    @Expose
    private var features: List<FeatureModel?>? = null

    fun getType(): String? {
        return type
    }

    fun setType(type: String?) {
        this.type = type
    }

    fun getFeatures(): List<FeatureModel?>? {
        return features
    }

    fun setFeatures(features: List<FeatureModel?>?) {
        this.features = features
    }
}