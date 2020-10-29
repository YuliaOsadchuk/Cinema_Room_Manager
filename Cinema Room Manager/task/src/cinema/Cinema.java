package cinema;

public class Cinema {

    public static void main(String[] args) {
        String[][] array = new String[7][8];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = "S";
            }
        }
        System.out.println("Cinema:");
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
        }
    }
}