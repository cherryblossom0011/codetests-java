import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(devide(a, b));
    }
    static double devide(int a, int b) {
        return (double)a/(double)b;
    }
}