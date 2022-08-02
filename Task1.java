package TinkoffTasks;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ax1 = scanner.nextInt(); int ay1 = scanner.nextInt(); int ax2 = scanner.nextInt(); int ay2 = scanner.nextInt();
        int bx1 = scanner.nextInt(); int by1 = scanner.nextInt(); int bx2 = scanner.nextInt(); int by2 = scanner.nextInt();

        int height = Math.abs(Math.min(ay1,ay2) - Math.max(by1,by2));
        int width = Math.abs(Math.min(bx1,bx2) - Math.max(ax1,ax2));

        System.out.println(Math.max(width,height) * Math.max(width,height));
    }
}
