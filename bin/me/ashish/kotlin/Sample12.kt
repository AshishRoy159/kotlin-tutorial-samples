package me.ashish.kotlin

fun main(args: Array<String>) {

	val map = mutableMapOf<Int, Any?>()
	
	val map2 = mutableMapOf(1 to "Doug", 2 to 25)
	
	map[1] = "Derek"
	map[2] = 42
	
	map.put(3, "Ashish")
	
	map.remove(2)
	map.forEach{ele -> println("Key: ${ele.key}, Value: ${ele.value}")}
	
	for((x,y) in map2) {
		println("Key: $x, Value: $y")
	}
}