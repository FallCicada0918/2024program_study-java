/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-18 16:58:13
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-18 17:04:00
 */
class Super{
    protected int test(){
    return 1;
    }
}


class Sub extends Super{

    @Override
    public int test(){
        return 0;
    }
}
public class Test12 {
    public static void main(String[] args) {
        Super s = new Sub();
        System.out.println(s.test());
    }
}