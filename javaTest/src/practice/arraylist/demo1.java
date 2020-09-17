package practice.arraylist;

import java.util.ArrayList;
import java.util.Random;

public class demo1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            Random r = new Random();
            list.add(r.nextInt(33) + 1);
            System.out.println(list.get(i));
        }

        ArrayList<People> list2 = new ArrayList<>();
        People one = new People("lvyx01", 18);
        People two = new People("lvyx02", 16);

        list2.add(one);
        list2.add(two);

        for (int i = 0; i < list2.size(); i++) {
            People p = list2.get(i);
            System.out.println("name: " + p.getName());
        }


    }
}
