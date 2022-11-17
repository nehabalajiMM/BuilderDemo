package components

import cars.Car

class TripComputer {
    private var car: Car? = null
    fun setCar(car: Car?) {
        this.car = car
    }

    fun showFuelLevel() {
        println("Fuel level: " + car?.fuel)
    }

    fun showStatus() {
        if (car?.engine?.isStarted == true) {
            println("cars.Car is started")
        } else {
            println("cars.Car isn't started")
        }
    }
}