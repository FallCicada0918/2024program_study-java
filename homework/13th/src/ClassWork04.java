/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-15 18:23:14
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-15 18:23:14
 * @: 無限進步
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * ClassWork04
 */
public class ClassWork04 {

    public static void main(String[] args) {
        String inputFilePath = "D:\\test\\File_GBK.txt";
        String outputFilePath = "D:\\test\\File_UTF8.txt";

        try (
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(inputFilePath), "GBK"));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputFilePath), "UTF-8"))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}