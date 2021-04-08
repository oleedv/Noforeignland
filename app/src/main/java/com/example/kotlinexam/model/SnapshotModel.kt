package com.example.kotlinexam.model

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName




class SnapshotModel {
    @SerializedName("time")
    @Expose
    private var time: String? = null

    @SerializedName("reason")
    @Expose
    private var reason: String? = null

    fun getTime(): String? {
        return time
    }

    fun setTime(time: String?) {
        this.time = time
    }

    fun getReason(): String? {
        return reason
    }

    fun setReason(reason: String?) {
        this.reason = reason
    }
}