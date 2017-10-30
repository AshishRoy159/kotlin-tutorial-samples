package me.ashish.kotlin

fun main(args: Array<String>) {
	
	var tweety = Bird("Tweety", true)
	tweety.fly(10.0);
}

interface Flyable{
	var flies: Boolean
	fun fly(distMiles: Double): Unit
}

class Bird constructor(val name:String, override var flies: Boolean = true) : Flyable {
	
	override fun fly(distMiles: Double): Unit {
		if(flies) {
			println("$name flies $distMiles miles")
		}
	}
}
