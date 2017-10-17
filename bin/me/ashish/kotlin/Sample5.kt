package me.ashish.kotlin

fun main(args: Array<String>) {
	
	val  age = 8;
	
	if(age < 5) {
		println("Go to preschool")
	} else if (age == 5){
		println("Go to Kindergarten")
	} else if ((age > 5) && (age < 17)) {
		val grade = age - 5
		println("Go to grade $grade")
	} else {
		println("Go to college")
	}
	
	when(age) {
		0,1,2,3,4 -> println("Go to preschool")
		5 -> println("Go to Kindergarten")
		in 6..17 -> println("Go to grade ${age-5}")
		else -> println("Go to college")
	}
}