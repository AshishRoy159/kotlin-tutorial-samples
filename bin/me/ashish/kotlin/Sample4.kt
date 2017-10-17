package me.ashish.kotlin

fun main(args: Array<String>) {
	
	val oneToTen = 1..10
	val alpha = "A".."Z"
	val p = 3.5
	println("3.5 in oneToTen : ${p in oneToTen}")
	println("S in alpha : ${"S" in alpha}")
	
	for(x in oneToTen) println("One to Ten : $x")
	for(x in oneToTen.reversed()) println("Ten to One : $x")
}