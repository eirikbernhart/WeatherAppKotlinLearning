package com.wheaterapp.beiningbogen.weatherapp.domain.commands

public interface Command<out T> {
    fun execute(): T
}