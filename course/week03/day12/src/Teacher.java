/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-10 09:03:51
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-10 10:32:30
 */
public class Teacher {
    //私有类属性
    //姓名
    private String name;
    //工号
    private String id;
    //性别
    private char sex;
    //无参构造方法
    public Teacher() {

    }
    //两参构造方法
    public Teacher(String name, String id) {
        this.name = name;
        this.id = id;
    }
    //三参构造方法
    public Teacher(String name, String id, char sex) {
        this(name, id);
        this.sex = sex;
    }
    //设置id
    public void setId(String id) {
        this.id = id;
    }
    //设置name
    public void setName(String name) {
        this.name = name;
    }
    //设置sex
    public void setSex(char sex) {
        this.sex = sex;
    }
    //获取id
    public String getId() {
        return id;
    }
    //获取name
    public String getName() {
        return name;
    }
    //获取sex
    public char getSex() {
        return sex;
    }
    //show方法
    public void sayHello() {
        System.out.println("你好! 我的名字是：" + name + ";工号：" + id + ";性别：" + sex + "。");
    }
}