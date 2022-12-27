import java.util.*;
import java.text.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.print("enter str: ");
        String str = scan.nextLine();
        System.out.print("enter seps: ");
        String seps = scan.nextLine();
        System.out.print("enter int: ");
        Integer to_find = scan.nextInt();
        ArrayList<String>tokens = new ArrayList<>();
        ArrayList<Integer>nums = new ArrayList<>();
        ArrayList<String>palindroms = new ArrayList<>();
        StringTokenizer token = new StringTokenizer(str, seps);
        int i = 0;
        int index = -1;
        while(token.hasMoreTokens()) {
            tokens.add(token.nextToken());
            if(isNumeric(tokens.get(i))) {
                nums.add(Integer.parseInt(tokens.get(i)));
            }
            else{
                if(isPalindrom(tokens.get(i), 0, tokens.size()-1)) {
                    palindroms.add(tokens.get(i));
                }
            }
            i++;
        }
        System.out.println("tokens: " + tokens);
        System.out.println("nums: " + nums);
        System.out.println("palindroms: " + palindroms);
        for (i = 0; i < tokens.size(); i++){
            if(isNumeric(tokens.get(i))){
                if(to_find == Integer.parseInt(tokens.get(i))){
                    index = i;
                    break;
                }
            }
        }
        if (index == -1){
            System.out.println("there is no: " + to_find);
        }
        else {
            System.out.println("index " + to_find + ": " + index);
            index = str.lastIndexOf(String.valueOf(to_find));

            String new_str = String.valueOf(-to_find);
            new_str += str;
            System.out.println("str: " + str);
        }
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
}
