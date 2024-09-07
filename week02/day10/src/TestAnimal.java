/*
 * @Description: 动物的测试类
 * @Author: rendc
 * @Date: 2024-09-06 16:25:19
 * @LastEditors: rendc
 * @LastEditTime: 2024-09-06 16:34:14
 */
public class TestAnimal{
  public static void main(String[] args){
    // 创建 Animal 类 的 对象 animal
    Animal animalCat = new Animal();
    animalCat.type = "猫";
    animalCat.name = "花花";
    animalCat.age = 1;
    animalCat.color = "花花";
    animalCat.eat("鱼");
    animalCat.sayHello();
    // 创建 Animal 类 的 对象 🐼
    Animal panda = new Animal();
    panda.type = "熊猫";
    panda.name = "熊猫花花";
    panda.age = 1;
    panda.color = "黑白相间";
    panda.eat("竹子");
    panda.sayHello();
  }
}