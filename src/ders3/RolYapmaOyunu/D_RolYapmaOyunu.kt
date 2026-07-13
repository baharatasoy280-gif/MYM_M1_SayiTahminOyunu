package ders3.RolYapmaOyunu

fun main() {

    var komutanCani =100
    println("\uD83E\uDE96Komutan canı: $komutanCani")
    var dusmanCani = 100
    println("\uD83E\uDDDFDüşman canı: $dusmanCani")

    val hasar = (15..35).random()

    println(" Verdiğin Hasar: $hasar")

    dusmanCani -= hasar

    println("\uD83E\uDE78 Düşman yaralandı! Kalan canı: $dusmanCani")

    val aldiginHasar = (15..35).random()

    komutanCani -= aldiginHasar
    println("Aldığın Hasar: $aldiginHasar")
    println("\uD83D\uDDE1\uFE0FDüşman atağa geçti! Kalan canın: $komutanCani")




}