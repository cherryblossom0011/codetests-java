import java.util.*;

public class Main{
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println(minus());
    }
    static int minus() {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        return a-b;
    }
}