import java.util.*;

public class Main{
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println(plus());
    }
    static int plus() {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        return a+b;
    }
}