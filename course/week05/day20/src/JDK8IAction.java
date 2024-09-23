/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-23 14:47:58
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-23 14:52:26
 */
public interface JDK8IAction {
    //public static final String NUM = "0";
    String NUM = "0";
    
    //抽象方法
    public void start();
    
    public void end();


    //jdk8,接口可以添加静态方法和默认方法
    public default void defun(){
        //默认方法
        System.out.println("default");
    }
    public static void sfun(){
        //静态方法
        System.out.println("static");
    }
}