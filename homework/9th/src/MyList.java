/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-29 20:02:43
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-29 20:02:47
 */
public interface MyList { 
    public void add(int index,Object obj);    
    //在指定位置添加对象
    public void add(Object obj);              
    //在最后位置添加对象
    public Object remove(int index);          
    //删除指定位置上的对象 
    public void set(int index,Object obj);    
    //修改指定位置上的数据
    public Object get(int index);             
    //获取指定位置上的数据
    public int size();                        
    //获取当前数据结构当前的⻓度
    public void clear();                      
    //清空所有的数据
}
     
    