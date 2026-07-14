package ders4

fun main() {


    print("Sepet Tutarını girin:")
    val sepetTutar = readln().toDoubleOrNull()

    if (sepetTutar == null) {
        println("Lütfen tutarı sayısal bir ifade ile girn.")

    } else if (sepetTutar >= 500) {
        println("Süper Fırsat  %20 İndirim Kazandınız ")
    } else if (sepetTutar >= 200) {
        println("Kargo bedava ")
    } else {
        println("İndirim için ürün eklemeye devam ediniz")


    }


}

