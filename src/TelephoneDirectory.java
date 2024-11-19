import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TelephoneDirectory {
    Map<String, List<Integer>> phoneList = new HashMap<>();

    void add(Integer number, String name) {
        phoneList.putIfAbsent(name, new ArrayList<>());
        phoneList.get(name).add(number);
    }

    void get(String name) {
        var numbers = phoneList.get(name);
        if (numbers != null) {
            for (Integer number : numbers) {
                System.out.println(number);
            }
        } else {
            System.out.println("Нет записей для " + name);
        }
    }
}