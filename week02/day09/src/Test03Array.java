/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-05 11:12:59
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-05 11:30:08
 */
public class Test03Array {
    public static void main(String[] args) {
        int[][] arr = new int[][] {{1,2,3,4},{1,2,3,4},{1,2,3,4}};
        doubleSum(arr);
    }
    static void doubleSum(int[][] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                sum += arr[i][j];
            }
        }
        System.out.println("sum = " + sum);
    }
}