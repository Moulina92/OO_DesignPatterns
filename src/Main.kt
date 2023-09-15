import strategy.behavior.fly.FlyWithWings
import strategy.behavior.quack.Squeak
import strategy.duck.RedheadDuck

object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        val readHeadDuck = RedheadDuck(FlyWithWings(),Squeak())
        readHeadDuck.performFly()
        readHeadDuck.performQuack()
        readHeadDuck.display()
        readHeadDuck.swim()
    }

}