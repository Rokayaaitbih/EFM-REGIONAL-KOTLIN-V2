fun String.estVideOuBlanche(): Boolean {
    return this.trim().isEmpty()
}

fun String.sigle(): String {
    val words = this.split(" ")
    return words.map { it.first().uppercase() }.joinToString("")
}