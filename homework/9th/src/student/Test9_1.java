package student;
import java.util.Comparator;
/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-08 08:49:09
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-08 09:01:32
 */
/**
 * Test9_1
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class Test9_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Student, String> studentMap = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Double.compare(s2.getScore(), s1.getScore());
            }
        });

        while (true) {
            String input = sc.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split("\\.");
            String id = parts[0];
            String name = parts[1];
            int age = Integer.parseInt(parts[2]);
            double score = Double.parseDouble(parts[3]);

            Student student = new Student(id, name, age, score);
            studentMap.put(student, id);
        }
        System.out.println("学生信息如下:");
        // 遍历集合
        for (Map.Entry<Student, String> entry : studentMap.entrySet()) {
            System.out.println(entry.getKey());
        }

        // 判断 003 号学生是否存在并删除
        Student studentToRemove = null;
        for (Student student : studentMap.keySet()) {
            if (student.getId().equals("003")) {
                studentToRemove = student;
                break;
            }
        }
        System.out.println("是否删除003号学生: " + (studentToRemove != null));
        if (studentToRemove != null) {
            studentMap.remove(studentToRemove);
        }

        // 再次遍历集合，采用另一种方式遍历
        System.out.println("删除003号后，剩余学生信息如下:");
        studentMap.forEach((student, id) -> {
            System.out.println(student);
        });

        sc.close();
    }
}