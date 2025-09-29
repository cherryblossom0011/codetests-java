import java.util.*;
import java.time.*;

public class Main{
    public static void main(String args[]){
        LocalDate seoulDate = LocalDate.now(ZoneId.of("Asia/Seoul"));
        System.out.println(seoulDate);
    }
}