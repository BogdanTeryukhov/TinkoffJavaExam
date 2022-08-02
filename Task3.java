package TinkoffTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = scanner.nextInt();
        int[] subscriptions = new int[days];

        for (int i = 0; i < days; i++) {
            if (i%2 == 0){
                subscriptions[i] = scanner.nextInt();
            }else
                subscriptions[i] = -scanner.nextInt();
        }

        for (int i = 1; i < subscriptions.length; i+=2) {

            if (subscriptions[i-1] < Math.abs(subscriptions[i]) || subscriptions[i+1] < Math.abs(subscriptions[i])){
                int temp;
                if (subscriptions[i-1] < Math.abs(subscriptions[i])){
                    temp = -subscriptions[i - 1];
                    subscriptions[i-1] = -subscriptions[i];
                    subscriptions[i] = temp;
                }else{
                    temp = -subscriptions[i + 1];
                    subscriptions[i+1] = -subscriptions[i];
                    subscriptions[i] = temp;
                }
                subscriptions[i] = temp;
            }
        }
        System.out.println(Arrays.stream(subscriptions).sum());
    }
}
