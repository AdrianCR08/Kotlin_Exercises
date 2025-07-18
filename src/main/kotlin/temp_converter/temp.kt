package temp_converter

fun main() {
    /*printFinalTemperature(
        initialMeasurement = 27.0,
        "Celsius",
        finalUnit = "Fahrenheit",
        conversionFormula = { celsiusToFahrenheit(tempC = 27.0) }
    )

    printFinalTemperature(
        initialMeasurement = 350.0,
        initialUnit = "Kelvin",
        finalUnit = "Celsius",
        conversionFormula = { kelvinToCelsius(tempK = 350.0) }
    )

    printFinalTemperature(
        initialMeasurement = 10.0,
        initialUnit = "Fahrenheit",
        finalUnit = "Kelvin",
        conversionFormula = { fahrenheitToKelvin(tempF = 10.0) }
    )*/
    printFinalTemperature(27.0, "Celsius", "Fahrenheit") {9.0 / 5.0 * it + 32}
    printFinalTemperature(350.0, "Kelvin", "Celsius") {it - 273.15}
    printFinalTemperature(10.0, "Fahrenheit", "Kelvin") { 5.0 / 9.0 * (it - 32) + 273.15}

}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double

) {
    val finalMeasurement =  String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit." )

}

fun celsiusToFahrenheit(tempC: Double): Double {
    return tempC * 9/5 + 32
}

fun kelvinToCelsius(tempK: Double): Double {
    return tempK - 273.15
}

fun fahrenheitToKelvin(tempF: Double): Double {
    return (tempF - 32) * 5/9 + 273.15
}