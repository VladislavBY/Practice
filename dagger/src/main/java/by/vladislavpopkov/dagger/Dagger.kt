package by.vladislavpopkov.dagger

import android.content.Context
import javax.inject.Inject


class Car @Inject constructor(private var engine: Engine, var context: Context) {
    val fuelType = engine.fuelType
}

class Engine @Inject constructor(private var fuel: Fuel) {
    val fuelType = fuel.fuelData.fuelType
}

class Fuel @Inject constructor(val fuelData: FuelDataInt) {
}

data class FuelData(override val fuelType: String) : FuelDataInt {
}