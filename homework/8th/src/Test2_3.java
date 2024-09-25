/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-21 18:28:49
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-21 18:36:31
 */


 

 interface Action {
     String[] test(String str);
 }
 
 public class Test2_3 {
     public static void main(String[] args) {
         // 使用匿名内部类实现按 "|" 分割字符串的功能
         Action actionPipe = new Action() {
             @Override
             public String[] test(String str) {
                 return str.split("\\|"); // 使用 "|" 作为分隔符
             }
         };
 
         // 使用匿名内部类实现按 "-" 分割字符串的功能
         Action actionDash = new Action() {
             @Override
             public String[] test(String str) {
                 return str.split("-"); // 使用 "-" 作为分隔符
             }
         };
 
         // 测试按 "|" 分割的方法
         String[] pipeSplit = actionPipe.test("a|b|c");
         // 构造并打印结果
         System.out.println(formatArray(pipeSplit)); // 输出 "[\"a\",\"b\",\"c\"]"
 
         // 测试按 "-" 分割的方法
         String[] dashSplit = actionDash.test("a-b-c");
         // 构造并打印结果
         System.out.println(formatArray(dashSplit)); // 输出 "[\"a\",\"b\",\"c\"]"
     }
 
     // 辅助方法用于格式化字符串数组
     private static String formatArray(String[] array) {
         StringBuilder sb = new StringBuilder("[\"");
         for (int i = 0; i < array.length; i++) {
             sb.append(array[i]);
             if (i < array.length - 1) {
                 sb.append("\",\"");
             }
         }
         sb.append("\"]");
         return sb.toString();
     }
 }