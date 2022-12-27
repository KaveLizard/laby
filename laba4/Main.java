import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.print("string: ");
        String str = scanner.nextLine();
        System.out.print("seps: ");
        String seps = scanner.nextLine();
        System.out.print("int P: ");
        String P = scanner.next();
        String tmp;

        StringTokenizer token = new StringTokenizer(str, seps);
        ArrayList<String> list_tokens = new ArrayList<String>(0);
        ArrayList<String> list_words = new ArrayList<String>(0);
        ArrayList<String> list_palindroms = new ArrayList<String>(0);
        while (token.hasMoreTokens()) {
            tmp = token.nextToken();
            list_tokens.add(tmp);
            if (!isNumeric(tmp)) {
                list_words.add(tmp);
            }
        }
        System.out.print("tokens: ");
        list_tokens.forEach((String s) -> System.out.printf("%s ", s));
        System.out.printf("%n");

        int[] int_array = new int[100];
        int int_array_size = 0;
        for (String g : list_tokens) {
            try {
                int_array[int_array_size] = Integer.parseInt(g);
            } catch (NumberFormatException e) {
                --int_array_size;
            }
            ++int_array_size;
        }
        System.out.print("numbers: ");
        for (int j = 0; j < int_array_size; j++) {
            System.out.print(int_array[j] + " ");
        }
        System.out.printf("%n");

        Pattern pattern = Pattern.compile("([" + seps + "]|^)(" + P + ")([" + seps + "]|$)");
        Matcher matcher = pattern.matcher(str);
        StringBuffer main_string_buf = new StringBuffer(str);
        if (matcher.find()) {
            System.out.printf("position P: %d%n", matcher.start() + 1);
            Integer p = Integer.parseInt(P, 10);
            p *= -1;
            int index = main_string_buf.lastIndexOf(P);
            main_string_buf.delete(index, index + P.length());
            System.out.print(String.format("str without last P: %s%n", main_string_buf));
            main_string_buf.insert(0, p.toString() + " ");
            System.out.print(String.format("str with -P: %s%n", main_string_buf));
        } else {
            System.out.printf("there is no P %n");
        }
        System.out.print("palindroms: ");
        list_words.forEach((String s) -> {
            if (isPalindrom(s, 0, s.length() - 1)) {
                System.out.printf("%s ", s);
                list_palindroms.add(s);
            }
        });

        Collections.sort(list_palindroms, (String a, String b) -> a.length()%2 - b.length()%2);
        System.out.printf("%n");
        System.out.print("sorted palindroms: ");
        list_palindroms.forEach((String s) -> System.out.printf("%s ", s));
    }
    public static boolean isPalindrom(String str, int leftBorder, int rightBorder)
    {
        while(leftBorder <= rightBorder)
        {
            if(str.charAt(leftBorder) != str.charAt(rightBorder))
            {
                return false;
            }
            ++leftBorder;
            --rightBorder;
        }
        return true;
    }
    public static boolean isNumeric(String string) {
        int intValue;
        if(string == null || string.equals("")) {
            return false;
        }

        try {
            intValue = Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
        }
        return false;
    }
}
