abstract class Beverage(var description: String = "Unknown Beverage"){

    open fun getBevDescription() : String {
        return description
    }

    abstract fun cost(): Double

}