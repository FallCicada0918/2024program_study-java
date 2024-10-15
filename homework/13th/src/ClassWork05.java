/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-15 18:23:14
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-15 19:54:53
 * @: 無限進步
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
/**
 * ClassWork05
 */
public class ClassWork05 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 20));
        students.add(new Student("Bob", 22));
        students.add(new Student("Charlie", 21));
        students.add(new Student("David", 23));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\WorkSpace\\FallCicada_WorkSpace\\FallCicada_JAVA\\homework\\13th\\src\\dir\\Student.txt"));
        //写入文件        
        for(Object student:students){
            oos.writeObject(student);
        }
        //读出文件
        // 序列化对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\WorkSpace\\FallCicada_WorkSpace\\FallCicada_JAVA\\homework\\13th\\src\\dir\\Student.txt"));
        for(int i = 0; i < students.size(); i++){
            Student student = (Student) ois.readObject();
            System.out.println(student);
        }
        // // 创建对象
        // Student student = (Student) ois.readObject();
        // // 序列化
        // System.out.println("对象反序列化成功" + student);
        // 关闭流
        ois.close();
        //释放资源
        oos.close();
    }
}
