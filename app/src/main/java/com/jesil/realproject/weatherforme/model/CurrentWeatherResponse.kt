package com.jesil.realproject.weatherforme.model

import com.google.gson.annotations.SerializedName


data class CurrentWeatherResponse(
    @SerializedName("current")
    val current: CurrentWeatherEntry,

    val location: Location,

    val request: Request
)