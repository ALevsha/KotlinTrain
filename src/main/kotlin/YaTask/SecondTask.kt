

fun main(){
    //AAAABBBVVVCCCKZZXASDSDDSDEEEBBBBBBBBBBBBBBBBBBBBBBBBBBBB -> A4B3V3C3K1Z2X1A1S1D1S1D2S1D1E3B28
    // (символ + количество повторений)

    println(repeatingString("AAAABBBVVVCCCKZZXASDSDDSDEEEBBBBBBBBBBBBBBBBBBBBBBBBBBBB"))
}

fun repeatingString(s1: String): String{
    var count = 1
    var result = ""
    if (s1.length == 1)
        return s1
    for (i in 0 until s1.length - 1)
        if (s1[i] == s1[i + 1]){
            count++
            if (i == s1.length - 2){
                if (count == 1)
                    result += s1[i]
                else
                    result += "${s1[i]}$count"
                break
            }
        }
        else{
            if (count == 1)
                result += s1[i]
            else
                result += "${s1[i]}$count"
            count = 1
        }
    return result
}