import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int z1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int z2 = scanner.nextInt();

        if (x1 > x2 && y1 > y2 && z1 > z2) {
            System.out.println("Box 1 > Box 2");
            return;
        }

        if (x1 < x2 && y1 < y2 && z1 < z2) {
            System.out.println("Box 1 < Box 2");
            return;
        }

        if (x1 > y2 && y1 > x2 && z1 > z2) {
            System.out.println("Box 1 > Box 2");
            return;
        }

        if (x1 < y2 && y1 < x2 && z1 < z2) {
            System.out.println("Box 1 < Box 2");
        }

        if (x1 > y2 && y1 > z2 && z1 > x2) {
            System.out.println("Box 1 > Box 2");
            return;
        }

        if (x1 < y2 && y1 < z2 && z1 < x2) {
            System.out.println("Box 1 < Box 2");
            return;
        }

        if (x1 > z2 && y1 > x2 && z1 > y2) {
            System.out.println("Box 1 > Box 2");
            return;
        }

        if (x1 < z2 && y1 < x2 && z1 < y2) {
            System.out.println("Box 1 < Box 2");
            return;
        }

        if (x1 > z2 && y1 > y2 && z1 > z2) {
            System.out.println("Box 1 > Box 2");
            return;
        }

        if (x1 < z2 && y1 < y2 && z1 < z2) {
            System.out.println("Box 1 < Box 2");
            return;
        }

        if (x1 > x2 && y1 > z2 && z1 > y2) {
            System.out.println("Box 1 > Box 2");
            return;
        }

        if (x1 < x2 && y1 < z2 && z1 < y2) {
            System.out.println("Box 1 < Box 2");
            return;
        }

        System.out.println("Incompatible");
    }
}