import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 17/09/16.
 */
public class MethodRef {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Mahesh");
        names.add("Suresh");
        names.add("Ramesh");
        names.add("Kalpesh");
        names.add("dinesh");
        names.add("Naresh");


        names.forEach(System.out::println);
    }
}
