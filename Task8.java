package TinkoffTasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int j = scanner.nextInt(); int buyers = scanner.nextInt();
        String[] domens = new String[j];

        for (int i = 0; i < j; i++) {
            String name = scanner.next();
            domens[i] = name;
        }

        List<Integer> list = new ArrayList<>();
        int kol = 0;
        for (int i = 0; i < buyers; i++) {
            kol = 0;
            String prefix = scanner.next(); String postfix = scanner.next();
            for (String domen : domens) {
                if (domen.startsWith(prefix) && domen.endsWith(postfix)) {
                    kol++;
                }
            }
            list.add(kol);
        }
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
