package String;

public class StringMethodsDemo {
    public static void main(String[] args) {

        String str = "Hello World";

        // length()
        System.out.println("Length: " + str.length());

        // charAt()
        System.out.println("Character at index 1: " + str.charAt(1));

        // substring()
        System.out.println("Substring (0-5): " + str.substring(0, 5));

        // equals()
        String str2 = "Hello World";
        System.out.println("Equals: " + str.equals(str2));

        // equalsIgnoreCase()
        String str3 = "hello world";
        System.out.println("Equals Ignore Case: " + str.equalsIgnoreCase(str3));

        // toUpperCase()
        System.out.println("Uppercase: " + str.toUpperCase());

        // toLowerCase()
        System.out.println("Lowercase: " + str.toLowerCase());

        // trim()
        String str4 = "   Java   ";
        System.out.println("Trim: '" + str4.trim() + "'");

        // replace()
        System.out.println("Replace: " + str.replace("World", "Java"));

        // contains()
        System.out.println("Contains 'World': " + str.contains("World"));

        // startsWith()
        System.out.println("Starts with 'Hello': " + str.startsWith("Hello"));

        // endsWith()
        System.out.println("Ends with 'World': " + str.endsWith("World"));

        // indexOf()
        System.out.println("Index of 'o': " + str.indexOf('o'));

        // lastIndexOf()
        System.out.println("Last Index of 'o': " + str.lastIndexOf('o'));

        // concat()
        System.out.println("Concat: " + str.concat(" Java"));

        // isEmpty()
        String str5 = "";
        System.out.println("Is Empty: " + str5.isEmpty());

        // compareTo()
        String a = "Apple";
        String b = "Banana";
        System.out.println("CompareTo: " + a.compareTo(b));

        // split()
        String sentence = "Java is easy";
        String[] words = sentence.split(" ");
        System.out.println("Split words:");
        for(String word : words){
            System.out.println(word);
        }
    }
}
