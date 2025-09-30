import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(multi(a, b));
    }
    static int multi(int a, int b) {
        return a*b;
    }
}