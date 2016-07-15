package i_introduction._6_Data_Classes


// 使用data修饰class，会自动为该类添加equals、hashCode和toString方法等。
data class Person(val name: String, val age: Int) {
    fun hello() {
        println("Hello!")
    }
}

fun task6(): List<Person> {
    val p: Person = Person(name = "Wang", age = 35)

    print(p)

    return listOf(Person("Alice", 29), Person("Bob", 31))
}

fun main(args: Array<String>) {
    val p: Person = Person(name = "Li", age = 29)
    val name1 = p.name
    val name2 = p.component1()

    println("name1=$name1")
    println("name2=$name2")
    println("name2==name1?${name1 == name2}")

    p.hello()
}