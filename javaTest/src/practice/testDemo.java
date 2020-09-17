package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class testDemo {
    public static void main(String[] args) {

        //输出0-10的随机数
        Random r = new Random();
        int num = r.nextInt(10);
        System.out.println(num);
    /*
    数组
    StringBuilder
    ArrayList

    方法，方法重载
    断点调试
    private,this

     */
        //数组
        int[] arr = {1,2,3};
        int[] arr1 = new int[10];
        int max = arr[0];
        for (int i= 1 ; i < arr.length ; i++ ){
            if (arr[i]> max){
                max = arr[i];
            }
            System.out.println("arr["+ i + "]="+ arr[i]);
        }
        System.out.println("最大值"+max);

        //方法
        System.out.println("调用方法："+sum(10,20));

        //
        StringBuilder strb = new StringBuilder();

    }

    public static int sum(int n, int m) {
        return n + m;
    }

}
