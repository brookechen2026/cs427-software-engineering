import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
        System.out.println(map.keySet());
    }
}
