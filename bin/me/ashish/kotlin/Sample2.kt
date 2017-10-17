package me.ashish.kotlin

fun main(args: Array<String>) {
	val longString: String = """This is a
								very long String for test"""
	println("String length : ${longString.length}")
	
	var str1: String = "A random string"
	var str2: String = "a random String"
	
	println("String equals: ${str1.equals(str2)}")
	println("A compares B: ${'A'.compareTo('B')}")
	
	println("2nd index : ${str1.get(2)}")
	println("3rd index : ${str1[3]}")
	
	println("Contains 'random' : ${str1.contains("random")}")
	println("Index 2-7 : ${str1.subSequence(2,8)}")
}