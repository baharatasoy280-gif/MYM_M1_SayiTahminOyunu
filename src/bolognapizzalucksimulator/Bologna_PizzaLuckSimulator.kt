package bolognapizzalucksimulator

fun main() {

    print("Name:")
    val name = readLine()

    println("Which pizza would you like ?")
    val pizzaType = readLine()

    val basePrice = 15.0

    val chefMood = (1..10).random()

    var totalPrice = basePrice

    if (chefMood in 8..10) {//in (İçinde mi?): "Şefin ruh hali bu kutunun İÇİNDE Mİ?" diye sorar.
        println("\uD83D\uDE0F EXCELLENT! The chef is feeling great today, your pizza is a work of art!")

        if (chefMood >= 9) {

            print("\uD83C\uDF81 The chef gave you a 20% discount")
            totalPrice = basePrice * 0.8
        }

    } else if (chefMood in 4..7) {
        println("😋 A beautiful pizza. Enjoy your meal!")

    }else{
        println("🔥 Oops! The chef is upset today, the pizza is a bit overcooked...")
    }

    val formatPrice = "%.2f".format(totalPrice)
    println("\n--- 📜 ORDER SUMMARY ---")
    println(" $name, $pizzaType pizza is ready .")
    println("Total Due: $formatPrice Euro")
    println("Arrivederci! ")

}