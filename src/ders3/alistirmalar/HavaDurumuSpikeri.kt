package ders3.alistirmalar

fun main() {

    print("Lütfen yaşadığınız şehri giriniz: ")
    val sehir = readln()

    print("Bugünün en düşük sıcaklığını giriniz:")
    val dusukSicaklik = readln().toDouble()

    print("Bugünün en yüksek sıcaklığını giriniz:")
    val yuksekSicaklik = readln().toDouble()

    val ortalama = (dusukSicaklik + yuksekSicaklik) / 2.0

    print("Burası $sehir. Bugün sıcaklık $dusukSicaklik ile $yuksekSicaklik arasında değişecek.Ortalama sıcaklık: $ortalama ")


}