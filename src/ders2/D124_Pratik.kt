package ders2

fun main() {

    val urunAdi: String = "Bitter Çikolata"
    println(urunAdi)

    val adet: Int = 3
    println(adet)

    val urununBirimFiyati: Double = 55.90
    println(urununBirimFiyati)

    val urunKargoKampanyasi: Boolean = true
    println(urunKargoKampanyasi)

    val stoktaVar = true
    println(stoktaVar)

    val araToplam = adet * urununBirimFiyati

    println("~~SİPARİŞ DETAYI~~")
    println("Seçilen Ürün: " + urunAdi)
    println("Spariş:" + adet + "adet x " + urununBirimFiyati + "Tl")
    println("Ödenecek Miktar:" + araToplam + "TL")
    println("Stok Durumu:" + stoktaVar)


}