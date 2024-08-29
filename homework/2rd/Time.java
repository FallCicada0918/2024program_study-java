public class Time {
    public static void main(String[] args) {
        long millisecondsInADay = 24 * 60 * 60 * 1000L; // 一天的毫秒数
        long microsecondsInADay = 24 * 60 * 60 * 1000L * 1000L; // 一天的微秒数
        System.out.println("一天的毫秒数: " + millisecondsInADay);
        System.out.println("一天的微秒数: " + microsecondsInADay);
    }
}