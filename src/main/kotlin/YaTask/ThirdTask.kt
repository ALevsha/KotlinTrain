/*
input ["eat", "tea", "tan", "ate", "nat", "bat"]
output [["ate", "eat", "tea"],["nat", "tan"], ["bat"]]
т.е. сгруппировать по буквам
 */

fun main(){
    println(groupWords(arrayOf("eat", "tea", "tan", "ate", "nat", "bat")))
}

fun groupWords(words: Array<String>): List<List<String>> {
    val result: MutableList<List<String>> = mutableListOf() // изменяемый лист листов из слов

    val map = mutableMapOf<String, MutableList<String>>() // словарь из слов(ключ) и листов слов(значение)

    for (word in words) {
        val sortedWord = word.toCharArray().sorted().joinToString("") // перевод в массив char,
                                                                               // сортировка и возвращение в строку

        if (map.containsKey(sortedWord)) // если есть такой ключ
            map[sortedWord]?.add(word) // добавляем слово, если нет ключа, то выдаст null
        else
            map[sortedWord] = mutableListOf(word) // иначе делаем новый ключ со словом
    }

    for ((key, value) in map) // проходим по ключам словаря и добавляем значения в результирующий список
        result.add(value)
    return result
}

