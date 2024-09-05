/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-05 11:45:01
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-05 14:49:48
 */
public class Test10 {
    // 忽略与未检查的空类型相关的警告
    @SuppressWarnings("null")
    // 主函数入口，无参数，无返回值
    public static void main(String[] args) {
        // arrayIndexOut();
        nullPointerException();
    }
    static void arrayIndexOut(){
        // 初始化一个整型数组
        int[] arr = {1, 2, 3};
        // 输出数组越界的元素，展示可能的运行时异常j
        System.out.println(arr[3]); 
    }
    static void nullPointerException(){
        // 声明一个字符串变量并赋值为 null
        String str = null;
        // 尝试调用 null 字符串的长度方法，展示可能的空指针异常
        System.out.println(str.length());
    }
}