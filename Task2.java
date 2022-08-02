package TinkoffTasks;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            String name1 = scanner.next();
            String name2 = scanner.next();
            String name3 = scanner.next();

            List<String> names = new ArrayList<>();
            names.add(name1);
            names.add(name2);
            names.add(name3);
            Collections.sort(names);

            map.put(i, String.valueOf(names));
        }
        int maxCount = 0;

        for (int i = 0; i < N-1; i++) {
            int count = 1;
            String name = map.get(i);
            for (int j = i+1; j < N; j++) {
                if (name.equals(map.get(j))){
                    count++;
                }
            }
            if (count>maxCount){
                maxCount = count;
            }
        }
        System.out.println(maxCount);
    }
}
