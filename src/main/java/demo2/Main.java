package demo2;

public class Main {

    public static void main(String[] args) {

        Sumable sumable = Integer::sum;

        // or
//        Sumable sumable1 = (x, y) -> {
//            return x + y;
//        };

        System.out.println(sumable.sum(1, 2));
    }


}
