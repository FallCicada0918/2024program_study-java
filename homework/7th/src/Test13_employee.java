/*
 * @Description: 雇员工资支付程序
 * @Author: FallCicada
 * @Date: 2024-09-18 17:07:13
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-18 17:15:22
 */
public class Test13_employee {
    public static void main(String[] args) {
        // 21表示工作天数
        Employee worker = new Worker("张三", "男", "2001.01.01", 21);
        // 3000 表示基本工资 2000表示销售提成
        Employee salesman = new Salesman("赵六", "男", "2000.03.07", 3000, 2000);
        // 6000 表示基本工资
        Employee manager = new Manager("李四", "女", "2003.02.09", 6000);
        // 168表示工作小时
        Employee floater = new Floater("王五", "女", "2002.10.23", 168);

        System.out.println(worker.toString() + " 本月工资为 " + worker.computeSalary() + " 元。");
        System.out.println(salesman.toString() + " 本月工资为 " + salesman.computeSalary() + " 元。");
        System.out.println(manager.toString() + " 本月工资为 " + manager.computeSalary() + " 元。");
        System.out.println(floater.toString() + " 本月工资为 " + floater.computeSalary() + " 元。");
    }
}

/*
 * 抽象类 Employee 定义了所有员工共有的属性和方法
 */
abstract class Employee {
    private String name; // 姓名
    private String gender; // 性别
    private String birthDate; // 出生日期

    public Employee(String name, String gender, String birthDate) {
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
    }

    /**
     * 计算工资
     * @return 工资金额
     */
    public abstract double computeSalary();

    @Override
    public String toString() {
        return this.name + " " + this.gender + " " + this.birthDate;
    }
}

/**
 * 工人类
 */
class Worker extends Employee {
    private int workDays; // 工作天数
    private static final double DAILY_WAGE = 200; // 每天工资

    public Worker(String name, String gender, String birthDate, int workDays) {
        super(name, gender, birthDate);
        this.workDays = workDays;
    }

    @Override
    public double computeSalary() {
        return workDays * DAILY_WAGE;
    }
}

/**
 * 销售人员类
 */
class Salesman extends Employee {
    private double baseSalary; // 基本工资
    private double commission; // 销售提成

    public Salesman(String name, String gender, String birthDate, double baseSalary, double commission) {
        super(name, gender, birthDate);
        this.baseSalary = baseSalary;
        this.commission = commission;
    }

    @Override
    public double computeSalary() {
        return baseSalary + commission;
    }
}

/**
 * 经理类
 */
class Manager extends Employee {
    private double baseSalary; // 基本工资

    public Manager(String name, String gender, String birthDate, double baseSalary) {
        super(name, gender, birthDate);
        this.baseSalary = baseSalary;
    }

    @Override
    public double computeSalary() {
        return baseSalary;
    }
}

/**
 * 临时工类
 */
class Floater extends Employee {
    private int workHours; // 工作小时数
    private static final double HOURLY_WAGE = 50; // 每小时工资

    public Floater(String name, String gender, String birthDate, int workHours) {
        super(name, gender, birthDate);
        this.workHours = workHours;
    }

    @Override
    public double computeSalary() {
        return workHours * HOURLY_WAGE;
    }
}