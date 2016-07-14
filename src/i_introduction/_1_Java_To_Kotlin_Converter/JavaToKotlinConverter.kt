package i_introduction._1_Java_To_Kotlin_Converter

fun task1(collection: Collection<Int>): String {
    return collection.joinToString(", ", "{", "}")
}
