class MyClass {
    companion object {
        var number=89
    }
	fun printNumber(){
		println("$number")
	}
}

fun main(args: Array<String>) {
	var obj1=MyClass()
	var obj2=MyClass()
	
	obj1.printNumber()
	obj2.printNumber()
	
	
	MyClass.number=19
	
	obj1.printNumber()
	obj2.printNumber()
}
