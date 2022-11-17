package cars

import components.Engine
import components.GPSNavigator
import components.Transmission
import components.TripComputer

data class Manual(
    var carType: CarType,
    var seats: Int,
    var engine: Engine,
    var transmission: Transmission?,
    var tripComputer: TripComputer?,
    var gpsNavigator: GPSNavigator?
)
