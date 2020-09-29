package com.jesil.realproject.weatherforme.model


import com.google.gson.annotations.SerializedName

data class CurrentWeatherEntry(
    val cloudcover: Double,

    val feelslike: Double,

    val humidity: Double,

    @SerializedName("is_day")
    val isDay: String,

    @SerializedName("observation_time")
    val observationTime: String,

    val precip: Double,

    val pressure: Double,

    val temperature: Double,

    @SerializedName("uv_index")
    val uvIndex: Int,

    val visibility: Int,

    @SerializedName("weather_code")
    val weatherCode: Double,

    @SerializedName("weather_descriptions")
    val weatherDescriptions: List<String>,

    @SerializedName("weather_icons")
    val weatherIcons: List<String>,

    @SerializedName("wind_degree")
    val windDegree: Double,

    @SerializedName("wind_dir")
    val windDir: String,

    @SerializedName("wind_speed")
    val windSpeed: Double
)