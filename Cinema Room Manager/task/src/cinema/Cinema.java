package cinema;

import java.util.Scanner;

public class Cinema {
    public static int rows;
    public static int seatsInRow;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        seatsInRow = scanner.nextInt();
        String[][] array = new String[rows][seatsInRow];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = "S";
            }
        }

        int itemsMenu = -1;
        boolean exit = false;
        while (!exit) {
            System.out.println();
            System.out.println("1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("3. Statistics");
            System.out.println("0. Exit");
            System.out.println();
            itemsMenu = scanner.nextInt();
            switch (itemsMenu) {
                case 1: {
                    printArray(array);
                    break;
                }
                case 2: {
                    buyTicket(array);
                    break;
                }
                case 3: {
                    statistics(array);
                    break;
                }
                case 0: {
                    exit = true;
                }
            }
        }
    }

    public static void statistics(String[][] array) {
        int soldTickets = 0;
        for (String[] s : array) {
            for (String i : s) {
                if (i.equals("B")) {
                    soldTickets++;
                }
            }
        }
        System.out.println("Number of purchased tickets: " + soldTickets);

        int allSeats = rows * seatsInRow;
        double percent;
        if (soldTickets == 0) {
            percent = 0;
        } else {
            percent = 100.0 / allSeats * soldTickets;
        }
        System.out.printf("Percentage: %.2f%%\n", percent);

        currentCalculation(array);
        totalCalculation(array);
    }

    public static void totalCalculation(String[][] array) {
        int allSeats = rows * seatsInRow;
        int total = 0;
        if (allSeats < 60) {
            total = allSeats * 10;
        } else {
            int expensive = rows / 2;
            int cheaper = rows - expensive;
            total = expensive * seatsInRow * 10 + cheaper * seatsInRow * 8;
        }
        System.out.printf("Total income: $%d\n", total);
    }

    public static void currentCalculation(String[][] array) {
        int current = 0;
        int allSeats = rows * seatsInRow;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == "B") {
                    if (allSeats < 60) {
                        current += 10;
                    } else {
                        int expensive = rows / 2;
                        if (rows < expensive) {
                            current += 10;
                        } else {
                            current += 8;
                        }
                    }
                }
            }
        }
        System.out.printf("Current income: $%d\n", current);
    }

    public static void buyTicket(String[][] array) {
        Scanner scanner = new Scanner(System.in);
        int rowNumber;
        int seatNumber;
        while (true) {
            System.out.println("Enter a row number:");
            rowNumber = scanner.nextInt();
            System.out.println("Enter a seat number in that row:");
            seatNumber = scanner.nextInt();
            rowNumber--;
            seatNumber--;

            if (rowNumber < 0 || rowNumber > rows - 1 || seatNumber < 0 || seatNumber > seatsInRow - 1) {
                System.out.println("Wrong input!");
                continue;
            }

            if (array[rowNumber][seatNumber].equals("B")) {
                System.out.println("That ticket has already been purchased!");
            } else {
                break;
            }
        }

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
    }

    public static void printArray(String[][] array) {
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