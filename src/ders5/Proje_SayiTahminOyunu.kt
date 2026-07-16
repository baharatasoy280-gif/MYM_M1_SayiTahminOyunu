package ders5

fun main() {


    println("SAYI TAHMİN OYUNUNA HOŞGELDİNİZ")

    print("Tahminizi giriniz: ")
    val rastgeleSayi = (1..100).random()
 //   println("Rastgele sayı: $rastgeleSayi")
    val tahmin = readln().toIntOrNull()

    if (tahmin == null) {
        print("Lütfen geçerli bir tam sayı giriniz. \uD83E\uDD28\u200B\uD83E\uDD28\u200B")
        return

    } else if (tahmin < 1 || tahmin > 100) {
        println("Lütfen 1 ile 100 arasında bir sayı girin. \u200B\uD83D\uDE2D\u200B\uD83D\uDE2D\u200B")

    } else if (rastgeleSayi > tahmin) {
        println("Daha büyük bir sayı girmelisin. ☝\uFE0F\u200B☝\uFE0F\u200B")
    } else if (rastgeleSayi < tahmin) {
        println("Daha küçük bir sayı girmelisin. \uD83D\uDC47\u200B\uD83D\uDC47\u200B")
    } else {
        println("Tebrikler! Hedef sayıyı buldunuz. \u200B\uD83E\uDD73\u200B\uD83E\uDD73\u200B")
    }


}