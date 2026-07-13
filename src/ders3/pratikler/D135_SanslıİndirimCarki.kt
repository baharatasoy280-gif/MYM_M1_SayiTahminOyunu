package ders3.pratikler

fun main() {



    println("--- 🎡 ŞANSLI İNDİRİM ÇARKI ---")

    print("Lütfen sepetinizdeki toplam tutarı giriniz (Örn: 500.0): ")
    var sepetTutari = readln().toDouble()


    val indirimYuzdesi = (10..50).random()


    val indirimMiktari = (sepetTutari * indirimYuzdesi) / 100

    sepetTutari -= indirimMiktari

    println("\n🎉 Tebrikler! Çarktan %$indirimYuzdesi indirim kazandınız.")
    println("💳 Yeni ödeyeceğiniz tutar: $sepetTutari TL.")



}