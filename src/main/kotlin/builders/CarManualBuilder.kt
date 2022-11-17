package builders

import cars.CarType
import components.Engine
import components.GPSNavigator
import cars.Manual
import components.Transmission
import components.TripComputer

class CarManualBuilder: Builder {

    private lateinit var type: CarType
    private var seats = 0
    private lateinit var engine: Engine
    private var transmission: Transmission? = null
    private var tripComputer: TripComputer? = null
    private var gpsNavigator: GPSNavigator? = null

    override fun setCarType(type: CarType) {
        this.type = type
    }

    override fun setSeats(seats: Int) {
        this.seats = seats
    }

    override fun setEngine(engine: Engine) {
        this.engine = engine
    }

    override fun setTransmission(transmission: Transmission) {
        this.transmission = transmission
    }

    override fun setTripComputer(tripComputer: TripComputer) {
        this.tripComputer = tripComputer
    }

    override fun setGPSNavigator(gpsNavigator: GPSNavigator) {
        this.gpsNavigator = gpsNavigator
    }

    fun getResult(): Manual {
        return Manual(type, seats, engine, transmission, tripComputer, gpsNavigator)
    }

    fun print(): String {
        var info = ""
        info += "Type of car: $type\n"
        info += "Count of seats: $seats\n"
        info += "components.Engine: volume - ${engine.volume}; mileage - ${engine.mileage}\n"
        info += "components.Transmission: $transmission\n"
        info += if (tripComputer != null) {
            "Trip Computer: Functional\n"
        } else {
            "Trip Computer: N/A\n"
        }
        info += if (gpsNavigator != null) {
            " GPS Navigator: Functional\n"
        } else {
            "GPS Navigator: N/A\n"
        }
        return info
    }
}