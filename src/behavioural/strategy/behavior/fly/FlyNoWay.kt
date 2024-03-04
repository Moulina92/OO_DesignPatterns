package strategy.behavior.fly

class FlyNoWay : FlyBehavior {
    override fun fly() {
        println("Do Nothing! Can't Fly")
    }
}
