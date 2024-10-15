/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-15 14:33:54
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-15 14:45:06
 * @: 無限進步
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Test05
 */
public class Test05 {

    public static void main(String[] args) throws IOException {
        // FileReader fileReader = new FileReader("D:\\WorkSpace\\FallCicada_WorkSpace\\FallCicada_JAVA\\course\\week08\\day32\\path\\a.txt");
        // int read;
        // while((read = fileReader.read()) != -1){
        //     System.out.println((char)read);
        // }
        // fileReader.close();
        File file = new File("D:\\WorkSpace\\FallCicada_WorkSpace\\FallCicada_JAVA\\course\\week08\\day32\\path\\a.txt");
        InputStreamReader isr = new InputStreamReader(new FileInputStream(file),"GBK");
        char[] date = new char[8];
        int length;
        while((length = isr.read()) != -1){
            System.out.println(new String(date,0,length));       
        }
        isr.close();
    }
}