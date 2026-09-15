var left: Int = 0
var maxLen: Int = 0

fun extendPalindrome(s: String, j: Int, k: Int) {
    var l = j
    var r = k

    while (l >= 0 && r < s.length && s[l] == s[r]) {
        l--
        r++
    }
}

fun longestPalindrome(s: String): String? {
    // 문자 길이 저장
    val len = s.length

    // 길이가 1인경우 예외처리
    if (len < 2) return s

    for (i in 0 until len - 1) {
        extendPalindrome(s, i, i + 1)
        extendPalindrome(s, i, i + 2)
    }

    return s.substring(left, left + maxLen)
}