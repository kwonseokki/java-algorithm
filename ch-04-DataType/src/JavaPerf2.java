public class JavaPerf2 {
    public static void main(String[] args) {
//        Code:
//        0: ldc           #2                  // int 100000000
//        2: anewarray     #3                  // class java/lang/Integer
//        5: astore_1
//        6: iconst_0
//        7: istore_2
//        8: iload_2
//        9: ldc           #4                  // int 99999999
        // anewarray: 신규 배열 생성
        // newarray: 신규 참조형 배열 생성
        //
     Integer[] intgerElements = new Integer[100000000];

     for (int i = 0; i < 100000000 - 1; i++)
         intgerElements[i] = 1;
     intgerElements[100000000 -1] = 2;

     int index = 0;
     while (2 != intgerElements[index])
         index++;
    }
}
