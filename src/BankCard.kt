class BankCard(val number: Long, private val code: Int) {

    fun getInfo(code: Int) {
        if (code == this.code) println("Номер карты: $number, Код: $code") else println("Неверный код")
    }
}