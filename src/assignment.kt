fun main() {
    var pati=Car("subaru","mustand","white",14)
    pati.carry(20)
    println("I am a${pati.make}${pati.model}${pati.color}${pati.capacity}")

   println ( pati.calculateParkingFees(6))

    var basi = Car.Bus("subaru","mustand","white",14)
    println(basi.maxTripFare(300.toDouble()*pati.capacity))
    println()











}
open class Car(var make:String,var model:String,var color:String,var capacity:Int) {
    fun carry(people: Int) {
        println(" carry$people passangers")
        var people = people - capacity
        if (people <= capacity) {
            println(" carry$people passangers")
        } else {
            println("over capacity by$people")
        }
    }

    fun calculateParkingFees(hours: Int): Int {
        return hours * 20
    }


    class Bus(var make: String, var model: String, var color: String, var capacity: Int) {
        fun maxTripFare(fare: Double): Double {
            var t = 0
            return t + fare


        }


    }
}


























