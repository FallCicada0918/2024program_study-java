/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-11 20:37:57
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-11 21:23:57
 * @: 無限進步
 */
/**
 * 假设现在有两个用户账户A和B，每个账户都有一定的余额，现在需要实现一个线程安全的转账功能，即一个用户可以将一定的金额转入到另一个用户账户中。要求如下：
 * 1.	用户可以同时进行多次转账操作，每次转账的金额必须大于0，同时转出账户余额必须大于等于转账金额。
 * 2.	转账过程中，需要对转出账户和转入账户加锁，保证同时只能有一个线程对某个账户进行转账操作。
 * 3.	在进行转账操作时，需要按照账户名称的字典序进行排序，保证转账过程中的资源占用顺序一致，避免死锁的出现。
 * 4.	转账操作完成后，需要释放相应的锁，并输出转账的金额和最新的账户余额。
 * 要求设计一个银行账户转账类，包含以下方法：
 * transfer(Account from, Account to, double amount) ：从账户from中转出一定的金额，将其转入到账户to中。
 * 其中，Account是一个用户账户类，包含以下属性：
 *	String name ：账户名称。
 *	double balance ：账户余额。
 * 编写测试程序，模拟多个用户同时进行转账操作，验证银行账户转账类的线程安全性。
 */
public class Test11 {

    public static void main(String[] args) {
        Bank bank = new Bank();
        Bank.Account a = bank.new Account("FallCicada", 1000);
        Bank.Account b = bank.new Account("Fishb1rd", 500);
        
        //打印两人的余额
        System.out.println(a.getName() + " 余额: " + a.getBalance());
        System.out.println(b.getName() + "余额: " + b.getBalance());
        // 创建两个线程进行转账操作
        Thread t1 = new Thread(() -> bank.transfer(a, b, 200));
        Thread t2 = new Thread(() -> bank.transfer(b, a, 150));

        // 启动线程
        t1.start();
        t2.start();

        // 等待线程完成
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Bank {
    private Object lock = new Object();
    public void transfer(Account from, Account to, double amount) {
        if (from == null || to == null || amount <= 0 || from.getBalance() < amount) {
            throw new IllegalArgumentException("无效的转账参数");
        }


        // 使用 synchronized 块来锁定两个账户
        synchronized(lock) {
                from.withdraw(amount);
                to.deposit(amount);
                System.out.println("从 " + from.getName() + " 转账 " + amount + " 到 " + to.getName());
                System.out.println(from.getName() + " 余额: " + from.getBalance());
                System.out.println(to.getName() + " 余额: " + to.getBalance());
        }
    }
    class Account {
        private final String name;
        private double balance;
        // 添加一个锁对象
        // 构造方法
        public Account(String name, double balance) {
            this.name = name;
            this.balance = balance;
        }
        // getter 方法
        public String getName() {
            return name;
        }
        // getter 方法
        public double getBalance() {
            return balance;
        }
    
        // 使用 synchronized 方法
        public synchronized void deposit(double amount) {
            balance += amount;
        }
    
        // 使用 synchronized 方法
        public synchronized void withdraw(double amount) {
            balance -= amount;
        }
    }
}