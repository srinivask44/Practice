
public class Recursion {



    public static String reverse(String str) {
        // base case
        if (str.length() == 0) {
            return str;
        }
        // recursive call
        return reverse(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[] args) {

        String str = "SRINIVAS";
        String reversedStr = reverse(str);

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversedStr);
    }
}
