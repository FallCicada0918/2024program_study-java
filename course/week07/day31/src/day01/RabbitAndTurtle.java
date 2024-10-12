package day01;

/**
 * RabbitAndTurtle
 */
import java.util.Random;
 
public class RabbitAndTurtle extends Thread{

    public static boolean flag = true;
    
    public int distance = 0;


    RabbitAndTurtle(String name) {
        //直接使用线程类的构造方法
        super(name);
    }
    
    @Override
    public void run(){
        while (flag) {
            //如果flag为true，代表比赛正在进行
            double random = Math.random();//0~1之间的随机数[0,1)
            if (random < 0.3 && "兔子".equals(this.getName())) {
                //如果随机数小于0.3，兔子跑两米
                distance += 2;
                System.out.println("兔子跑了" + distance + "米");
            }
            if (random < 0.3 && "乌龟".equals(this.getName())) {
                //如果随机数小于0.6，兔子跑三米
                distance += 1;
                System.out.println("乌龟跑了" + distance + "米");           
            }
            if (distance >= 100) {
                System.out.println("恭喜" + this.getName() + "胜利");
                flag = false;
            }
        }
    }
}