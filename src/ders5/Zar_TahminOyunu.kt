package ders5

fun main() {

    println("\uD83C\uDFB2ZAR TAHMİN OYUNUNA HOŞGELDİN\uD83C\uDFB2")

    val randomZar = (1..6).random()

    print("Lütfen 1 ile 6 arasında bir zar tahmini girin: ")
    val tahmin = readln().toIntOrNull()

    if (tahmin == null) {
        print("Geçersiz giriş yaptınız, lütfen sadece rakam kullanın! \uD83D\uDD22")

    } else if (tahmin < 1 || tahmin > 6) {
        print("Zar sadece 1, 2, 3, 4, 5 veya 6 gelebilir! \uD83D\uDE15")
    } else if (tahmin == randomZar) {
        print("Tebrikler! Zar $randomZar geldi ve doğru bildiniz.\uD83D\uDE07")
    } else {
        print("Maalesef bilemediniz. Zar $randomZar gelmişti.\uD83E\uDEE0")
    }


}