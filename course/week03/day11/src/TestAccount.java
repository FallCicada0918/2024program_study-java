/*
 * @Description: Account测试类
 * @Author: FallCicada
 * @Date: 2024-09-09 16:34:40
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-09 17:10:10
 */
public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account();
        // 编译时错误: 直接访问私有属性 private 
        //account.id = "123456789";
        //account.balance = 5000;
        account.setId("123456789");
        account.setBalance(5000);
        //报错,同上
        // System.out.println("卡号：" + account.id);
        // System.out.println("余额：" + account.balance);
        //正确的取值方式
        System.out.println("卡号：" + account.getId());
        System.out.println("余额：" + account.getBalance());
        Account account2 = new Account("987654321", 500);
        System.out.println(account2.getId());
        System.out.println(account2.getBalance());
        
    }
}