/*
 * @Description: 游戏类
 * @Author: FallCicada
 * @Date: 2024-09-19 10:45:17
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-19 11:03:39
 */
public class Game {
    //篮球
    public void start(BasketBall basketBall){
        basketBall.play();
    }
    //足球
    public void start(FootBall footBall){
        footBall.play();
    }
    //乒乓球
    public void start(PingPang pingPang){
        pingPang.play();
    }

}