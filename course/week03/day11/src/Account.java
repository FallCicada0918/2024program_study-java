/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-09 16:29:39
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-10 09:02:02
 */
public class Account {
    private String id;//卡号
    private double balance;//余额
    private String userName;//用户名
    private String type;//用户类型

    // 构造方法 - 无参 - 无参构造器
    public Account(){
        System.out.println("调用了Account的无参构造器");
    }

    //构造方法 - 有参 - 有参构造器
    public Account(String id, double balance){
        this.id = id;
        this.balance = balance;
    }

    public Account(String userName ,String id ,double balance) {
        this(id,balance);
        this.userName = userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getId(){
        return id;
    } 

    public double getBalance(){
        return balance;
    }

}