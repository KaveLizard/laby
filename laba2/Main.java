import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Scanner;
import java.text.*;
import java.util.Formatter;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("x: ");
        BigDecimal x = BigDecimal.valueOf(scan.nextDouble());
        System.out.print("k: ");
        BigInteger k = BigInteger.valueOf(scan.nextInt());
        BigDecimal sum = BigDecimal.valueOf(0);
        BigDecimal e = BigDecimal.valueOf(Math.pow(10, -(k.doubleValue())));
        BigDecimal a = x;
        BigDecimal d = BigDecimal.valueOf(3);
        while (a.abs().compareTo(e) == 1) {
            sum = sum.add(a);
            a = BigDecimal.valueOf(Math.pow(x.doubleValue(), d.doubleValue()));
            a = a.divide(d, k.intValue() + 1, RoundingMode.HALF_UP);
            d = d.add(BigDecimal.valueOf(2));
        }
        sum = sum.multiply(BigDecimal.valueOf(2));
        BigDecimal ln = BigDecimal.valueOf(Math.log((1 + x.doubleValue()) / (1 - x.doubleValue())));
        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMaximumFractionDigits(k.intValue() + 1);
        System.out.format("k hex: %x %nk octal: %o %n", k, k);
        System.out.format("sum: %010f %n", sum);
        System.out.format("func: %#.5f %n", ln);
        System.out.format("%3$,d %1$d %2$+d", -1, 54, 130000);
    }
}
