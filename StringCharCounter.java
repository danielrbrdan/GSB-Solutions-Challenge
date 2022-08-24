import java.util.*;

class StringCharCounter {
    public static void main(String[] args) {
        String str = readString();
        str = clear(str);
        System.out.println("Original String: " + str);
        printEachCharCount(str);

    }

    // Print content
    private static void printEachCharCount(String str) {
        Set<Character> set = new HashSet<>();
        for (char ch : str.toCharArray()) {
            if (set.add(ch))
                System.out.println(ch + " : " + str.chars().filter(s -> s == ch).count());
        }
    }

    // Capture typed word
    private static String readString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write your word:");
        String str = sc.nextLine();
        sc.close();
        return str;
    }

    // Remove whitespaces and numeric values
    public static String clear(String str) {
        str = str.replaceAll("\\s+", "");
        str = str.replaceAll("\\d", "");
        return str;
    }

}