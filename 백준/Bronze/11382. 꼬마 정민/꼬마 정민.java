import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        System.out.println(sum(a, b, c));
    }
    static long sum(double a, double b, double c){
        return (long) (a+b+c);
    }
}