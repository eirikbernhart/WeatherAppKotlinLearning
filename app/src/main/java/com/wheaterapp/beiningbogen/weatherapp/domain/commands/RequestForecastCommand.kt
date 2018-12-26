package com.wheaterapp.beiningbogen.weatherapp.domain.commands

import com.wheaterapp.beiningbogen.weatherapp.data.ForecastRequest
import com.wheaterapp.beiningbogen.weatherapp.domain.mappers.ForecastDataMapper
import com.wheaterapp.beiningbogen.weatherapp.domain.model.ForecastList

class RequestForecastCommand(private val zipCode: String) : Command<ForecastList> {
    override fun execute(): ForecastList {
        val forecastRequest = ForecastRequest(zipCode)
        return ForecastDataMapper().convertFromDataModel(forecastRequest.execute())
    }
}