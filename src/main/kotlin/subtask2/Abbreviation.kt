package subtask2

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        // throw NotImplementedError("Not implemented")
//        val a1 = a.toUpperCase().toCharArray()
//        val b1 = b.toCharArray()
//        var aIndex = 0
//        var bIndex = 0
//        while (bIndex < b.count() && aIndex < a.count()) {
//            aIndex++
//            if (b1[bIndex] == a1 [aIndex]) bIndex++
//        }
//        return if (bIndex == b.count()) "YES" else "NO"
        val a1 = a.toUpperCase().toCharArray()
        val b1 = b.toCharArray()
        val aSize = a.count() - 1
        val bSize = b.count() - 1
        var answerString = ""
        var answer = ""
        for (i in 0..bSize) {
            if (b1[i] == a1[i]) {
                answerString += a1[i]
            } else {
                for (j in i..aSize) {
                    if (b1[i] == a1[j])
                        answerString += a1[j]
                }
            }
        }
        if (answerString == b) answer = "YES"
        else answer = "NO"
        return answer

    }
}

