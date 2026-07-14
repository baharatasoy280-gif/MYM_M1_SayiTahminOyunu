package ders4

fun main() {

    val karanlikModAktif = true

    val arkaPlanRengi =
        if (karanlikModAktif) {
            "#000000"//Black
        } else {
            "#FFFFFF"//White
        }

    print("Arka Plan Rengi:  $arkaPlanRengi")


}