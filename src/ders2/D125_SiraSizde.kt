package ders2

fun main() {
    println("---  Uygulama Kartı ---")

    val uygulamaAdi = "Caffè italiano App"
    val surumKodu = "1.0"

    var gunlukKullanici = 1500

    println("Uygulama: " + uygulamaAdi + " | Sürüm: " + surumKodu)
    println("Aktif kullanıcı sayısı: " + gunlukKullanici)


    gunlukKullanici = gunlukKullanici + 50

    println(" Güncel aktif kullanıcı sayısı: " + gunlukKullanici)

    gunlukKullanici -= 25
    println(" Güncel aktif kullanıcı sayısı: " + gunlukKullanici)


    println("\n--- GÖREV 2: Sabitlik Testi  ---")


    // uygulamaAdi = "Yeni Kahve App"


    println("--- DİNAMİK SEPET (BONUS GÖREV) ---")

    var sepetTutari = 0.0
    println("1. Durum: Sepetiniz şu an boş. Toplam Tutar: " + sepetTutari + " TL")

    sepetTutari = sepetTutari + 50.0

    println("\nSepete 50.0 TL değerinde 'İtalyan Kahvesi' eklendi...")

    println("2. Durum: Güncel Sepet Tutarı: " + sepetTutari + " TL")

    println("\nSepete 30.0 TL değerinde 'Tiramisu' eklendi...")


    sepetTutari = sepetTutari + 30.0

    println("3. Durum: Güncel Sepet Tutarı: " + sepetTutari + " TL")

    println("\n Ödenecek Son Tutar %.2f: TL ".format(sepetTutari) +" TL")


}