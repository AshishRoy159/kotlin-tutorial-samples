package me.ashish.kotlin

fun main(args: Array<String>) {
	
	var list1: MutableList<Int> = mutableListOf(1,2,3,4,5);
	val list2: List<Int> = listOf(1,2,3)
	
	list1.add(6)
	
	println("1st: ${list1.first()}")
	println("Last: ${list1.last()}")
	
	println("3rd: ${list1[2]}")
	
	var list3 = list1.subList(0,3)
	println("Lenth: ${list1.size}")
	
	list3.clear()
	println()
	list1.forEach {n -> println("$n")}
	list1.remove(1)
	println()
	list1.forEach {n -> println("$n")}
	list1.removeAt(1)
	println()
	list1.forEach {n -> println("$n")}
	println()
	list2.forEach {n -> println("$n")}
}