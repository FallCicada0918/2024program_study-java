import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Test07
 */
public class Test07 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\WorkSpace\\FallCicada_WorkSpace\\FallCicada_JAVA\\course\\week08\\day33\\file\\Student.txt"));
        
        Student s1 = (Student) ois.readObject();
        
        System.out.println("对象反序列化成功" + s1);
        //操作完成后，关闭流
        ois.close();
    }
}