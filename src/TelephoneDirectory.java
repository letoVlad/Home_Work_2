import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TelephoneDirectory {
    Map<String, List<Long>> phoneList = new HashMap<>();

    void add(Long number, String name) {
        phoneList.putIfAbsent(name, new ArrayList<>());
        phoneList.get(name).add(number);
    }

    Map<String, List<Long>> get(String name) {
        var numbers = phoneList.get(name);
        if (numbers != null) {
            return Map.of(name, numbers);
        } else {
            System.out.println("Нет номера для " + name);
            return new HashMap<>();
        }
    }
}