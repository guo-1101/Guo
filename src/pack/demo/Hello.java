package pack.demo;


import java.util.Arrays;
import java.util.Collections;

public class Hello {
    public static void main(String[] args) {
        // 冒泡排序是对数组操作，如果是集合，先用list.toArray()转化为数组
        Integer[] arrays = {20, 58, 12, -12, -39, 108, 691, 2};
        // 排序方式一：
        Arrays.sort(arrays);//升序
        System.out.println("升序排列：");
        for (int num : arrays) {
            System.out.print(num + ",");
        }

        Arrays.sort(arrays, Collections.reverseOrder());//倒序
        System.out.println("--------------");
        System.out.println("倒叙排列：");
        for (int num : arrays) {
            System.out.print(num + ",");
        }

        // 以上为sort（）方法自带的排序方法，但往往面试时需要手写冒泡排序排序，考验基本功

        // guo

        //排序方式二：冒泡排序（务必要会手写）
        for (int i = 0; i < arrays.length - 1; i++) {
            for (int j = 0; j < arrays.length - 1 - j; j++) {
                if (arrays[j] < arrays[j + 1]) {
                    int temp = arrays[j];
                    arrays[j] = arrays[j + 1];
                    arrays[j + 1] = temp;
                }
            }
        }
        //打印结果
        System.out.println("--------------");
        System.out.println("冒泡倒序排序结果:");
        for (int num : arrays) {
            System.out.print(num + ",");
        }

    }

}
