/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-23 14:53:01
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-23 14:56:58
 */
public class JDK8IActionImpl implements JDK8IAction{
    @Override
    public void start() {
        System.out.println("start");
    }
    @Override
    public void end(){
        System.out.println("end");
    }

}