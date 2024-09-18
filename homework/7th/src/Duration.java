/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-16 11:32:49
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-16 11:32:53
 */
public class Duration {
    private int hours;
    private int minutes;
    private int seconds;

    // 三参构造器
    public Duration(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        normalize();
    }

    // 单参构造器，参数为总的秒数
    public Duration(int totalSeconds) {
        this.hours = totalSeconds / 3600;
        totalSeconds %= 3600;
        this.minutes = totalSeconds / 60;
        this.seconds = totalSeconds % 60;
    }

    // 获取小时数
    public int getHours() {
        return hours;
    }

    // 获取分钟数
    public int getMinutes() {
        return minutes;
    }

    // 获取秒数
    public int getSeconds() {
        return seconds;
    }

    // 返回总的秒数
    public int getTotalSeconds() {
        return hours * 3600 + minutes * 60 + seconds;
    }

    // 将对象转换为字符串形式，格式为"X小时Y分钟Z秒"
    @Override
    public String toString() {
        return String.format("%d:%d:%d", hours, minutes, seconds);
    }

    // 私有方法，用于标准化时间
    private void normalize() {
        while (seconds >= 60) {
            seconds -= 60;
            minutes++;
        }
        while (minutes >= 60) {
            minutes -= 60;
            hours++;
        }
    }
}