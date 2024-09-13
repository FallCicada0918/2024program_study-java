/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-11 18:30:01
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-13 08:36:57
 */
/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-11 16:27:09
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-11 16:42:10
 */
public class School{
    //属性
    private String name;//学校的名字
    private int number;//学生数量
    public static String library = "栋梁图书馆";//图书馆名字
    //成员方法
    //get,set
    //构造器
    public School(){
        System.out.println("调用了school无参构造器");
    }
    //全参构造器
    public School(String name,int number,String libaray){
        this.name = name;
        this.number = number;
    }
    //show方法输出
    public void show(){
        System.out.println("学校名称:"+name+"学生数量:"+number+"图书馆名字:"+library);
    }
}
