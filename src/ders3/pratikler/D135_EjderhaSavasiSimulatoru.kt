package ders3.pratikler

fun main() {


    println("--- 🐉 EFSANEVİ EJDERHA SAVAŞI SİMÜLATÖRÜ 🐉 ---")

    var ejderhaCani = 1000.0


    print("Kahramanınızın adını giriniz: ")
    val kahramanAdi = readln()


    print("Temel saldırı gücünüzü giriniz (Örn: 120.5): ")
    var saldiriGucu = readln().toDouble()


    val kritikBonus = (10..50).random()


    // Kotlin burada akıllıdır, Int ile Double'ı toplar ve Double yapar.
    saldiriGucu += kritikBonus


    ejderhaCani -= saldiriGucu


    val formatliCan = "%.2f".format(ejderhaCani)
    println("\n------------------------------------------")
    println("📜 SAVAŞ RAPORU")
    println("🗡️ Kahraman       : $kahramanAdi")
    println("⚡ Kritik Bonus   : +$kritikBonus Güç")
    println("💥 Toplam Hasar   : $saldiriGucu")
    println("🩸 Ejderha Canı   : $formatliCan")


}