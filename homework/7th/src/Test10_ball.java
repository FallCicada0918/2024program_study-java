/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-18 16:13:30
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-18 16:13:34
 */
abstract class Ball {
    public abstract void play();
}
class Basketball extends Ball {
    @Override
    public void play() {
        System.out.println("Playing basketball.");
    }
}
class Football extends Ball {
    @Override
    public void play() {
        System.out.println("Playing football.");
    }
}
public class Test10_ball {
    public static void playBall(Ball ball) {
        ball.play();
    }
    public static void main(String[] args) {
        Ball b = new Ball() {
            @Override
            public void play() {
                System.out.println("Playing an undefined type of ball.");
            }
        };
        Ball b2 = new Basketball();
        Ball b3 = new Football();

        playBall(b);   // 输出 Playing an undefined type of ball.
        playBall(b2);  // 输出 Playing basketball.
        playBall(b3);  // 输出 Playing football.
    }
}