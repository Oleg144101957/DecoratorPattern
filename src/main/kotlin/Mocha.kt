class Mocha(var beverage: Beverage): DecoratorCoffee() {
    override fun cost(): Double {
        return beverage.cost() + .20
    }

    override fun getBevDescription(): String {
        return beverage.getBevDescription() + ", Mocha"
    }
}