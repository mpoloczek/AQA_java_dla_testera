public class User {

    // 1. POLA OBIEKTU
    // OPISUJĄ Z CZEGO BĘDZIE SKŁADAŁ SIĘ DANY OBIEKT

    String firstName;
    String lastName;
    String email;
    int age;
    boolean isAdult;

    // 2. METODY
    // OPISUJĄ CO DANY OBIEKT BĘDZIE MÓGŁ ZROBIĆ

    // zwracany typ + nazwa metody
    void getFullName() {
        // ciało metody
        System.out.println(firstName + " " + lastName);
    }

    void getAllInfo() {
        System.out.println(firstName + " " + lastName + " " + email + " " + age + " " + isAdult);
    }

    int getUserAge() {
        return age;
    }

    boolean isUserAdult() {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    void greetings(String name) {
        System.out.println("HI " + name + ". Nice to see you");
    }

}

