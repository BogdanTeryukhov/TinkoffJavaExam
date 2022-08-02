package TinkoffTasks;

import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,Integer> peoplesMap = new HashMap<>();
        int people = scanner.nextInt(); int requests = scanner.nextInt();
        for (int i = 0; i < people; i++) {
            String name = scanner.next();
            peoplesMap.put(name,i+1);
        }
        Map<String, Integer> sortedMap = new TreeMap<>(peoplesMap);

        Map<Integer,String> requestsMap = new HashMap<>();
        for (int i = 0; i < requests; i++) {
            int l = scanner.nextInt(); String s = scanner.next();
            requestsMap.put(l,s);
        }

        List<Integer> list = new ArrayList<>();

        for (Map.Entry<Integer,String> entry1: requestsMap.entrySet()) {
            String check = entry1.getValue();
            int counter = entry1.getKey();
            int kol = 1;
            for (Map.Entry<String,Integer> entry: sortedMap.entrySet()) {
                if (entry.getKey().startsWith(check) && kol == counter){
                    list.add(entry.getValue());
                    break;
                }else if(entry.getKey().startsWith(check)){
                    kol++;
                }
            }
        }
        for (int i = list.size()-1; i >= 0 ; i--) {
            System.out.println(list.get(i));
        }
    }
}
