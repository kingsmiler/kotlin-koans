package i_introduction._2_Named_Arguments

// default values for arguments:
fun bar(i: Int, s: String = "", b: Boolean = true) {
    print(s + i + b)
}

fun usage() {
    // named arguments:
    bar(1, b = false)
}

fun task2(collection: Collection<Int>): String {
    return collection.joinToString(", ", "{", "}")
}
