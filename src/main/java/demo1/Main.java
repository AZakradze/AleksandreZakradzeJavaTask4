package demo1;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        HashSet<String> names = new HashSet<>();

        names.add("Name1");
        names.add("Name1");
        names.add("Name2");
        names.add("Name3");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
