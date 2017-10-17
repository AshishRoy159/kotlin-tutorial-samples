package me.ashish.kotlin

fun main(args: Array<String>) {
	
	fun add(num1: Int, num2: Int) : Int = num1 + num2
	println("5+4 = ${add(5,4)}")
	
	fun subtract(num1: Int = 13, num2: Int = 6) = num1 - num2
	println("9-4 = ${subtract(9,4)}")
	println("Default: ${subtract()}")
	
	println("4-5 = ${subtract(num2 = 5, num1 = 4)}")
	
	fun sayHello(name: String) : Unit = println("Hello $name")
	sayHello("Paul")
	
	val (two, three) = nextTwo(1)
	println("1, $two, $three")
	
	println("Sum: ${getSum(1,2,3,4,5,6)}")
	
	val multiply = {num1: Int, num2: Int -> num1 * num2}
	println("Multiply - 7 * 6: ${multiply(7,6)}")
	
	println("Factorial 5: ${fact(5)}")
}

fun nextTwo(num: Int) : Pair<Int, Int> {
	return Pair(num+1, num+2)
}

fun getSum(vararg nums:Int): Int {
	
	var sum = 0
	nums.forEach { n -> sum += n }
	
	return sum
}

fun fact(x: Int) : Int {
	tailrec fun facTail(y: Int, z: Int): Int {
		if(y == 0) return z
		else return facTail(y-1, y*z)
	}
	return facTail(x,1)
}