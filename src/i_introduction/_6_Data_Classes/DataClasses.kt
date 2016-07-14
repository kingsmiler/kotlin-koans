package i_introduction._6_Data_Classes


// 使用data修饰class，会自动为该类添加equals、hashCode和toString方法等。
data class Person(val name: String, val age: Int)

fun task6(): List<Person> {
    val p: Person = Person(name = "Wang", age = 35)

    print(p)

    return listOf(Person("Alice", 29), Person("Bob", 31))
}

fun main(args: Array<String>) {
    task6()
}