/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-15 15:01:34
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-15 15:15:15
 * @: 無限進步
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Test06
 */
public class Test06 {

    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos =  new ObjectOutputStream(new FileOutputStream("D:\\WorkSpace\\FallCicada_WorkSpace\\FallCicada_JAVA\\course\\week08\\day33\\file\\Student.txt"));
        //创建对象
        Student s = new Student("Student", 20);
        //序列化
        oos.writeObject(s);
        
        oos.close();
        
    }
}