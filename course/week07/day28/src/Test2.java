/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-09 10:48:32
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-09 11:41:56
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;


/**
 * Test2
 */
public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println(arrayList);
        System.out.println( "直接打印");
        System.out.println("使用for循环遍历");
        for(int i = 0; i < arrayList.size(); i++){
            System.out.println("第"+i+"个元素是:"+arrayList.get(i));
        }
        System.out.println("使用增强for循环");
        int i = 0;
        for(Object obj : arrayList){
            i++;
            System.out.print("第"+i+"个元素是:");
            System.out.println(obj);
        }
        System.out.println("使用迭代器遍历");
        i = 0;
        Iterator iterator = arrayList.iterator();
        while(iterator.hasNext()){
            i++;
            System.out.print("第"+i+"个元素是:");
            System.out.println(iterator.next());
        }
        System.out.println("使用lambda表达式遍历");
        arrayList.forEach(System.out::println);
        System.out.println("匿名内部类");
        arrayList.forEach(new Consumer<Integer>(){
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
    }
    
}