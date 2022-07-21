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
}