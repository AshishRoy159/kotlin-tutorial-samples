package me.ashish.kotlin

import java.util.Random

fun main(args: Array<String>) {
	
	for (x in 1..10) {
		println("Loop: $x")
	}
	
	print("for (i in 1..5) print(i) = ")
    for (i in 1..5) println(i)

    println()

    print("for (i in 5..1) print(i) = ")
    for (i in 5..1) println(i)             // prints nothing

    println()

    print("for (i in 5 downTo 1) print(i) = ")
    for (i in 5 downTo 1) println(i)

    println()

    print("for (i in 1..5 step 2) print(i) = ")
    for (i in 1..5 step 2) println(i)

    println()

    print("for (i in 5 downTo 1 step 2) print(i) = ")
    for (i in 5 downTo 1 step 2) println(i)
	
	val rand = Random()
	val number = rand.nextInt(50) + 1
	var guess = 0
	while(number != guess) {
		guess += 1
	}
	println("Number was : $guess")
	
	for(x in 1..20) {
		if(x % 2 == 0) {
			continue
		}
		println("Odd: $x")
		
		if(x == 15) break
	}
	
	var arr3: Array<Int> = arrayOf(3,6,9)
	for(i in arr3.indices) {
		println("Multiples of 3: ${arr3[i]}")
	}
	for((index, value) in arr3.withIndex()) {
		println("Index: $index Value : $value")
	}
}