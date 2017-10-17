package me.ashish.kotlin

fun main(args: Array<String>) {
	val divisor = 3
	
	try {
		if(divisor == 0) {
			throw IllegalArgumentException("Can't divide by zero")
		} else {
			println("5 / $divisor = ${5/divisor}")
		}
	} catch (e: IllegalArgumentException) {
		println("${e.message}")
	}
}