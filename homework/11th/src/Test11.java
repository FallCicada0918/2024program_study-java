/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-10 18:39:01
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-10 19:11:00
 * @: 無限進步
 */
/**
 * 1.	可以使用随机数取得0~1之间的随机数模拟比赛进程
 * 2.	如果随机数在0~0.3之间代表兔子开始跑,每次跑2米。如果随机数在0.3~1之间代表乌龟开始跑，每次跑1米
 * 3.	总距离为100米，先跑完100米者为胜利者，输出赛跑过程及谁取得冠军
 */
import java.util.Random;

public class Test11 {

    public static void main(String[] args) {
        // 创建 Race 对象
        Race race = new Race();
        // 创建兔子线程，并命名为 "Rabbit"
        Thread rabbitThread = new Thread(race.new Rabbit(), "Rabbit");
        // 创建乌龟线程，并命名为 "Turtle"
        Thread turtleThread = new Thread(race.new Turtle(), "Turtle");

        // 启动兔子线程
        rabbitThread.start();
        // 启动乌龟线程
        turtleThread.start();
    }
}

class Race {
    // 定义总距离为100米
    private static final int TOTAL_DISTANCE = 100;
    // 记录兔子跑的距离
    private int rabbitDistance = 0;
    // 记录乌龟跑的距离
    private int turtleDistance = 0;
    // 标记比赛是否结束
    private boolean raceOver = false;

    // 兔子线程类，实现 Runnable 接口
    class Rabbit implements Runnable {
        @Override
        public void run() {
            Random random = new Random();
            // 当比赛未结束时，循环执行
            while (!raceOver) {
                // 生成一个0到1之间的随机数
                double chance = random.nextDouble();
                // 如果随机数在0到0.3之间，兔子跑2米
                if (chance <= 0.3) {
                    rabbitDistance += 2;
                    System.out.println(Thread.currentThread().getName() + " 跑了 2 m, 总奔跑路程: " + rabbitDistance + " m");
                }
                // 检查是否有胜利者
                gameOver();
                try {
                    // 线程休眠100毫秒
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // 乌龟线程类，实现 Runnable 接口
    class Turtle implements Runnable {
        @Override
        public void run() {
            Random random = new Random();
            // 当比赛未结束时，循环执行
            while (!raceOver) {
                // 生成一个0到1之间的随机数
                double chance = random.nextDouble();
                // 如果随机数在0.3到1之间，乌龟跑1米
                if (chance > 0.3) {
                    turtleDistance += 1;
                    System.out.println(Thread.currentThread().getName() + " 跑了 1 m, 总奔跑路程: " + turtleDistance + " m");
                }
                // 检查是否有胜利者
                gameOver();
                try {
                    // 线程休眠100毫秒
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // 检查是否有胜利者的方法
    private synchronized void gameOver() {
        // 如果兔子跑完100米且比赛未结束，兔子获胜
        if (rabbitDistance >= TOTAL_DISTANCE && !raceOver) {
            raceOver = true;
            System.out.println("Rabbit wins the race!");
        // 如果乌龟跑完100米且比赛未结束，乌龟获胜
        } else if (turtleDistance >= TOTAL_DISTANCE && !raceOver) {
            raceOver = true;
            System.out.println("Turtle wins the race!");
        }
    }
}