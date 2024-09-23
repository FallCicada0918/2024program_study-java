/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-22 17:52:12
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-22 17:52:16
 */
package flight;

class Bird implements IFly {
    @Override
    public void flyAction() {
        System.out.println("鸟能飞翔");
    }
}