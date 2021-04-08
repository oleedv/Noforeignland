package com.example.kotlinexam.model

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName


class SpotModel {
    @SerializedName("snapshots")
    @Expose
    private var snapshots: List<SnapshotModel?>? = null

    @SerializedName("place")
    @Expose
    private var place: PlaceModel? = null

    fun getSnapshots(): List<SnapshotModel?>? {
        return snapshots
    }

    fun setSnapshots(snapshots: List<SnapshotModel?>?) {
        this.snapshots = snapshots
    }

    fun getPlace(): PlaceModel? {
        return place
    }

    fun setPlace(place: PlaceModel?) {
        this.place = place
    }
}