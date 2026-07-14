package ders4

fun main() {

    val sicaklik = 20

    val uyari =
        if (sicaklik < 10) {
            "Hava soğuk mont giymenizi öneririm!"
        }else{
            "Hafif bir ceket yeterli olacaktır"

        }

    println("UYARI: $uyari")

}