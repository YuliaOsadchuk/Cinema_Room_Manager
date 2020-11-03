import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] array = s.split(" ");
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, array);
        int n = scanner.nextInt();
        int rotation = n % list.size();
        for (int i = 0; i < rotation; i++) {
            list.add(0, list.get(list.size() - 1));
            list.remove(list.size() - 1);
        }

        for (String str : list) {
            System.out.print(str + " ");
        }
    }
}