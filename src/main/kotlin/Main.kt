


fun main(){
    var bev1 = Espresso()

    println("Beverage name ${bev1.getBevDescription()} cost ${bev1.cost()}")

    var bev2 : Beverage = DarkRoast()
    println("Beverage name ${bev2.getBevDescription()} cost ${bev2.cost()}")
    bev2 = Mocha(bev2)
    println("Beverage name ${bev2.getBevDescription()} cost ${bev2.cost()}")

}