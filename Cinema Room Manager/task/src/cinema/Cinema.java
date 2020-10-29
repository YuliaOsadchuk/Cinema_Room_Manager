package cinema;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seatsInRow = scanner.nextInt();
        String[][] array = new String[rows][seatsInRow];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = "S";
            }
        }
        printArray(array, seatsInRow);

        System.out.println("Enter a row number:");
        int rowNumber = scanner.nextInt();
        System.out.println("Enter a seat number in that row:");
        int seatNumber = scanner.nextInt();
        rowNumber--;
        seatNumber--;
        int allSeats = rows * seatsInRow;
        System.out.println();
        if (allSeats < 60) {
            System.out.println("Ticket price: $10");
        } else {
            int expensive = rows / 2;
            if (rowNumber < expensive) {
                System.out.println("Ticket price: $10");
            } else {
                System.out.println("Ticket price: $8");
            }
        }
        System.out.println();
        array[rowNumber][seatNumber] = "B";
        printArray(array, seatsInRow);

       /* int allSeats = rowNumber * seatNumber;
        int total = 0;
        if (allSeats < 60) {
            total = allSeats * 10;
        } else {
            int expensive = rowNumber / 2;
            int cheaper = rowNumber - expensive;
            total = expensive * seatNumber * 10 + cheaper * seatNumber * 8;
        }
        System.out.println("Total income:");
        System.out.println("$" + total);*/
    }

    public static void printArray(String[][] array, int seatsInRow) {
        System.out.println("Cinema:");
        System.out.print(" ");
        for (int i = 1; i < seatsInRow + 1; i++) {
            System.out.print(" " + i);
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + 1);
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(" " + array[i][j]);
            }
            System.out.println();
        }
    }
}