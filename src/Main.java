import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList();
    list.add(1);
    list.add(2);
    list.add(3);
    System.out.println(list);

    // to update
    list.set(2, 200);
    // to remove
    list.remove(1);
    list.removeIf(e->e<3);
    System.out.println(list);

    for(Integer n: list) {
        System.out.println(n);
    }
    list.forEach(e-> System.out.println(e));
    list.forEach(System.out::println);
}