package ders3.pratikler

fun main() {

    print("Lütfen adınızı giriniz:")

    val ad = readln()

    print("Boyunuzu giriniz:")
    val boy = readln().toDouble()

    print("Kilonuzu  giriniz:")
    val kilo = readln().toDouble()

    val vki = kilo / (boy * boy)


    val formatliVki = "%.2f".format(vki)

    print("Sayın $ad, Vücut kitle indeksiniz: $formatliVki ")


    println(
        """
           18,5 ve altı: Zayıf
           18,5 - 24,9: Normal / İdeal kilo
           25,0 - 29,9: Fazla kilolu
           30,0 - 34,9: 1. Derece Obezite
           35,0 - 39,9: 2. Derece Obezite
           40,0 ve üzeri: 3. Derece Obezite (Morbid Obezite) 
       """.trimIndent()//trimIndent() soldaki boşlukları otomatik silerr
    )


}