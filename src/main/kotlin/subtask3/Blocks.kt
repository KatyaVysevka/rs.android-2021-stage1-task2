package subtask3

import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {

    // TODO: Complete the following function
    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        //throw NotImplementedError("Not implemented")
        when (blockB) {
//            Int::class -> {
//                var answer = 0
//                for (i in blockA) {
//                    if (i is Int) answer += i
//                }
//                return answer
//            }
            String::class -> {
                var answer = ""
                for (i in blockA) {
                    if (i is String) answer += i
                }
                return answer
            }
            LocalDate::class -> {
                val dateList = mutableListOf<LocalDate>()
                for (i in blockA) {
                    if (i is LocalDate) {
                        dateList.add(i)
                    }
                }
                val answer = dateList.max() as LocalDate
                val formatPattern = DateTimeFormatter.ofPattern("dd.MM.yyyy")
                return answer.format(formatPattern)

            }
        }
        return "Это костыль - не трогать"
    }

}
