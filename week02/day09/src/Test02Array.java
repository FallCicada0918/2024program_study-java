/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-05 09:56:54
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-05 11:12:30
 */
import java.util.Arrays;
public class Test02Array {
    public static void main(String[] args) {
        // int sum1 = a_Add();
        // int sum2 = a_Add(1);
        // int sum3 = a_Add(1,2);
        // int sum4 = a_Add(1,2,3);
        // System.out.println("sum1 = " + sum1);
        // System.out.println("sum2 = " + sum2);
        // System.out.println("sum3 = " + sum3);
        // System.out.println("sum4 = " + sum4);
        System.out.println("superTest(\"sum\",1,2,3) = " + superTest("sum",1,2,3));
        System.out.println("superTest(\"max\",1,2,3) = " + superTest("max",1,2,3));
        System.out.println("superTest(\"avg\",1,2,3) = " + superTest("avg",1,2,3));
        
    }
    public static int a_Add(int... a){
        System.out.println("a:" + a);
        int sum = 0;
        for(int i =0; i < a.length; i++){
            System.out.println("a["+i+"] = " + a[i]);
            sum += a[i];
        }
        return sum;
    }
    static String superTest(String calculationType,int ... a){
        String result = "";
        int sum = 0;
        int max = 0;
        int avg = 0;
        int min = 0;
        String sort = "sort";
        switch(calculationType){
            case "sum":
                for(int i =0; i < a.length; i++){
                    sum += a[i];
                }
                result = String.valueOf(sum);
                break;
            case "max":
                result = "";
                for(int i =1; i < a.length; i++){
                    if(a[i] > max){
                        max = a[i];
                        
                    }
                }
            result = String.valueOf(max);
            break;
            case "avg":
            sum = 0;
            avg = 0;
            for(int i =1; i < a.length; i++){
                result += a[i];
            }
            avg = sum / a.length;
            result = String.valueOf(avg);
            break;
            case "sort":
            Arrays.sort(a);
                result = Arrays.toString(a);
                break;
            default:
                System.out.println("太难了，等我长大以后再学吧");
            
        }
                
            
            return result;
    }
        
}

    