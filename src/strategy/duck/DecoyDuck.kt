package strategy.duck

import strategy.behavior.fly.FlyBehavior
import strategy.behavior.quack.QuackBehavior

class DecoyDuck(flyBehavior: FlyBehavior, quackBehavior: QuackBehavior) : Duck(flyBehavior, quackBehavior) {

    override fun display() {
        println("Looks like a Decoy Duck")
    }
}