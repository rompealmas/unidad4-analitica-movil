package com.practica.analiticamovil.models

import com.google.gson.annotations.SerializedName

data class ClimaResponse(
    @SerializedName("current_weather")
    val climaActual: ClimaActual
)

data class ClimaActual(
    @SerializedName("temperature")
    val temperatura: Double,
    @SerializedName("windspeed")
    val velocidadViento: Double,
    @SerializedName("time")
    val horaMedicion: String
)