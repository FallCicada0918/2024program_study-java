
/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-19 11:03:46
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-19 11:06:52
 */
public class Test02 {
    public static void main(String[] args) {
        
        Game game = new Game();
        //创建篮球对象
        BasketBall basketBall = new BasketBall();
        //调用游戏的类方法
        game.start(basketBall);
        //创建篮球对象
        FootBall footBall = new FootBall();
        //调用游戏方法
        game.start(footBall);
        //创建乒乓球对象
        PingPang pingPang = new PingPang();
        //调用游戏方法
        game.start(pingPang);
        
        Game1 game1 = new Game1();
        BasketBall1 basketBall1 = new BasketBall1();
        FootBall1 footBall1 = new FootBall1();
        game1.start(basketBall1);
        game1.start(footBall1);
        
        
    }
}