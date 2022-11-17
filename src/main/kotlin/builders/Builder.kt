package builders

import cars.CarType
import components.Engine
import components.GPSNavigator
import components.Transmission
import components.TripComputer

interface Builder {
    fun setCarType(type: CarType)
    fun setSeats(seats: Int)
    fun setEngine(engine: Engine)
    fun setTransmission(transmission: Transmission)
    fun setTripComputer(tripComputer: TripComputer)
    fun setGPSNavigator(gpsNavigator: GPSNavigator)
}