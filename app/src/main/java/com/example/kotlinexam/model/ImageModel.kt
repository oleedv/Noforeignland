package com.example.kotlinexam.model

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName




class ImageModel {
    @SerializedName("id")
    @Expose
    private var id: Int? = null

    @SerializedName("servingUrl")
    @Expose
    private var servingUrl: String? = null

    @SerializedName("caption")
    @Expose
    private var caption: String? = null

    @SerializedName("uploadedByUserId")
    @Expose
    private var uploadedByUserId: Int? = null

    @SerializedName("uploadedByUserDisplayName")
    @Expose
    private var uploadedByUserDisplayName: String? = null

    @SerializedName("uploadedDate")
    @Expose
    private var uploadedDate: Int? = null

    @SerializedName("likes")
    @Expose
    private var likes: List<Int?>? = null

    @SerializedName("width")
    @Expose
    private var width: Int? = null

    @SerializedName("height")
    @Expose
    private var height: Int? = null

    fun getId(): Int? {
        return id
    }

    fun setId(id: Int?) {
        this.id = id
    }

    fun getServingUrl(): String? {
        return servingUrl
    }

    fun setServingUrl(servingUrl: String?) {
        this.servingUrl = servingUrl
    }

    fun getCaption(): String? {
        return caption
    }

    fun setCaption(caption: String?) {
        this.caption = caption
    }

    fun getUploadedByUserId(): Int? {
        return uploadedByUserId
    }

    fun setUploadedByUserId(uploadedByUserId: Int?) {
        this.uploadedByUserId = uploadedByUserId
    }

    fun getUploadedByUserDisplayName(): String? {
        return uploadedByUserDisplayName
    }

    fun setUploadedByUserDisplayName(uploadedByUserDisplayName: String?) {
        this.uploadedByUserDisplayName = uploadedByUserDisplayName
    }

    fun getUploadedDate(): Int? {
        return uploadedDate
    }

    fun setUploadedDate(uploadedDate: Int?) {
        this.uploadedDate = uploadedDate
    }

    fun getLikes(): List<Int?>? {
        return likes
    }

    fun setLikes(likes: List<Int?>?) {
        this.likes = likes
    }

    fun getWidth(): Int? {
        return width
    }

    fun setWidth(width: Int?) {
        this.width = width
    }

    fun getHeight(): Int? {
        return height
    }

    fun setHeight(height: Int?) {
        this.height = height
    }
}