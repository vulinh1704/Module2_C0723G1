import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Demo {
    public static void main(String[] args) {
        // số chứng minh nhân dân , tên
        Map<Integer, String> map = new HashMap<>();
        map.put(889, "Linh");
        map.put(1704, "Hồng");
        map.put(999, "Long");
        //map.put(889, "LInh2");
        map.remove(889);
        //System.out.println(map.keySet());
        for (Integer key: map.keySet()) {
            System.out.println(map.get(key));
        }
        //map.put(889, "Linh2");
        //System.out.println(map.get(889));
    }
}
