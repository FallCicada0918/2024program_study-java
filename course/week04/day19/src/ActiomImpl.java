/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-20 10:41:30
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-20 10:49:37
 */
public class ActiomImpl implements IAction {
    //重写接口的全部抽象方法
    @Override
    public void start() {
        System.out.println("開始執行 - start");
    }
    @Override
    public void end() {
        System.out.println("運行結束 - end");
    }
}