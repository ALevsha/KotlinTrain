fun main(args: Array<String>){
    println("Hello from Kotlin")

    /*
    в Kotlin по умолчанию нет примитивных типов, чтобы был один,
    не как в Java: int и Integer и т.п.
     */

    // стандартные типы данных, если не ?
    var v2: Int? = 10
    // в Kotlin для приравнивания к null необх подставить null-safety (Int?) оператор,
    // по умолчанию поддержки null нет.
    var value: Int = 5
    // Int в byte-коде создается как int в Java, а Int? - как Integer в Java
    var sum: Double = 10.5
    /*
    var - изменяемая переменная
    val - неизменяемая переменная - константа

    Рекомендовано использовать val.
    Только в случае необходимости изменения использовать var.
     */
    val text: String = "Hello Kotlin"

    /** добавлен в Kotlin 1.3:  unsignedInt нельзя хранить отрицательные значения.
     Смещается ряд хранения. до 2 * 2^32 т.к отрицательные значния хранить не надо
     Также и для других числовых типов данных
     */
    var valueU: UInt = 5u

    value = 10
    //v2 = null

   /* if (v2 > 5)
        println(">5")
    Kotlin по возможности защищает от NPE
    */

    var result: Int = v2!! + 10 // !! отменяет null-safety, при null вылетит NPE
    if (v2 != null && v2 > 5) // для этого действия с nullable - переменной нужна доп проверка
        println(">5")

    when (value){
        // писать break не нужно
        1, 2, 4 -> {

        }
        in 1..4 ->{

        }
        10 -> {
            println("555555")
        }
        else -> {

        }
    }


}