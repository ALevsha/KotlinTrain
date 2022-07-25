import java.util.*;

public class JavaCollections {
    public static void main(String[] args) {
        /* коллекции - просто класс, позволяющий хранить информацию
        и производить манипуляции с данными. В сравнении с массивом
        здесь намного больше функционала, также коллекция расширяема
         */

        System.out.println("Hello from Java");

        /* Фактически это массив, в который можно добавлять
        элементы и удалять их из него. Информация отсортирована
        в порядке добавления элементов. Индексы как в массиве
         */
        List<String> arrayList = new ArrayList<>();
        arrayList.add("new element");
        String firstElementList = arrayList.get(0);

        /* Также как и в примере выше, но в LinkedList хранится
        двусвязный список. Каждый элемент имеет ссылку на предыдущий
        и на следующий элементы
         */
        List<String> linkedList = new LinkedList<>();
        linkedList.add("new element");
        String firstElementLinkedList = linkedList.get(0);

        /* Множество. Порядок элементов не соблюдается.
        Получить значения можно только полным перебором.
         */
        Set<String> set = new HashSet<>();
        set.add("new element");
        //String firstElementListSet = set.;

        /* Словарь. К значениям обращаются по ключу.
        Пары(ключ, значение). Если добавить элемент по такому-же
        ключу, то значение перезапишется на новое.
         */
        Map<String, String> map = new HashMap<>();
        map.put("new key", "new value");
        String firstElementListMap = map.get("new key");
    }
}
