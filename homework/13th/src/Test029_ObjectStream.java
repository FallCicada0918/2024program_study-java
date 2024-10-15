/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-15 15:37:50
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-15 15:56:18
 * @: 無限進步
 */

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Test029_ObjectStream {
    // 定义文件路径常量
    private final static String FILE_PATH = "D:/test/obj_file.txt";
    
    // 保存对象列表到文件
    public static void save(ArrayList<Person> listPerson) {
        // 使用 try-with-resources 语句自动关闭资源
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            // 遍历列表并写入每个对象
            for(int i = 0; i < listPerson.size(); i++ ){
                oos.writeObject(listPerson.get(i));
            }
        } catch (IOException e) {
            // 捕获并打印IO异常
            e.printStackTrace();
        }
    }
    
    // 从文件加载对象列表
    public static void load(ArrayList<Person> listPerson) {
        // 使用 try-with-resources 语句自动关闭资源
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            while (true) {
                try {
                    // 读取对象并添加到列表
                    Person person = (Person) ois.readObject();
                    listPerson.add(person);
                    // 打印读取的对象
                    System.out.println(person);
                } catch (EOFException e) {
                    // 捕获EOF异常，表示文件读取完毕，跳出循环
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            // 捕获并打印IO异常和类未找到异常
            e.printStackTrace();
        }
    }
    
    // 主方法，程序入口
    public static void main(String[] args) {
        ArrayList<Person> listPerson = new ArrayList<>();
        listPerson.add(new Person("Alice", "Female"));
        listPerson.add(new Person("Bob", "Male"));
        listPerson.add(new Person("Charlie", "Male"));
        
        save(listPerson);
        ArrayList<Person> loadedPersons = new ArrayList<>();
        load(loadedPersons);
    }
}

class Person implements Serializable {
    
    private static final long serialVersionUID = 4258798319750620830L;
    private String name;
    private String gender;
    
    public Person() {
    }
    
    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getGender() {
        return gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    @Override
    public String toString() {
        return "Person [name=" + name + ", gender=" + gender + "]";
    }
}