package me.ashish.kotlin

fun main(args: Array<String>) {
	
	println("Hello Kotlin")
	
	val name: String = "Ashish"
	
	var age: Int = 25
	
	println("$name" + " " + "$age");
	
	var letterGrade: Char = 'A'
	
	println("A is Char: ${letterGrade is Char}")
	
	println("3.14 to Int : ${3.14.toInt()}")
	println("A to Char : ${'A'.toInt()}")
	println("65 to Char : ${65.toChar()}")
	
	val myName: String = "Ashish Roy"
	val longString: String = """This is a
								very long String for test"""
	println(myName)
	println("${myName}")
	
	println(longString.length)
	println("1 + 2 = ${1+2}")
		
}