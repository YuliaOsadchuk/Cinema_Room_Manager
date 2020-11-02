import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        String s = "";
        while (!(s = scanner.nextLine()).equals("end")) {
            list.add(s);
        }

        int n = list.size();
        String[] mas = list.get(0).split("\\s");
        int m = mas.length;

        int[][] array = new int[n][m];
        int[][] newArray = new int[n][m];
        for (int i = 0; i < array.length; i++) {
            mas = list.get(i).split("\\s");
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = Integer.parseInt(mas[j]);
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int top;
                if (i == 0) {
                    top = array[array.length - 1][j];
                } else {
                    top = array[i - 1][j];
                }

                int bottom;
                if (i == array.length - 1) {
                    bottom = array[0][j];
                } else {
                    bottom = array[i + 1][j];
                }

                int left;
                if (j == 0) {
                    left = array[i][array[i].length - 1];
                } else {
                    left = array[i][j - 1];
                }

                int right;
                if (j == array[i].length - 1) {
                    right = array[i][0];
                } else {
                    right = array[i][j + 1];
                }

                newArray[i][j] = top + bottom + left + right;
            }
        }


        for (int[] i : newArray) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}