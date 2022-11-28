public class User {

    // 1. POLA OBIEKTU
    // OPISUJĄ Z CZEGO BĘDZIE SKŁADAŁ SIĘ DANY OBIEKT

    String firstName;
    String lastName;
    String email;
    int age;
    boolean isAdult;

    // 3. KONSTRUKTOR
    // DOMYSLNY KONSTRUKTOR - TWORZY PUSTY OBIEKT

    // NAZWA KONSTRUKTORA JEST TAKA SAMA JAK NAZWA KLASY
    // KONSTRUKTOR PISZEMY WIELKĄ LITERĄ
    // KONSTRUKTOR NIE MA ZWRACANEGO TYPU
    User(String firstName, String lastName, String email, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.isAdult = isUserAdult();

    }

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

    void greetings(String firstName, String lastName) {
        System.out.println("HI " + firstName + " " + lastName + ". Nice to see you");
    }


    void howOldAreYou(String name, int userAge) {
        System.out.println("HI " + name + " you are " + userAge + " old");
    }

    int yourAgePlus10(int userAge) {
        return userAge + 10;
    }

}

