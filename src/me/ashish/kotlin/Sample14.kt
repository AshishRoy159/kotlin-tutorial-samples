package me.ashish.kotlin

fun main(args: Array<String>) {
	
	val tiger = Animal("Tiger", 10.0, 50.5)
	tiger.getInfo()
	
	val spot = Dog("Spot", 7.0, 25.7, "Ashish")
	spot.getInfo()
	
}

open class Animal2(val name: String, var height: Double, var weight: Double) {
	
	init{
		var regex = Regex(".*\\d+.*")
		
		require(!name.matches(regex)) {"Name cannot contian number"}
		require(height>0){"Height must be Greater than zero"}
		require(weight>0){"Weight must be Greater than zero"}
	}
	
	open fun getInfo(): Unit {
		println("$name is $height tall and weighs $weight")
	}
}

class Dog(name: String, height: Double, weight: Double, var owner: String) : Animal2(name, height, weight) {
	
	override fun getInfo(): Unit {
		println("$name is $height tall and weighs $weight and is owned by $owner")
	}
}