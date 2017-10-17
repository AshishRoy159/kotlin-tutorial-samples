package me.ashish.kotlin

fun main(args: Array<String>) {
	var myArray = arrayOf(1, 3.25, "ashish")
	
	println(myArray[2])
	myArray[1] = 3.14
	
	println("Array Length : ${myArray.size}")
	println("Array contains : ${myArray.contains("ashish")}")
	
	var partArray = myArray.copyOfRange(0,1)
	println("First : ${partArray.first()}")
	println("Ashish Index : ${myArray.indexOf("ashish")}")
	
	var sqArray = Array(5, {x -> x*x})
	println(sqArray[2])
	
	var intArray: Array<Int> = arrayOf(1,2,3)
	println(intArray.count())
}