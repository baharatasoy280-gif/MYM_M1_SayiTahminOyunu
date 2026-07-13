package ders3.pratikler

fun main() {

    println("--- 🌤️ HAVA DURUMU MERKEZİ ---")


    print("Lütfen yaşadığınız şehri giriniz: ")
    val sehir = readln()

    print("Bugünün en düşük sıcaklığını giriniz: ")
    val dusuk = readln().toDouble()

    print("Bugünün en yüksek sıcaklığını giriniz: ")
    val yuksek = readln().toDouble()


    val ortalama = (dusuk + yuksek) / 2.0


    println("\n🎙️ Burası $sehir. Bugün sıcaklık $dusuk ile $yuksek derece arasında değişecek. Ortalama sıcaklık ise $ortalama derece.")





}