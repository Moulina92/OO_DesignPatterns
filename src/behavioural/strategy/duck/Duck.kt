package strategy.duck

import strategy.behavior.fly.FlyBehavior
import strategy.behavior.quack.QuackBehavior

abstract class Duck(
    private var flyBehavior: FlyBehavior,
    private var quackBehavior: QuackBehavior
) {

    fun swim() {
        println("Duck is swimming")
    }
    fun performQuack(){
        quackBehavior.quack()
    }

    fun performFly(){
        flyBehavior.fly()

    }

    abstract fun display()
}