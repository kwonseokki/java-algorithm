import java.util.LinkedList

fun main() {
    var list2 = arrayListOf(1, 2, 3)
    println(list2.javaClass) // class java.util.ArrayList
    // 자바의 ArrayList는 Collections를 사용해서  최대값을 구해야한다.
    // 코틀린은 같은 java ArrayList를 사용하지만 max() 메서드를 제공한다
    println(list2.max())
    // 확장 함수로 lastElement() 구현
    println(list2.lastElement())

    // listOf는 java.util.Array$ArrayList를 사용함 자바에서는 해당 리스트도 불변
    var a: List<Int> = listOf(1, 2, 3)
// 변경 가능한 리스트는 MutalbleList<E>를 사용하고 수정 가능한 java.util.ArrayList를 내부적으로 사용한다.
    var b: MutableList<Int> = mutableListOf(1, 2, 3)

    // 자바 클래스와 그대로 호환됨
    val aa = LinkedList<kotlin.Int>()
    println(aa.javaClass) // class java.util.LinkedList
    fn()
}

fun fn() {
    val a = mapOf("a" to 1, "b" to 2)
    println(a)
    println(a.javaClass) // class java.util.LinkedHashMap
}

fun List<Int>.lastElement(): Int = this.get(this.size - 1)