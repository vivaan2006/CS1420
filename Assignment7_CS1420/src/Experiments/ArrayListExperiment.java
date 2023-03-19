package Experiments;

import java.util.ArrayList;

public class ArrayListExperiment {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> list = new ArrayList<>(10);
        list.get(0).set(0, "hello");
            System.out.println(list);

    }
}
