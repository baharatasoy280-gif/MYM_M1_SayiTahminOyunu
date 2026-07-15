package ders4.alistirmalar

fun main() {

    val yas = 17
    val egitimTamam = true

    if (yas >= 18) {
        println("Yaşınız tutuyor işlemlere devam edebilirsiniz")

    } else {
        println("Ehliyet almak için yaşınız yeterli değil.")
    }

    if (yas >= 18 && egitimTamam) {
        println("Kaydınız onaylandı")
    } else {
        println("Kayıt şartları sağlanamadı")
    }


}