fun main() {
    var word : String? = null
    val word1 = word ?: "SMK Telkom"
    val wordLength = word1.length

    print("Jumlah kata dari string $word1 sebanyak $wordLength ")
}