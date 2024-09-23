/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-22 17:53:12
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-22 17:53:16
 */
package flight;

public class Plane implements IFly {
    @Override
    public void flyAction() {
        System.out.println("飞机能飞翔");
    }
}