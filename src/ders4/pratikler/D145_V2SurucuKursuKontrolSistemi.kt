package ders4.pratikler

fun main() {

    print("Lütfen yaşınızı giriniz: ")
    val yasString = readln()
    val yas = yasString.toIntOrNull() // Eğer harf girerse program çökmesin diye güvenli yöntem

    if (yas != null && yas >= 18) {
        println("Yaşınız uygun. İşlemlere devam edebilirsiniz.")

        print("Eğitim durumunuz ehliyet için uygun mu? (E/H): ")
        val cevap = readln().uppercase() // Girilen harfi büyük harfe çevirir (e yazsa da E olur)

        if (cevap == "E") {
            println("TEBRİKLER! Kaydınız başarıyla onaylandı.")
        } else {
            println("Üzgünüz, eğitim şartını sağlamadığınız için kayıt yapılamıyor.")
        }

    } else {
        println("Üzgünüz, yaşınız ehliyet almak için uygun değil.")
    }
}



