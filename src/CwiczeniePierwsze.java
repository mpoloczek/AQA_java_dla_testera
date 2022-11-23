public class CwiczeniePierwsze {
    public static void main(String[] args) {

        int a = 2123;
        int b = 6;
        int c = 4;
        int d = 8;

        int suma = a + b;
        int suma2 = c + d;

        if (suma % 2 == 0 && suma2 % 2 == 0) {
            System.out.println("wszystkie liczby są parzyste");
        } else {
            System.out.println("nie wszystkie liczby są parzyste");
        }


    }

}
