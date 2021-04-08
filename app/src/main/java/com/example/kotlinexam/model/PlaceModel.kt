package com.example.kotlinexam.model

import android.media.Image
import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName
import java.io.Serializable


class PlaceModel : Serializable {
    @SerializedName("id")
    @Expose
    private var id: String? = ""

    @SerializedName("type")
    @Expose
    private var type: String? = null

    @SerializedName("name")
    @Expose
    private var name: String? = null

    @SerializedName("lat")
    @Expose
    private var lat: Double? = null

    @SerializedName("lon")
    @Expose
    private var lon: Double? = null

    @SerializedName("countryCode")
    @Expose
    private var countryCode: String? = null

    @SerializedName("comments")
    @Expose
    private var comments: String? = null

    @SerializedName("meta")
    @Expose
    private var meta: MetaModel? = null

    @SerializedName("blogCount")
    @Expose
    private var blogCount: String? = null

    @SerializedName("externalLink1")
    @Expose
    private var externalLink1: String? = null

    @SerializedName("externalLinkDescription1")
    @Expose
    private var externalLinkDescription1: String? = null

    @SerializedName("externalLink2")
    @Expose
    private var externalLink2: String? = null

    @SerializedName("externalLinkDescription2")
    @Expose
    private var externalLinkDescription2: String? = null

    @SerializedName("dieselPrice")
    @Expose
    private var dieselPrice: Double? = null

    @SerializedName("dieselPriceUpdatedMs")
    @Expose
    private var dieselPriceUpdatedMs: String? = null

    @SerializedName("gasolinePrice")
    @Expose
    private var gasolinePrice: Double? = null

    @SerializedName("gasolinePriceUpdatedMs")
    @Expose
    private var gasolinePriceUpdatedMs: String? = null

    @SerializedName("maxLiftWeightTonnes")
    @Expose
    private var maxLiftWeightTonnes: String? = null

    @SerializedName("allowsExternalContractors")
    @Expose
    private var allowsExternalContractors: Boolean? = null

    @SerializedName("canWorkOnOwnBoat")
    @Expose
    private var canWorkOnOwnBoat: Boolean? = null

    @SerializedName("canStayOnOwnBoat")
    @Expose
    private var canStayOnOwnBoat: Boolean? = null

    @SerializedName("priceBandHighSeason")
    @Expose
    private var priceBandHighSeason: String? = null

    @SerializedName("priceBandLowSeason")
    @Expose
    private var priceBandLowSeason: String? = null

    @SerializedName("wStringerCommunity")
    @Expose
    private var wStringerCommunity: Boolean? = null

    @SerializedName("protectionFrom")
    @Expose
    private var protectionFrom: String? = null

    @SerializedName("addedMs")
    @Expose
    private var addedMs: String? = null

    @SerializedName("addedBy")
    @Expose
    private var addedBy: String? = null

    @SerializedName("addedById")
    @Expose
    private var addedById: String? = null

    @SerializedName("updatedMs")
    @Expose
    private var updatedMs: String? = null

    @SerializedName("updatedBy")
    @Expose
    private var updatedBy: String? = null

    @SerializedName("updatedById")
    @Expose
    private var updatedById: String? = null

    @SerializedName("col")
    @Expose
    private var col: String? = null

    @SerializedName("icon")
    @Expose
    private var icon: String? = null

    @SerializedName("mapboxIcon")
    @Expose
    private var mapboxIcon: String? = null

    @SerializedName("stars")
    @Expose
    private var stars: String? = null

    @SerializedName("banner")
    @Expose
    private var banner: String? = null

    @SerializedName("images")
    @Expose
    private var images: List<Image?>? = null

    @SerializedName("reviews")
    @Expose
    private var reviews: List<String?>? = null

    fun getId(): String? {
        return id
    }

    fun setId(id: String?) {
        this.id = id
    }

    fun getType(): String? {
        return type
    }

    fun setType(type: String?) {
        this.type = type
    }

    fun getName(): String? {
        return name
    }

    fun setName(name: String?) {
        this.name = name
    }

    fun getLat(): Double? {
        return lat
    }

    fun setLat(lat: Double?) {
        this.lat = lat
    }

    fun getLon(): Double? {
        return lon
    }

    fun setLon(lon: Double?) {
        this.lon = lon
    }

    fun getCountryCode(): String? {
        return countryCode
    }

    fun setCountryCode(countryCode: String?) {
        this.countryCode = countryCode
    }

    fun getComments(): String? {
        return comments
    }

    fun setComments(comments: String?) {
        this.comments = comments
    }

    fun getMeta(): MetaModel? {
        return meta
    }

    fun setMeta(meta: MetaModel?) {
        this.meta = meta
    }

    fun getBlogCount(): String? {
        return blogCount
    }

    fun setBlogCount(blogCount: String?) {
        this.blogCount = blogCount
    }

    fun getExternalLink1(): String? {
        return externalLink1
    }

    fun setExternalLink1(externalLink1: String?) {
        this.externalLink1 = externalLink1
    }

    fun getExternalLinkDescription1(): String? {
        return externalLinkDescription1
    }

    fun setExternalLinkDescription1(externalLinkDescription1: String?) {
        this.externalLinkDescription1 = externalLinkDescription1
    }

    fun getExternalLink2(): String? {
        return externalLink2
    }

    fun setExternalLink2(externalLink2: String?) {
        this.externalLink2 = externalLink2
    }

    fun getExternalLinkDescription2(): String? {
        return externalLinkDescription2
    }

    fun setExternalLinkDescription2(externalLinkDescription2: String?) {
        this.externalLinkDescription2 = externalLinkDescription2
    }

    fun getDieselPrice(): Double? {
        return dieselPrice
    }

    fun setDieselPrice(dieselPrice: Double?) {
        this.dieselPrice = dieselPrice
    }

    fun getDieselPriceUpdatedMs(): String? {
        return dieselPriceUpdatedMs
    }

    fun setDieselPriceUpdatedMs(dieselPriceUpdatedMs: String?) {
        this.dieselPriceUpdatedMs = dieselPriceUpdatedMs
    }

    fun getGasolinePrice(): Double? {
        return gasolinePrice
    }

    fun setGasolinePrice(gasolinePrice: Double?) {
        this.gasolinePrice = gasolinePrice
    }

    fun getGasolinePriceUpdatedMs(): String? {
        return gasolinePriceUpdatedMs
    }

    fun setGasolinePriceUpdatedMs(gasolinePriceUpdatedMs: String?) {
        this.gasolinePriceUpdatedMs = gasolinePriceUpdatedMs
    }

    fun getMaxLiftWeightTonnes(): String? {
        return maxLiftWeightTonnes
    }

    fun setMaxLiftWeightTonnes(maxLiftWeightTonnes: String?) {
        this.maxLiftWeightTonnes = maxLiftWeightTonnes
    }

    fun getAllowsExternalContractors(): Boolean? {
        return allowsExternalContractors
    }

    fun setAllowsExternalContractors(allowsExternalContractors: Boolean?) {
        this.allowsExternalContractors = allowsExternalContractors
    }

    fun getCanWorkOnOwnBoat(): Boolean? {
        return canWorkOnOwnBoat
    }

    fun setCanWorkOnOwnBoat(canWorkOnOwnBoat: Boolean?) {
        this.canWorkOnOwnBoat = canWorkOnOwnBoat
    }

    fun getCanStayOnOwnBoat(): Boolean? {
        return canStayOnOwnBoat
    }

    fun setCanStayOnOwnBoat(canStayOnOwnBoat: Boolean?) {
        this.canStayOnOwnBoat = canStayOnOwnBoat
    }

    fun getPriceBandHighSeason(): String? {
        return priceBandHighSeason
    }

    fun setPriceBandHighSeason(priceBandHighSeason: String?) {
        this.priceBandHighSeason = priceBandHighSeason
    }

    fun getPriceBandLowSeason(): String? {
        return priceBandLowSeason
    }

    fun setPriceBandLowSeason(priceBandLowSeason: String?) {
        this.priceBandLowSeason = priceBandLowSeason
    }

    fun getWStringerCommunity(): Boolean? {
        return wStringerCommunity
    }

    fun setWStringerCommunity(wStringerCommunity: Boolean?) {
        this.wStringerCommunity = wStringerCommunity
    }

    fun getProtectionFrom(): String? {
        return protectionFrom
    }

    fun setProtectionFrom(protectionFrom: String?) {
        this.protectionFrom = protectionFrom
    }

    fun getAddedMs(): String? {
        return addedMs
    }

    fun setAddedMs(addedMs: String?) {
        this.addedMs = addedMs
    }

    fun getAddedBy(): String? {
        return addedBy
    }

    fun setAddedBy(addedBy: String?) {
        this.addedBy = addedBy
    }

    fun getAddedById(): String? {
        return addedById
    }

    fun setAddedById(addedById: String?) {
        this.addedById = addedById
    }

    fun getUpdatedMs(): String? {
        return updatedMs
    }

    fun setUpdatedMs(updatedMs: String?) {
        this.updatedMs = updatedMs
    }

    fun getUpdatedBy(): String? {
        return updatedBy
    }

    fun setUpdatedBy(updatedBy: String?) {
        this.updatedBy = updatedBy
    }

    fun getUpdatedById(): String? {
        return updatedById
    }

    fun setUpdatedById(updatedById: String?) {
        this.updatedById = updatedById
    }

    fun getCol(): String? {
        return col
    }

    fun setCol(col: String?) {
        this.col = col
    }

    fun getIcon(): String? {
        return icon
    }

    fun setIcon(icon: String?) {
        this.icon = icon
    }

    fun getMapboxIcon(): String? {
        return mapboxIcon
    }

    fun setMapboxIcon(mapboxIcon: String?) {
        this.mapboxIcon = mapboxIcon
    }

    fun getStars(): String? {
        return stars
    }

    fun setStars(stars: String?) {
        this.stars = stars
    }

    fun getBanner(): String? {
        return banner
    }

    fun setBanner(banner: String?) {
        this.banner = banner
    }

    fun getImages(): List<Image?>? {
        return images
    }

    fun setImages(images: List<Image?>?) {
        this.images = images
    }

    fun getReviews(): List<String?>? {
        return reviews
    }

    fun setReviews(reviews: List<String?>?) {
        this.reviews = reviews
    }
}