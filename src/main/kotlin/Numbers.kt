fun main() {
    val panjang = "20"
    val lebar = 12.6
    val tinggi = 10
    val volume : Double

    //to do
    val pa = panjang.toDouble() + 2
    val le = lebar.toDouble()
    val ti = tinggi.toDouble() + 1
    val volu = hitungVolume(pa, le, ti)
    print("Volume dari balok yang mempunyai panjang " + pa.toInt() + ", lebar " + le + ", dan tinggi " + ti.toInt() + ", ini adalah " + volu + ".")
}
fun hitungVolume(p: Double, l: Double, t: Double) : Float
{
    val v = p * l * t

    //to do
    val vol = v.toFloat()
    return vol
}