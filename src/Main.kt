fun main() {

    //Задача 1
    val card = BankCard(1234_5678_9123_4567, 123)
    println("Ответ к задаче 1:")
    card.getInfo(123)

    //Задача 2
    var a: Int = 7
    a += 7; a -= 4; a *= 2; a %= 3
    println("Ответ к задаче 2: $a")

    //Задача 3
    val number: Int = 12
    println("Ответ к задаче 3: " + number.toString().reversed().toInt())
}