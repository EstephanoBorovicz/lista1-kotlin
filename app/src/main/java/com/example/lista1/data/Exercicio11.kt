package com.example.lista1.data

import com.example.lista1.model.Exercicio
import java.util.Locale
import kotlin.random.Random.Default.nextFloat

class Exercicio11: Exercicio {
    override val id = 11
    override val title = "Conversor de temperatura"
    override fun run(): String {

        val temperaturaCelsius = (-50..100).random().toFloat() + nextFloat()
        val temperaturaCelsiusFormatada = String.format(Locale.forLanguageTag("pt-br"),
            "%.2f", temperaturaCelsius)

        val temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32.0
        val temperaturaFahrenheitFormatada = String.format(Locale.forLanguageTag("pt-br"),
            "%.2f", temperaturaFahrenheit)

        return "$temperaturaCelsiusFormatada °C equivalem à $temperaturaFahrenheitFormatada °F!"
    }

}