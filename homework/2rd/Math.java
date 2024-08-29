import java.math.BigDecimal;
import java.math.RoundingMode;
public class Math {
    public static void main(String[] args) {
        BigDecimal money = new BigDecimal("2.0"); 
        BigDecimal cost = new BigDecimal("1.1"); 
        BigDecimal change = money.subtract(cost).setScale(1, RoundingMode.HALF_UP);
        System.out.println("找零: " + change); 
    }
}