/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-09 21:11:37
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-09 21:11:42
 * @: 無限進步
 */
import java.util.ArrayList;
import java.util.List;
public class Return2 {
    public static void main(String[] args) {
        System.out.println(testTest03());
        }
        private static List<Integer>
        testTest03() {
        List<Integer> list = new ArrayList<>();
        try {
        list.add(1);
        System.out.println("try:" +list);
        return list;
        } finally {
        list.add(3);
        System.out.println("finally:" +list);
        }
    }
}