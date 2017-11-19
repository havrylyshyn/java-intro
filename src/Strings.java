public class Strings {
    public static final String STRING = "Hello World!";

    public Strings() {
        getCharFromString(STRING, 11);
        concat("Hello ", "World!");
        isEndsWith(STRING, "World!");
        isEqual(STRING, "hello world!");
        isEqualWithIgnoreCase(STRING, "hello world!");
        getLength(STRING);
        replaceChar(STRING, 'o', 'O');
        splitStrings(STRING, " ");
        isStartWith(STRING, "Hello");
        getSubstring(STRING, 3, 9);
        getStringToLowerCase(STRING);
        getStringToUpperCase(STRING);
        trimString(" Hello World! ");
    }

    public static void getCharFromString(String string, int c) {
        System.out.println(string.charAt(c));
    }

    public static void concat(String string, String string1) {
        System.out.println(string.concat(string1));
    }

    public static void isEndsWith(String string, String suffix) {
        System.out.println(string.endsWith(suffix));
    }

    public static void isEqual(String string, Object object) {
        System.out.println(string.equals(object));
    }

    public static void isEqualWithIgnoreCase(String string, String string1) {
        System.out.println(string.equalsIgnoreCase(string1));
    }

    public static void getLength(String string) {
        System.out.println(string.length());
    }

    public static void replaceChar(String string, char a, char b) {
        System.out.println(string.replace(a, b));
    }

    public static void splitStrings(String string, String reg) {
        for (String s : string.split(reg)) {
            System.out.println(s);
        }
    }

    public static void isStartWith(String string, String prefix) {
        System.out.println(string.startsWith(prefix));
    }

    public static void getSubstring(String string, int startIndex, int endIndex) {
        System.out.println(string.substring(startIndex, endIndex));
    }

    public static void getStringToLowerCase(String string) {
        System.out.println(string.toLowerCase());
    }

    public static void getStringToUpperCase(String string) {
        System.out.println(string.toUpperCase());
    }

    public static void trimString(String string) {
        System.out.println(string.trim());
    }

    public static void asd() {

    }
}
