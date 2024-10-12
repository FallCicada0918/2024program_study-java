
package day01;

/**
 * Test01
 */
public class Test01 {

    public static void main(String[] args) {
        RabbitAndTurtle rabbit = new RabbitAndTurtle("兔子");
        RabbitAndTurtle Turtle = new RabbitAndTurtle("乌龟");
        
        rabbit.start();
        Turtle.start();
    }
}