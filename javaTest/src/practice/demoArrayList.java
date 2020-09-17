package practice;

import java.util.ArrayList;

public class demoArrayList {
    public static void main(String[] args) {

        //ArrayList初始化，赋值， 修改值，删除，遍历
        ArrayList<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add(2, "java");//根据索引添加元素

        //修改元素
        list.set(1, "demo");

        //删除元素
        list.remove(0);
        boolean rm = list.remove("c"); //根据元素删除，删除都返回的boolean值
        System.out.println("删除元素：" + rm);

        for (int i = 0; i < list.size(); i++) {
            System.out.println("遍历list值： " + list.get(i));
        }
    }
}
