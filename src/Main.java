import java.util.*;

public class Main {
    public static Map<String, List<Integer>> map1 = new HashMap<>(5);
    public static Map<String, Integer> map2 = new HashMap<>(5);
    public static Random random = new Random();

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            map1.put(String.format("STR%d", i),
                    new ArrayList<>(Arrays.asList(random.nextInt(0, 1000),
                            random.nextInt(0, 1000),
                            random.nextInt(0, 1000))));
        }
        System.out.println(map1);

        for (String element : map1.keySet()) {
            map2.put(element, sum(map1.get(element)));
        }
        System.out.println(map2);
    }

    public static Integer sum(List<Integer> list) {
        Integer sum = 0;
        for (Integer element : list) {
            sum += element;
        }
        return sum;
    }
}
