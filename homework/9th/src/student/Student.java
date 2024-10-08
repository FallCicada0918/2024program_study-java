package student;
/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-08 08:45:42
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-08 08:57:14
 */
public class Student {
    private String id;
    private String name;
    private int age;
    private double score;
    public Student() {
    }
    public Student(String id, String name, int age, double score) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.score = score;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getScore() {
        return score;
    }
    public void setScore(double score){
        this.score = score;
    }
    @Override
    public String toString() {
        return "Student{" +
        "id='" + id + '\'' +
        ", name='" + name + '\'' +
        ", age=" + age +
        ", score=" + score +
        '}';
    }
}