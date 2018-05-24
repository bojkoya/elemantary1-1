package homeOneTasOne;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();


        for (int i = 100; i > 0; i--) {

            if (i % 3 == 0 && i % 5 == 0) {
                list.add("test ");
            }

            if (i % 3 == 0 && i % 5 != 0) {
                list.add(i + " ");
            }
        }
        System.out.println(" " + list);

    }
}