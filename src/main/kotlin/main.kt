fun main(){

    var rate = 0.0075

    //сумма 10 000 рублей переводим в копейки
    val amount = 100_000
    val commission = if ((amount*rate)>3500) ((amount*rate)) else 3500
    println(commission)
}