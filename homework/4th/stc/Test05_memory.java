/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-04 20:01:12
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-05 09:52:27
 */
import java.util.Arrays;

public class Test05_memory { 
    public static void main(String[] args) { 
        int[] arr1 = {1,2,3}; 
        int[] arr2 = arr1; 
        arr2[1] = 0; 
        System.out.println("arr1: " + Arrays.toString(arr1)); 
        System.out.println("arr2: " + Arrays.toString(arr2)); 
        System.out.println(arr1);
        System.out.println(arr2);
    } 
}
    
