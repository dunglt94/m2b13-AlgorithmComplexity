import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chuỗi:");
        String str = scanner.nextLine();

        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            if (list.isEmpty()) {
                list.add(str.charAt(i));
            } else if (str.charAt(i) < list.getLast()) {
                list.clear();
                list.add(str.charAt(i));
            } else if (str.charAt(i) > list.getLast()) {
                list.add(str.charAt(i));
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
        }

        for (Character character : max) {
            System.out.print(character);
        }
    }
}
//  Phân tích sự phức tạp về thời gian của chương trình.
//  line 11: O(1)
//  line 12: O(1)
//  line 14: O(n), word case: O(n^2)
//  line 15: O(1)
//  line 16: O(1)
//  line 17: O(1)
//  line 18: O(1)
//  line 19: O(1)
//  line 20: O(1)
//  line 21: O(1)
//  line 23: O(1)
//  line 24: O(1)
//  line 24: O(m) voi 'm' la so lan lap, word case: O(n)
//  line 29: O(n)
//  line 30: O(1)
//  T(n) = O(n), word case T(n) = O(n^2)

