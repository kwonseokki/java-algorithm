fun main() {
//    코틀린의 자료형
//    Int int
//    Int? Integer
//    IntArray intArrayOf() int[] 자바자료형
//    Array<Int>, Array<Int?> Integer[] 자바 참조자료형

//    intArrayOf는 원시자료형인 int[] 를 사용한다.
//    max()는 참조형에서 제공하는 기능인데 사용이 가능하다?

    // 실제로 디스어셈블러로 살펴보면 kotlin/collections/ArraysKt.maxOrThrow:([I)I 외부 패키지를 호출한다.
    //    19: invokestatic  #12                 // Method kotlin/collections/ArraysKt.maxOrThrow:([I)I
//    22: istore_1
//    23: getstatic     #18                 // Field java/lang/System.out:Ljava/io/PrintStream;
//    26: iload_1
//    27: invokevirtual #24                 // Method java/io/PrintStream.println:(I)V
//    30: return
    val a = intArrayOf(1, 4, 3)
    println(a.max())
}