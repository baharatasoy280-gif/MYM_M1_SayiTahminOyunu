package ders4.pratikler

fun main() {

    print("Lütfen yaşınızı giriniz:")
    val yas = readln().toInt()


    if (yas >= 18) {
        println("Yaşınız uygun. İşlemlere devam edebilirsiniz")

    } else {
        println("Üzgünüz yaşınız uygun değil.")
    }

    println("Eğitim durumunuz ehliyet için uygun mu? (true/false):")
    val egitimTamam = readln().toBoolean()

    if (yas >= 18 && egitimTamam) {

        println("TEBRİKLER! Kaydınız başarıyla onaylandı")
    } else if (yas < 18) {
        println("Yaşınız uygun değil.")
    } else {
        println(" Üzgünüz, eğitim şartını sağlamadığınız için kayıt yapılamıyor")

    }

}
