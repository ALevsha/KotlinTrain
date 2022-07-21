/*
Даны 2 массива: [1,2,3,2,0] и  [5,1,2,7,3,2]
Надо вернуть их пересечение [1,2,2,3] (порядок не важен)
 */


fun main(){
    val m1 = intArrayOf(1,2,3,2,0)
    val m2 = intArrayOf(5,1,2,7,3,2)
    println(getRepeatedIntersection(m1,m2))
}

fun getRepeatedIntersection(m1: IntArray, m2: IntArray): List<Int> {
    val s1 = m1.toHashSet()
    val s2 = m2.toHashSet()

    val result = mutableListOf<Int>() // результирующий массив

    for (el in s1){
        if(s2.contains(el)){// если элемент есть в s2. Contains быстро работает с HashSet
            val numOfRepeats = minOf(m1.count{it == el}, m2.count { it == el }) // подсчет количества
                                                                                // совпадений в обоих массивах
            repeat(numOfRepeats) {result.add(el)} // Повторение вставки элемента
        }
    }

    return result
}

