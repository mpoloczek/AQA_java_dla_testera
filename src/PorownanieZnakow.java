public class PorownanieZnakow {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));

        String s = str1.toUpperCase();
        System.out.println(s);

        String s1 = str1.toLowerCase();
        System.out.println(s1);

        boolean startsWith = str1.startsWith("He");
        System.out.println(startsWith);

        System.out.println(str1.endsWith("lo"));

        System.out.println(str1.contains("ll"));

        //czy tekst jest pusty
        //sprawdza długość stringa ignorując spacje
        System.out.println("".isBlank());
        //sprawdza długość stringa wliczając w to spacje
        System.out.println("".isEmpty());

        String replace = str1.replace("llo", "QWE");
        System.out.println(replace);

        String s3 = str1.replaceAll("l", "x");
        System.out.println(s3);

        //wyciąga z danego tekstu mniejszy wyraz
        String substring = str1.substring(1, 4);
        System.out.println(substring);


        String textWithWhiteSpaces = "     to jest jakiś text    ";
        System.out.println(textWithWhiteSpaces.length());

        //usówa wszystkie spacje przed i za tekstem
        String strip = textWithWhiteSpaces.strip();
        System.out.println(strip.length());


    }
}
