public class Operatory {
    public static void main(String[] args) {

        //operatory matematyczne
        System.out.println(10 + 10);
        System.out.println(10 - 10);
        System.out.println(10 * 10);
        System.out.println(10 / 10);

        System.out.println((double) 10 / 4);
        System.out.println(10.0 / 4.0);


        double x = 10;
        double y = 4;

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);


        //operatory porównania

        int numOne = 1;
        int numTwo = 2;
        System.out.println(numOne > numTwo);
        System.out.println(numOne < numTwo);
        System.out.println(numOne == numTwo);
        System.out.println(numOne != numTwo);

        //operatory logiczne
        // || - lub
        System.out.println(numOne > numTwo || numOne == 1); // fałsz || prawda -> prawda
        System.out.println(numOne > numTwo || numOne != 1); // fałsz || falsz -> fałsz
        System.out.println(numOne < numTwo || numOne != 1); // prawda || nie jest sprawdzana -> prawda

        // && - i
        System.out.println(numOne < numTwo && numOne == 1); // prawda i prawda -> prawda
        System.out.println(numOne > numTwo && numOne == 1); // fałsz i prawda -> fałsz
        System.out.println(numOne > numTwo && numOne != 1); // fałsz || fałsz -> fałsz

        if (numOne < numTwo) {
            System.out.println("number one is less than number two");
        } else {
            System.out.println("number one is greater than number two");
        }

        String homePage = "HomePage";
        String loginPage = "Login";
        String contactPage = "Contact";

        String page = homePage;

        switch (page) {
            case "HomePage":
                System.out.println("Przełączam się do strony HOME");
                break;
            case "Login":
                System.out.println("Przełączam się do strony LOGIN");
                break;
            case "Contact":
                System.out.println("Przełączam sie do stron Contact");
                break;
            default:
                System.out.println("Nie znam takiej storny");
        }
    }
}
