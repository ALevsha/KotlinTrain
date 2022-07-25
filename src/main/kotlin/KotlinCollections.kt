import java.util.LinkedList

fun main(){
    println("Hello from Kotlin")

    // в Kotlin можно использовать Java-коллекции

    val listE = ArrayList<String>()

    // в Kotlin связных списков нет. Это из Java (почти не юзаются)
    val lListE = LinkedList<String>()

    // arrayOf() создаст массив
    // listOf() создаст коллекцию

    // создание неизменяемого списка
    val list = listOf("1111", "2222", "3333")
    var text = list.get(0) // можно улучшить как в масивах
    text = list[0]
    println("Text = $text")

    // создание изменяемого списка
    val mList = mutableListOf("1111", "2222", "3333")

    for (el in mList)
        println("For element $el")
    println()
    mList.add("asdafqw")


    for (el in mList)
        println("For element $el")

    // можно использовать именованные аргументы
    val mList2 = mutableListOf(
        Student(age = 15, name = "Ivan"),
        Student(name = "Sergey", age = 20)
    )

    for (student in mList2)
        println("For 1 element ${student.name}")

    mList2.forEach{student ->
        println("For 1 element ${student.name}")
    }

    // неизменяемое множество
    val set = setOf("asdasd", "asdaczxcvas")
    // mutableSetOf() - изменяемое множество

    // неизменяемый словарь
    val map = mapOf(
        "key1" to "value1",
        "key2" to "value2"
    )
    // mutableMapOf() - изменяемый словарь

    var value = map.get("key1") // можно улучшить:
    value = map["key1"]

    println("Value = ${value}")






}