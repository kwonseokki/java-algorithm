import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaList {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println(list1.getClass()); // java.util.ArrayList

        // list1 최대값을 구하려면?
        // ArrayList에는 max() 메서드가 정의가 안되어있다.
        // java.util.Collections 유틸리티 클래스를 써야한다.
        Collections.max(list1);
    }
}
