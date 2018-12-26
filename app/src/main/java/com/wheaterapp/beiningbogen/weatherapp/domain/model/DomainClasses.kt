package com.wheaterapp.beiningbogen.weatherapp.domain.model

data class ForecastList(val city: String, val contry: String, val dailyForecast:List<Forecast>)

data class Forecast(val date: String, val description: String, val high: Int, val low: Int)