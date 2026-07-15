package ders4.Pratikler

fun main() {
    print("Lütfen notunuzu girin: ")
    val not = readln().toIntOrNull()

    if (not == null) {
        println("🚨 HATA: Lütfen notunuzu rakamlarla giriniz!")
        return
    }

    val durum = if (not >= 50) "Geçti" else "Kaldı"
    println("Öğrenci Durumu: $durum")

    if (not >= 85) {
        println("Takdir Belgesi kazandınız!")
    } else if (not >= 50) {
        println("Tebrikler, geçtiniz.")
    } else {
        println("Maalesef kaldınız.")
    }

}