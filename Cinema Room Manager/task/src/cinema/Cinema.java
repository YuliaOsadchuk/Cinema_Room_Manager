package cinema;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        String[][] array = new String[7][8];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = "S";
            }
        }
        /*System.out.println("Cinema:");
        System.out.print(" ");
        for (int i = 1; i < 9; i++) {
            System.out.print(" " + i);
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + 1);
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(" " + array[i][j]);
            }
            System.out.println();
        }*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seatsInRow = scanner.nextInt();
        int allSeats = rows * seatsInRow;
        int total = 0;
        if (allSeats < 60) {
            total = allSeats * 10;
        } else {
            int expensive = rows / 2;
            int cheaper = rows - expensive;
            total = expensive * seatsInRow * 10 + cheaper * seatsInRow * 8;
        }
        System.out.println("Total income:");
        System.out.println("$" + total);
    }
}