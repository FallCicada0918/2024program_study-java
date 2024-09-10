/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-10 11:27:25
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-10 15:00:12
 */

public class Duration {
    int hour;
    int min; 
    int sec;

    public Duration() {
        
    }

    public Duration(int seconds) {
        int hour = seconds/3600;
        int min = (seconds%3600)/60;
        int sec = (seconds%3600)%60;
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public Duration(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public int getHour() {
        return hour;
    }

    public int getMin() {
        return min;
    }

    public int getSec() {
        return sec;
    }

    public int getTotalSeconds() {
        return hour*3600 + min*60 + sec;
    }

    public void disp() {
        int second = hour*3600 + min*60 + sec;
        System.out.println(hour + "小时;" + min + "分钟;" + sec + "秒");
        System.out.println("总秒数:" + second);
    }


}