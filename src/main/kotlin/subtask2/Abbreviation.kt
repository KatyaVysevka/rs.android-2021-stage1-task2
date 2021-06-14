package subtask2

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
       // throw NotImplementedError("Not implemented")
        val a1 = a.toUpperCase().toCharArray()
        val b1 = b.toCharArray()
        var aIndex = 0
        var bIndex = 0
        while (bIndex < b.count() && aIndex < a.count()) {
            aIndex++
            if (b1[bIndex] == a1 [aIndex]) bIndex++
        }
        return if (bIndex == b.count()) "YES" else "NO"
    }
}
