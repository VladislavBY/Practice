package by.vladislavpopkov.dagger

import javax.inject.Inject


class Car @Inject constructor(private var engine: Engine) {
    init {
        println("Car")
    }
}

class Engine @Inject constructor(private var fuel: Fuel) {
    init {
        println("Engine")
    }
}

class Fuel @Inject constructor() {
    init {
        println("Fuel")
    }

    private val fuelType = if (BuildConfig.DEBUG) {
        "benzine"
    } else {
        "diesel"
    }
}

fun main() {
    val car: Car = DaggerDaggerComponent.create().getCar()
}