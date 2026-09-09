fun reorderLogFiles(logs: Array<String>): Array<String> {
    // 문자 로그를 저장할 문자리스트
    val letterList = mutableListOf<String>()
    // 숫자 로그를 저장할 숫자리스트
    val digitList = mutableListOf<String>()

    for (log in logs) {
        if (Character.isDigit(log.split(" ")[1][0])) {
            digitList.add(log)
        } else {
            letterList.add(log)
        }
    }

    letterList.sortWith(Comparator { s1: String, s2: String ->
        val s1x = s1.split(" ", limit = 2)
        val s2x = s2.split(" ", limit =  2)

        val compared = s1x[1].compareTo(s2x[1])

        if (compared == 0) {
            s1x[0].compareTo(s2x[0])
        } else {
            compared
        }
    })

    letterList.addAll(digitList)

    return letterList.toTypedArray()
}