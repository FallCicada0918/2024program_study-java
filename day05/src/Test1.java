import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("请输入第一个整数(输入完按回车):");
        // int num1 = scanner.nextInt();
        // System.out.println("请输入第二个整数(输入完按回车):");
        // int num2 = scanner.nextInt();
        // if ((num1 % 3 == 0 && num1 % 5 == 0) && (num2 % 3 == 0 && num2 % 5 == 0)) {
        //     System.out.println(num1 + "和" + num2 + "都可以被3和5同时整除");
        // } else if (num1 % 3 == 0 && num1 % 5 == 0) {
        //     System.out.println(num1 + " 可以被3和5同时整除");
        // } else if (num2 % 3 == 0 && num2 % 5 == 0) {
        //     System.out.println(num2 + " 可以被3和5同时整除");
        // }else{
        //     System.out.println(num1 + " 和 " + num2 + "都不能被3和5同时整除");
        // }
        // scanner.close();
        // int a = 1;
        // int b = 0;
        // int result = a ^ b;
        // System.out.println("a ^ b = "+result);
        // int x = 1;
        // int y = 5;
        // System.out.println("y = " + y);
        // boolean b1 = (x>4) & (y++>4);
        // System.out.println("y = " + y);
        // System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int a = scanner.nextInt();
        System.out.println("输入第二个整数:");
        int b = scanner.nextInt();
        String s1 = (a > b) ? "a = " + a : "b = " + b;
        System.out.println("较大值是" + s1);

    }
}
