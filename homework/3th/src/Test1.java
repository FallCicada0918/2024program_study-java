public class Test1 {
    public static void main(String[] args) {
        // 输出5和9的按位与运算结果
        System.out.println(5&9);
        // 输出5和9的按位或运算结果
        System.out.println(5|9);
        // 输出5和9的按位异或运算结果
        System.out.println(5^9);
        // 输出-5的按位取反结果
        System.out.println(~-5);
        // 输出5左移2位的结果
        System.out.println(5<<2);
        // 输出-5左移2位的结果
        System.out.println(-5<<2);
        // 输出-5右移2位的结果（算术右移）
        System.out.println(-5>>2);
        // 输出-5无符号右移2位的结果
        System.out.println(-5>>>2);
        // 输出5右移2位的结果（算术右移）
        System.out.println(5>>2);
        // 输出5右移34位的结果（算术右移），由于34超过了int类型的位数，因此结果会依赖于具体实现
        System.out.println(5>>34);
        // 判断字符'a'的ASCII码值是否等于97
        System.out.println(97=='a');
        // 判断浮点数5.0是否等于整数5
        System.out.println(5.0==5);
        // 判断4是否大于5，并与'c'是否大于'a'进行按位异或运算
        System.out.println(4>5 ^ 'c'>'a');
        // 将-1先转换为byte类型，再转换为char类型，最后转换为int类型并输出
        System.out.println((int)(char)(byte)-1);
    }
}
