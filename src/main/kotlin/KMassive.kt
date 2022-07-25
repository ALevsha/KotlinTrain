fun main(args: Array<String>){
    println("Hello Kotlin")

    //Конструкция очень похожа на коллекцию, но это обычный массив аналогичный Java
    val arrayInt: Array<Int?> = Array<Int?>(3){150; 200; 300} // если надо null
    val arrayInt2 = Array<Int>(3){150; 200; 300}
    val arrayInt3 = Array(3){150; 200; 300} // kotlin подставит тип сам
    val arrayInt4 = Array(1000){ 5 } // массив из 1000 элементов,
                                          // у которого все элементы = 5
    val arrayInt5 = arrayOf(150, 200, 300) // создаст массив Int
    val arrayInt6 = arrayOfNulls<Int>(3) // массив Int с 3 элементами, все null.
                                              // Не рекомендуется

    // для каждого типа, кроме строк
    val arrayInt7 = IntArray(3){1;2;3}
    var arrayInt8 = intArrayOf(3, 6, 10)

    var arrayText = arrayOf("awdqawd", "ggg","kkkk")

    // обращение к элементам массива аналогично как в Java

    // выполненится 11 раз
    for(i in 0..10){
        println("i = $i")
    }
    println()

    // выполненится 10 раз
    for(i in 0 until 10){
        println("i = $i")
    }

    println()

    // от 0 до 10 невключительно с шагом 3
    for(i in 0 until 10 step 3){
        println("i = $i")
    }

    println()

    // с 10 до 0 включительно
    for (i in  10 downTo 0){
        println("i = $i")
    }

    println()

    // от первого элемента до последнего
    for (i in 0 until arrayText.size){ // есть отдельно arrayText.indices
        println("i = $i, value = ${arrayText[i]}")
    }

    println()

    // пробег по индексам
    for (index in arrayText.indices){
        println("i = $index, value = ${arrayText[index]}")
    }

    println()

    // пробег по элементам
    for (value in arrayText){
        println("value = $value")
    }

    println()

    // пробег по элементам, если нужны и индексы и элементы
    for ((index, value) in arrayText.withIndex()){
        println("i = $index, value = $value")
    }

    // если необходимо сделать пропуск из внешнего цикла, его можно обозвать
    // в формате: имя@
    mainLoop@ for ((index, value) in arrayText.withIndex()) {
        for ((index2, value2) in arrayText.withIndex()) {
            println("i = $index, value = $value")
            if (index2 % 2 == 0){
                continue@mainLoop // метка выхода
            }
        }
    }

    /* цикл while (do while) аналогичен Java.
     Также есть и break и continue
     */
}