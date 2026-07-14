package ders4

fun main() {
    print("Yaşını Gir: ")
    val yas = readln().toIntOrNull()


    if (yas == null) {
        println("Hata:Lütfen sadece rakam kullanarak geçerli bir yaş girin.")
    }else if (yas < 18) {
        println("İşleme devam edemezsiniz!")
    }else{
        println("Reşitsiniz.İşleme devam edebilirsiniz")
    }



}