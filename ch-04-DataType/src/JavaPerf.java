public class JavaPerf {
    public static void main(String[] args) {
//        Code:
//        0: ldc           #2                  // int 100000000
//        2: newarray       int
//        4: astore_1
//        5: iconst_0
//        6: istore_2
//        7: iload_2
//        8: ldc           #3                  // int 99999999
//        10: if_icmpge     2
        int[] intElements = new int[100000000];
        for (int i = 0; i < 100000000 -1; i++)
            intElements[i] = 1;
        intElements[100000000 - 2] = 2;

        int index = 0;
        while (2 != intElements[index])
            index++;
    }
}