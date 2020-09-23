import java.util.Scanner
import java.text.DecimalFormat

fun main() {
    println("""
        -------Alat Hitung Volume Kerucut dan Tabung-------
        1. Volume Kerucut
        2. Volume Tabung
    """.trimIndent())

    val dec = DecimalFormat("#.00")
    val reader = Scanner(System.`in`)
    println("Pilih nomor bangun ruang = ")
    val pilih: Int = reader.nextInt()
    println()

    val stringOfPilih = when (pilih) {
        1 -> {
            println("-------Menghitung volume kerucut-------")
            println("Masukkan jari-jari bangun ruang = ")
            val jariJari: Float = reader.nextFloat()
            println("Masukkan tinggi bangun ruang = ")
            val tinggi: Float = reader.nextFloat()

            val hasilKerucut = volumeKerucut(jariJari, tinggi)
            val decHasilKerucut = dec.format(hasilKerucut)
            println("volume kerucut = $decHasilKerucut")
        }

        2 -> {
            println("-------Menghitung volume tabung-------")
            println("Masukkan jari-jari bangun ruang = ")
            val jariJari: Float = reader.nextFloat()
            println("Masukkan tinggi bangun ruang = ")
            val tinggi: Float = reader.nextFloat()

            val hasilTabung = volumeTabung(jariJari, tinggi)
            val decHasilTabung = dec.format(hasilTabung)
            println("volume tabung = $decHasilTabung")
        }

        else -> {
            println("Menu tidak tersedia")
        }
    }
}

fun volumeKerucut(jariJari: Float, tinggi: Float) :Float
{
    val v = 22 * jariJari * jariJari * tinggi / 7 / 3
    return v
}

fun volumeTabung(jariJari: Float, tinggi: Float) :Float
{
    val v = 22 * jariJari * jariJari * tinggi / 7
    return v
}
