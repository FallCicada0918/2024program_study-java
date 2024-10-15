/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-15 15:30:36
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-15 15:30:41
 * @: 無限進步
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Test08
 */
public class Test08 {
    private static final String TRIAL_FILE = "trial_count.txt";
    private static final int INITIAL_TRIALS = 10;
    
    public static void main(String[] args) {
        File file = new File(TRIAL_FILE);
        int trialsLeft = INITIAL_TRIALS;
    
        // 如果文件不存在，创建文件并写入初始试用次数
        if (!file.exists()) {
            try (FileWriter writer = new FileWriter(file)) {
                writer.write(String.valueOf(INITIAL_TRIALS));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // 读取当前的试用次数
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            trialsLeft = Integer.parseInt(reader.readLine().trim());
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 判断试用次数
        if (trialsLeft > 0) {
            trialsLeft--;
            try (FileWriter writer = new FileWriter(file)) {
                writer.write(String.valueOf(trialsLeft));
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("您还有 " + trialsLeft + " 次试用机会。");
        } else {
            System.out.println("您的试用次数已用完，请购买正版软件。");
        }
    }
}   